import sympy as sp;

def CVaR(loss, VaR):
    numValid = 0
    sum = 0
    for i in range(len(loss)):
        if loss[i] > VaR:
            numValid += 1
            sum += loss[i]
    return sum/numValid

def theoCVAR(dist, dx, VaR):
    return (1/1-VaR)*sp.integrate(dist, (dx, -1, VaR))
