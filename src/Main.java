import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        DevTest.nonZeroLenString(in, "Enter your name");
        System.out.println();
        DevTest.getInt(in, "Enter an integer");
        System.out.println();
        DevTest.getDouble(in, "Enter a double");
    }
}