import java.util.Scanner;
class Computations
{
   public static void main(String args[])
    {
       Scanner myScanner = new Scanner(System.in);
       double no1, no2, no3, sum, prod, avg;
       
       System.out.println("\n Enter three numbers: ");
       no1 = myScanner.nextDouble();
       no2 = myScanner.nextDouble();
       no3 = myScanner.nextDouble();

       sum = no1 + no2 + no3;
       prod = no1 * no2 * no3;
       avg = sum/3;

      System.out.println("\nThe sum of the numbers is " + sum);
      System.out.println("\nThe product is " +prod);
      System.out.println("The average is " + avg);
   }
} 