import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class deleteDoubles {

    public static Object format(ArrayList input) {


        Object distinctElements =  input.stream()
                .distinct()
                .collect(Collectors.toList());


        return distinctElements;

    }
}
