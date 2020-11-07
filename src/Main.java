import java.io.IOException;
import java.util.ArrayList;

public class Main {
public static void main(String[] args) throws IOException {
    ArrayList input = getInput.input();
    Object formattedInput = deleteDoubles.format(input);
    final_pesel = finalFormat.getReady(formattedInput);

    String fileName = "Lista PESEL " + System.currentTimeMillis() + ".txt";
    writeToFile.writeTFU(fileName, input);







}
}
