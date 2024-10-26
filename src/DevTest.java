import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        String SSN = "";
        int getInt = 0;
        double getDouble = 0.0;
        String string = "";
        boolean yesNo = false;
        double temp = 0;

        SafeInput.prettyHeader("Message Centered Here");
        cToF(32);
    }
    public static double cToF(double celsius) {

        double requestedTemp = (celsius*9/5) + 32;

        System.out.printf("Celsius   |   Fahrenheit");
        System.out.println();
        for (int i=-100; i<=100; i++) {
            double fahrenheit = (i*9.0/5.0)+32.0;
            System.out.printf(i + "   |   " + fahrenheit);
            System.out.println();
        }
        return requestedTemp;
    }
}