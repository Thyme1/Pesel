import java.util.ArrayList;

public class countNumbers {
    public static long getReady(ArrayList<String> formattedInput) {

        return formattedInput.stream()
                .count();
    }
}
