import java.util.ArrayList;

public class countNumbers {
    public static long getReady(ArrayList formattedInput) {

        long count = formattedInput.stream()
                .count();
        return count;
    }
}
