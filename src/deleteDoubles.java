import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class deleteDoubles {

    public static List<String> format(ArrayList <String>  input) {


        return  input.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());

    }
}
