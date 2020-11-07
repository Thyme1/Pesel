import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Stream;

public class writeToFile {
    public static void writeTFU(String fileName, ArrayList<String> listaPESEL) throws IOException {
        File file = new File(fileName);
        FileWriter writer = new FileWriter(file, false);

        writer.close();

    }
}
