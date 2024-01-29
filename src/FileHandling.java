import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Scanner;
import java.io.FileWriter;

public class FileHandling {
    // Create a new Java Application and then inside of your main method you should be able to read
    // from a file called oscar_age_female.csv containing some data that has the columns
    // Index, Year, Age, Name, Movie in csv format, then print it in a new file called result.txt

    public static void main(String[] args) throws IOException {

            File csv = new File("data/oscar_age_female.csv");
            Scanner scanner = new Scanner(csv);

            FileWriter writer = new FileWriter("data/result.txt", true);
            int year = Calendar.getInstance().get(Calendar.YEAR);
            int lineNum = 1;

            while (scanner.hasNextLine()) {
                lineNum++;
                String line = scanner.nextLine();

                if (lineNum > 4) {
                    String[] lineArr = line.split(", ");
                    writer.write("Name: " + lineArr[3] + "\n");
                    writer.write("Year: " + (year - Integer.parseInt(lineArr[1])) + "\n");
                    writer.write("Age: " + lineArr[2] + "\n");
                    writer.write("Movie: " + lineArr[4] + "\n");
                    writer.write("=============== \n");
                }
            }

            scanner.close();
            writer.close();
    }
}
