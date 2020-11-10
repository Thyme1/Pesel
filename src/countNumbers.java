import java.util.List;

public class countNumbers {
    public static long getReady(List<String> formattedInput) {

        return formattedInput.stream()
                .count();
    }
}
