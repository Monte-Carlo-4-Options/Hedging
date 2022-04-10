import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.io.IOException;
import java.util.Arrays;
import java.io.File;

public class processOptionsData {
    private List<CallOption> call = new ArrayList<>();
    private List<CallOption> callWrite = new ArrayList<>();
    private List<PutOption> put = new ArrayList<>();

    public List<CallOption> getCall() {
        return call;
    }
    public List<CallOption> getCallWrite() {
        return callWrite;
    }
    public List<PutOption> getPut() {
        return put;
    }
    public processOptionsData() {
        String line = "";
        String splitBy = ",";
        try {
            // parsing a CSV file into BufferedReader class constructor
            File path = new File("optionsData/");
            File[] files = path.listFiles();
            for (File i : files){
                if (i.getName().contains("Write")) {
                    BufferedReader br = new BufferedReader(new FileReader(i));
                    br.readLine();
                    while ((line = br.readLine()) != null) {
                        String[] option = line.split(splitBy);
                        callWrite.add(new CallOption(
                                option[1],
                                option[2],
                                Double.parseDouble(option[3]),
                                Double.parseDouble(option[4]),
                                Double.parseDouble(option[5]),
                                Double.parseDouble(option[6]),
                                Double.parseDouble(option[7]),
                                Double.parseDouble(option[8]),
                                (int) Double.parseDouble(option[9]),
                                (int) Double.parseDouble(option[10]),
                                Double.parseDouble(option[11]),
                                Boolean.parseBoolean(option[12]),
                                option[13],
                                option[14]));
                    }
                    br.close();
                } else if (i.getName().contains("Puts")) {
                    BufferedReader br = new BufferedReader(new FileReader(i));
                    br.readLine();
                    while ((line = br.readLine()) != null) {
                        String[] option = line.split(splitBy);
                        put.add(new PutOption(
                                option[1],
                                option[2],
                                Double.parseDouble(option[3]),
                                Double.parseDouble(option[4]),
                                Double.parseDouble(option[5]),
                                Double.parseDouble(option[6]),
                                Double.parseDouble(option[7]),
                                Double.parseDouble(option[8]),
                                (int) Double.parseDouble(option[9]),
                                (int) Double.parseDouble(option[10]),
                                Double.parseDouble(option[11]),
                                Boolean.parseBoolean(option[12]),
                                option[13],
                                option[14]));
                    }
                    br.close();
                } else {
                    BufferedReader br = new BufferedReader(new FileReader(i));
                    br.readLine();
                    while ((line = br.readLine()) != null) {
                        String[] option = line.split(splitBy);
                        call.add(new CallOption(
                                option[1],
                                option[2],
                                Double.parseDouble(option[3]),
                                Double.parseDouble(option[4]),
                                Double.parseDouble(option[5]),
                                Double.parseDouble(option[6]),
                                Double.parseDouble(option[7]),
                                Double.parseDouble(option[8]),
                                (int) Double.parseDouble(option[9]),
                                (int) Double.parseDouble(option[10]),
                                Double.parseDouble(option[11]),
                                Boolean.parseBoolean(option[12]),
                                option[13],
                                option[14]));
                    }
                    br.close();
                }
            }
            System.out.println(call);
            System.out.println(callWrite);
            System.out.println(put);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        processOptionsData pd = new processOptionsData();
        System.out.println(pd.getPut());
        System.out.println(pd.getCall());
        System.out.println(pd.getCallWrite());
    }
}
