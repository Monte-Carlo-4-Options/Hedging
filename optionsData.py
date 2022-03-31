import pandas as pd
import yfinance as yf
import requests as rq
import re

stock = yf.Ticker("SPY")
dates = ''
try:
    stock.option_chain("")
except ValueError as e:
    dates = (re.findall(r"\[.+",str(e))[0][1:-1]).replace(" ","").split(",")
    print(dates)
    file = open("dates.text", "w")
    for i in dates:
        file.write(i + "\n")
    file.close()

for i in dates:
    data = stock.option_chain(i)
    data.calls.to_csv(f"optionsData/{i}_Calls.csv")
    data.puts.to_csv(f"optionsData/{i}_Puts.csv")


