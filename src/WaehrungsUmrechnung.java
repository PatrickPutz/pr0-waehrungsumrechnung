import java.util.Scanner;

public class WaehrungsUmrechnung {
    public static void main(String[] args) {
        double value = 0.0;

        // scan for value for calculation
        System.out.println("Welcome to the € - $ calculator!");
        System.out.print("Enter the value you'd like to have calculated: ");
        Scanner getValue = new Scanner(System.in);
        value = getValue.nextDouble();

        // calculate and print $ and € calculation
        System.out.println(value + "$ = " + (value * 0.85) + "€");
        System.out.println(value + "€ = " + (value / 85 * 100) + (" $"));
    }
}
