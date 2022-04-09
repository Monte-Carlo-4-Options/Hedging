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
            int counter = 0;
            br.readLine();
            while ((line = br.readLine()) != null) {
                System.out.print(counter);
                counter++;
                String[] option = line.split(splitBy); // use comma as separator
                options.add(new Option(
                        option[1],
                        option[2],
                        (int) Double.parseDouble(option[3]),
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
            System.out.println(options);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
