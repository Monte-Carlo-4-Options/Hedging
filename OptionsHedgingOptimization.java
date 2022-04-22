import java.util.*;

public class OptionsHedgingOptimization {
    private List<PutOption> puts = new ArrayList<>();
    private List<CallOption> calls = new ArrayList<>();
    private List<CallOption> callsToWrite = new ArrayList<>();
    private double maxProfit;

    public OptionsHedgingOptimization(List<PutOption> puts, List<CallOption> calls, List<CallOption> callsToWrite) {
        this.puts = puts;
        this.calls = calls;
        this.callsToWrite = callsToWrite;
        maxProfit = bruteForceOptimize();
    }

    public double bruteForceOptimize() {
        List<List<? extends Option>> lists = new ArrayList<>();
        double maxProfit = 0.0;
        //first get containers using the subList method
        for (int i = 0; i < calls.size(); i++) {
            List<CallOption> subCalls =  calls.subList(0, i);
            List<CallOption> subCallsToWrite = callsToWrite.subList(0, i);
            List<PutOption> subPuts = puts.subList(0, i);


            double sum = 0;


            // Calculate option payoff for n
            for (CallOption c: subCalls) {
                sum += c.getValueBuy(spotPrice, strikePrice, premium);
            }

            // Calculate option payoff for m
            for (CallOption c: subCallsToWrite) {
                sum += c.getValueBuy(spotPrice, strikePrice, premium);
            }

            // Calculate option payoff for o
            for (PutOption p: subPuts) {
                sum += c.getValueBuy(spotPrice, strikePrice, premium);
            }

            if (sum > maxProfit) {
                maxProfit = sum;
            }

        }
        return maxProfit;
    }

    // Do same thing but for minLoss, to find the option premium



    ////Constraints!
    // 1. ?
    // 2. m <= n means calltoWrite.size() <= calls
    // 3. n <= o means calls.size() <= puts.size()


    public double getMaxProfit() {
        return maxProfit;
    }

}