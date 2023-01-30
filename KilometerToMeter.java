import java.util.Scanner;

class KilometerToMeter{

  public static void main(String[] args){

   Scanner sc = new Scanner(System.in);

   System.out.println("Enter the measurement in kilometers:");
     double measurement = sc.nextDouble();

     double meters = measurement *1000;


   System.out.println( measurement + "kilometers =" + meters + "meters.");
 
 }
}