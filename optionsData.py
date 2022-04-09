import pandas as pd
import yfinance as yf
import re

stock = yf.Ticker("SPY")
#todays_price = stock.history(period='1d')['Close'][0] // Note: In the real context this price should be the var loss i.e change
lower_var = 430
higher_var = 470
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
    #((data.calls['strike'] - higher_var ) - data.calls['ask']) > 0
    data.calls[data.calls["openInterest"] > 10][data.calls["volume"] > 10][data.calls["bid"] > .01][((higher_var - data.calls['strike']) + data.calls['ask'] <  0)].to_csv(f"optionsData/{i}_CallsWrite.csv")
    data.calls[data.calls["openInterest"] > 10][data.calls["volume"] > 10][data.calls["bid"] > .01][((data.calls['strike'] - lower_var ) - data.calls['ask']) > 0].to_csv(f"optionsData/{i}_Calls.csv")
    data.puts[data.puts["openInterest"] > 10][data.puts["volume"] > 10 ][data.puts["ask"] > .01][(data.puts['strike'] - lower_var) - data.puts['ask'] > 0].to_csv(f"optionsData/{i}_Puts.csv")


