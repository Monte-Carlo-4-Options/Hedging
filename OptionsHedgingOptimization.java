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
        //first get containers using the subList method
        for (int i = 0; i < calls.size(); i++) {
            List<CallOption> subListOfCalls =  calls.subList(0, i);
        }
        return 0.0;
    }

    public double getMaxProfit() {
        return maxProfit;
    }

}