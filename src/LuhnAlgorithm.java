import java.util.Scanner;

public class LuhnAlgorithm {
    public static void main( String[] args ) {
        System.out.println("Podaj numer, do którego ma być dodana cyfra kontrolna:");
        Scanner query = new Scanner(System.in);
        String stringNumber = query.nextLine();
        String[] Array = new String[stringNumber.length()];
        for (int i = 0; i < Array.length; i++) {
            String num = String.valueOf(stringNumber.charAt(i));
            Array[i] = num;
        }
        for (int i = Array.length; i > 0; i = i-2) {
            int intChecked = Integer.parseInt(Array[i - 1]);
            intChecked *= 2;
            if (intChecked % 10 > 0 || intChecked == 10) {
                Array[i - 1] = String.valueOf((intChecked / 10) + (intChecked % 10));
            }
        }
        int total = 0;
        for (int index = 0; index < Array.length; index++) {
            int arrInt = Integer.parseInt((Array[index]));
            total += arrInt;
        }

        int mod10 = total % 10;
        if (mod10 != 0){
            int codeNumber = 10 - mod10;
            String newNumber = stringNumber + codeNumber;
            System.out.println(newNumber);
        } else {
            String newNumber = stringNumber + "0";
        }
    }
}

