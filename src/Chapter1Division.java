/**
 * Chapter 1
 *
 * Write a program that displays the result
 *
 * Michael Autry - 8/1/17
 */

public class Chapter1Division
{
    public static void main(String[] args)
    {
        float num = (float)((9.5 * 4.5 - 2.5 * 3)/(45.5 - 3.5));
        System.out.print("\nThe result of (9.5 * 4.5 - 2.5 * 3)/(45.5 - 3.5) is " + num + "  or ");
        /**
         * I added a line that shortens the number to two decimal points.
         */
        System.out.printf("%.2f", num);
    }
}
