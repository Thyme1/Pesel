public class check {

    public static boolean correct(String tempPesel) {
        try {
            char charAtEleven = tempPesel.charAt(10);
            int numAtEleven = Character.getNumericValue(charAtEleven);

            int checkSum = (9 * Character.getNumericValue(tempPesel.charAt(0)) +
                    7 * Character.getNumericValue(tempPesel.charAt(1)) +
                    3 * Character.getNumericValue(tempPesel.charAt(2)) +
                    Character.getNumericValue(tempPesel.charAt(3)) +
                    9 * Character.getNumericValue(tempPesel.charAt(4)) +
                    7 * Character.getNumericValue(tempPesel.charAt(5)) +
                    3 * Character.getNumericValue(tempPesel.charAt(6)) +
                    Character.getNumericValue(tempPesel.charAt(7)) +
                    9 * Character.getNumericValue(tempPesel.charAt(8)) +
                    7 * Character.getNumericValue(tempPesel.charAt(9))) % 10;

            if ((tempPesel.length() != 11)) {
                throw new IllegalArgumentException("Pesel musi zawierac 11 cyfr: " + tempPesel);
            }
            if (numAtEleven != (checkSum)) {
                throw new IllegalArgumentException("Niepoprawny nr PESEL: " + tempPesel);
            }
        } catch (IllegalArgumentException ie) {
            System.out.println(ie);
            return false;
        } catch (StringIndexOutOfBoundsException oob) {
            System.out.println("Pesel musi zawierac 11 cyfr");
            return false;
        }
        return true;
    }

    }

