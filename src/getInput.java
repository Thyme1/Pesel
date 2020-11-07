import java.util.ArrayList;
import java.util.Scanner;

public class getInput {

    public static ArrayList<String> giveInput(){
        String runAgain = "t";
        Scanner scanner = new Scanner(System.in);
        String tempPesel; //aktualnie przetwarzany pesel
        ArrayList<String> listaPeseli = new ArrayList<>();

        do{
            System.out.println("Podaj numer PESEL: ");
            tempPesel = scanner.nextLine();

            if(!check.correct(tempPesel)) //Sprawdzamy poprawność peselu
                continue;

            listaPeseli.add(tempPesel);

            System.out.println("Czy chcesz dodac kolejnego mieszkanca?(t/n): ");
            runAgain = scanner.nextLine();


        } while (runAgain.equals("t"));

        scanner.close();

        return listaPeseli;
    }

}
