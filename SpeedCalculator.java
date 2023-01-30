import java.util.Scanner;
 
 class SpeedCalculator {

   public  static void main(String[] args){
     Scanner sc = new Scanner(System.in);


     System.out.print("Enter the distance covered in meters:");
       double distance = sc.nextDouble();

     System.out.print("Enter the distance covered in meters:");
       double time = sc.nextDouble();

    
     double speed = (distance/1000) / (time/60);

     System.out.println("Speed: " + speed + "km/h");

  }
}
