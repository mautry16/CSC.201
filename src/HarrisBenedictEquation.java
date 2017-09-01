/**
 * The Harris-Benedict equation estimates the number of calories your body needs
 * to maintain your weight, if you do no exercise.
 *
 * Purpose of this code is to output the number of chocolate bars that should be consumed
 *  to maintain one's body weight for both a woman and a man.
 *
 *  Michael Autry - 8/31/17
 */

import java.util.Scanner;

public class HarrisBenedictEquation
{

    public static void main(String[] args)
    {
        String Male = "M";
        String Female = "F";
        int ChocolateBar = 230;
        int Maintain;

        Scanner keyboard = new Scanner(System.in);

        while (true)
        {
            System.out.print("Enter 'M' for male or 'F' for female: ");
            String Gender = keyboard.next();
            System.out.print("Enter your weight in pounds: ");
            double Pounds = keyboard.nextDouble();
            System.out.print("Enter your height in inches: ");
            int Height = keyboard.nextInt();
            System.out.print("Enter your age: ");
            int Age = keyboard.nextInt();

            System.out.println(" ");

            if (Gender.equalsIgnoreCase(Male)) {
                double MaleBMR = 66 + (6.3 * Pounds) + (12.9 * Height) - (6.8 * Age);
                Maintain = (int)(MaleBMR/ChocolateBar);
                System.out.println("You would need " + Maintain + " chocolate bars to maintain your body weight.");
                System.out.println(" ");
            } else if (Gender.equalsIgnoreCase(Female)) {
                double FemaleBMR = 655 + (4.3 * Pounds) + (4.7 * Height) - (4.7 * Age);
                Maintain = (int)(FemaleBMR/ChocolateBar);
                System.out.println("You would need " + Maintain + " chocolate bars to maintain your body weight.");
                System.out.println(" ");
            } else {
                System.out.println("Error.Please Try again.");
                System.out.println(" ");
            }
        }
    }
}
