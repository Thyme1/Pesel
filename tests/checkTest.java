

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class checkTest {

    @Test
    @DisplayName("Check if pesel has 11 characters")
    void correctNumberOfCharacters() {
        check checkCorrect = new check();
        boolean expected = false;
        boolean actual = checkCorrect.correct("123");
        assertEquals(expected, actual);
    }

   @Test
   @DisplayName("Check if pesel is incorrect")
   void incorrectPesel() {
        check checkCor = new check();
        boolean expected = false;
        boolean actual = checkCor.correct("12345678912");
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Check if pesel is correct")
    void correctPesel() {
        check checkCor = new check();
        boolean expected = true;
        boolean actual = checkCor.correct("47042146521");
        assertEquals(expected, actual);
    }

}

class deleteDoublesTest {

    @Test
    @DisplayName("Check if there are no multiple PESEL numbers")
    void multipleNumbers() {
        deleteDoubles formmInput = new deleteDoubles();
        ArrayList<String> listaPeseli = new ArrayList<>();

        listaPeseli.add("71090767942");
        listaPeseli.add("82030867314");
        listaPeseli.add("71090767942");

        List<String> expected = new ArrayList<String>();
        expected.add("71090767942");
        expected.add("82030867314");

        Object actual = formmInput.format(listaPeseli);
        assertEquals(expected, actual);
    }


}





