import java.io.*;
import java.util.List;
import java.util.Random;

public class PensionFundGenerator {
    public static void main(String[] args) throws IOException {

        Random random = new Random();


        File fund = new File("Fund.txt");
        File generatedFund = new File("GeneratedFunds.txt");

        FileReader fileReader = new FileReader(fund);
        FileWriter fileWriter = new FileWriter(generatedFund);

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        List<String> fundNames = bufferedReader.lines().toList();

        for (String fundName : fundNames) {
            boolean states = random.nextBoolean();
            String fundInfo = "FUND: " + fundName + ", " + states;
            bufferedWriter.write(fundInfo);
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
    }
}
