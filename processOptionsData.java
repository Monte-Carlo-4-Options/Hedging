import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.io.IOException;

public class processOptionsData {
    public static void main(String[] args) {
        String line = "";
        String splitBy = ",";
        try {
            // parsing a CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader("optionsData/2022-04-04_Calls.csv"));
            ArrayList<Option> options = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                // fix boolean value
                String[] option = line.split(splitBy); // use comma as separator
                options.add(new Option(option[0], option[1], Integer.parseInt(option[2]),
                        Double.parseDouble(option[3]), Double.parseDouble(option[4]), Double.parseDouble(option[5]),
                        Double.parseDouble(option[6]), Integer.parseInt(option[6]), Integer.parseInt(option[7]), Integer.parseInt(option[8]), Boolean.parseBoolean(option[9]),
                        option[10], option[11]));
            }
            br.close();
            System.out.println(options);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}