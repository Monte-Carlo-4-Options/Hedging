# Hedging


VaR with some alpha is defined as the maximum amount we can expect to lose with <em>likelihood</em> p = 1 - alpha, where alpha is a defined confidence interval (a common value 0.05).

Let's elaborate on what that means, as this will be our primary focus. Let's start with an example. A bank is trading for 100 days with some VaR = 1mil and has coverage alpha = 0.99. This means that the probability that we lose more than than the VaR is p = 1 - 0.99 = 1% of the days.

With this example, we can see that a high VaR measures worst-case outcomes. This can be very helpful, but also has downsides if the underlying distribution is incorrect, as we shall see later.

In experimentation.py, I have initilized a historical model based on normally distributed returns to model VaR. This