import java.io.*;
import java.util.List;
import java.util.Random;

public class PersonGenerator {

    public static void main(String[] args) throws IOException {


        Random random = new Random();

        File name = new File("Name.txt");
        File people = new File("GeneratedPeople.txt");

        FileReader fileReader = new FileReader(name);
        FileWriter fileWriter = new FileWriter(people);

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);


        List<String> person = bufferedReader.lines().toList();

        for (String names : person) {
            int minSalary = random.nextInt(601) + 400; // От 400 до 1000
            int maxSalary = random.nextInt(1601) + minSalary; // От minSalary до 2000
            String[] persons = names.split(" ");
            String gender = (persons[0].endsWith("a")) ? "FEMALE" : "MALE";

            String personInfo = "PERSON: " + names + " " + minSalary + " " + maxSalary + " " + gender;
            bufferedWriter.write(personInfo);
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
    }
}
