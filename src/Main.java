import java.io.IOException;
import java.util.ArrayList;

public class Main {
public static void main(String[] args) throws IOException {
    ArrayList <String> input = getInput.giveInput();
    ArrayList <String>  formattedInput = deleteDoubles.format(input);
    long numberOfPesels = countNumbers.getReady(formattedInput);

    String fileName = "Lista PESEL " + System.currentTimeMillis() + ".txt";
    writeToFile.writeTFU(fileName, formattedInput, numberOfPesels);

    }
}
