package ReadAndWriteFile;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\Quim\\Documents\\quimmassague\\ReadAndWriteFile\\textFile.txt");
        Scanner in = new Scanner(file);
        String fileContent;

        fileContent = "";
        while (in.hasNextLine()) {
            fileContent += in.nextLine() + ";";
        }

        fileContent = fileContent.substring(0, fileContent.length() - 1);

        FileWriter writer = new FileWriter("C:\\Users\\Quim\\Documents\\quimmassague\\ReadAndWriteFile\\newTextFile.txt");
        writer.write(fileContent);
        writer.close();
        in.close();
    }
}