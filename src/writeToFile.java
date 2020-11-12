import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Stack;

public class writeToFile {
    public static void writeTFU(String fileName, List<String> listaPESEL, Stack<Long> numOfPeselsStack) throws IOException {
        File file = new File(fileName);
        FileWriter writer = new FileWriter(file, false);
        writer.write("Liczba numerow PESEL w pliku wynosi: " + numOfPeselsStack.peek() + "\n" );
        listaPESEL.stream().forEach(str -> {
            try {
                writer.write(str + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        writer.close();

    }
}
