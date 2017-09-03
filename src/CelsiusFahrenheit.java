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

            if (Type.equalsIgnoreCase(Celsius)) {
                int F_C = 5 * (temp - 32) / 9;
                System.out.print("\n" + temp + " degrees Fahrenheit = " + F_C + " degrees Celsius.");
                System.out.println(" ");
            } else if (Type.equalsIgnoreCase(Fahrenheit)) {
                int C_F = (9 * (temp / 5)) + 32;
                System.out.print("\n" + temp + " degrees Celsius = " + C_F + " degrees Fahrenheit");
                System.out.println(" ");
            } else {
                System.out.print("\nError.");
                break;
            }
        }
    }
}
