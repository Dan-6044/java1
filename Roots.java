import java.util.Scanner;

 class Roots{
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);

   System.out.print("Enter a number");
   double num = sc.nextDouble();

   double square = num * num;
   double cube = num* num * num;
   double sqrt = Math.sqrt(num);
   double cbrt = Math.cbrt(num);

   System.out.println("number:" +num);
   System.out.println("Square:" +square);
   System.out.println("Cube:" +cube);
   System.out.println("Square Root:" +sqrt);
   System.out.println("Cube Root:" +cbrt);

 }
}