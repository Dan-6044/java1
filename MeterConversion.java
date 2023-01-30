import java.util.Scanner;

class MeterConversion{

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the dimension in cm:");
    double cm = sc.nextDouble();

    double meters = cm / 100;

    System.out.println(cm + "cm =" + meters+ " meters.");
    
  }
}