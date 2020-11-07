import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class deleteDoubles {

    public static ArrayList<String> format(ArrayList input) {


        ArrayList<String>  distinctElements = (ArrayList<String>) input.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());


        return distinctElements ;

    }
}
