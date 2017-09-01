/**
 *
 * Michael Autry - 8/31/17
 */

import java.util.Scanner;

public class CelsiusFahrenheit
{
    public static void main(String[] args)
    {
        String Type;
        String Fahrenheit = "F";
        String Celsius = "C";

        Scanner keyboard = new Scanner(System.in);

        while (true)
        {
            System.out.print("\nEnter a temperature: ");
            while (!keyboard.hasNextInt())
            {
                keyboard.next();
                System.out.print("Error. Try Again: ");
            }
            int temp = keyboard.nextInt();

            System.out.print("\nWould you like to convert to Celsius 'C' or Fahrenheit 'F': ");
            Type = keyboard.next();

                if (Type.equalsIgnoreCase(Fahrenheit)) {
                    int C_F = 5 * (temp - 32) / 9;
                    System.out.print("\n" + temp + " degrees Fahrenheit = " + C_F + " degrees Celsius.");
                    System.out.println(" ");
                } else if (Type.equalsIgnoreCase(Celsius)) {
                    int F_C = (9 * (temp / 5)) + 32;
                    System.out.print("\n" + temp + " degrees Celsius = " + F_C + " degrees Fahrenheit");
                    System.out.println(" ");
                } else {
                    System.out.print("\nError.");
                    break;
                }
        }
    }
}
