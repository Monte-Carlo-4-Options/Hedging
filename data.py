import pandas as pd
import numpy as np
import requests as rq
from pprint import pprint
import matplotlib.pyplot as plt
from scipy.stats import norm
def collect_data(stock):
    slice = np.empty((1,0))
    for i in range(1,6):
        slice = np.append(slice,[f"year1month{i}"])
    df = pd.DataFrame()
    for i in slice:
        data = pd.read_csv(f"https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY_EXTENDED&symbol={stock}&adjusted=true&interval=60min&slice={i}&apikey=DAEOW77ONK9OZWAS")
        df = pd.concat([df,data])
    print(df)
    df = df.reset_index()
    df.to_feather("data.feather")

def read_df():
    df = pd.read_feather("data.feather")
    df.set_index(df['time'],drop=True,inplace=True)
    del df['time']
    del df['index']
    df['dr'] = (df['close']).pct_change()
    return df.dropna()


def var(df, quantile, amount):
    value = amount * df['close'].iloc[0]
    return value * (1- (100 * df['dr'].quantile(.05)))

#collect_data('TQQQ')
df = read_df()
print(df.describe())
print(var(df,.05, 100))
plt.show()
