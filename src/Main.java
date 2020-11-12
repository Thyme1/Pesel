import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
public static void main(String[] args) throws IOException {
    ArrayList <String> input = getInput.giveInput();

    List<String> formattedInput = deleteDoubles.format(input);
    
    long numberOfPesels = countNumbers.getReady(formattedInput);

    Stack <Long> numOfPeselsStack = new Stack<>();
    numOfPeselsStack.push(numberOfPesels);

    String fileName = "Lista PESEL " + System.currentTimeMillis() + ".txt";
    writeToFile.writeTFU(fileName, formattedInput, numOfPeselsStack);

    }
}
