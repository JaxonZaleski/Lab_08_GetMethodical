import java.util.Scanner;

public class DevTest {
    public static String nonZeroLenString(Scanner pipe, String prompt) {

        String retString = "";

        do {
            System.out.println("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);
        return retString;
    }
    public static int getInt(Scanner pipe, String prompt) {

        int enterInt = 0;
        boolean done = false;

        do {
            System.out.println("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                enterInt = pipe.nextInt();
                pipe.nextLine();
                done = true;
            } else {
                System.out.println("You must enter a number.");
                pipe.nextLine();
            }
        } while (!done);
        return enterInt;
    }
    public static double getDouble(Scanner pipe, String prompt) {

        double enterDouble = 0.0;
        boolean done = false;

        do {
            System.out.println("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {
                enterDouble = pipe.nextDouble();
                done = true;
            } else {
                System.out.println("You must enter a number.");
                pipe.nextLine();
            }
        } while(!done);
        return enterDouble;
    }
}
