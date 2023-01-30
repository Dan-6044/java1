import java.util.Scanner;

 class RightAngledTriangle{
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter the base of triangle");
     double base = sc.nextDouble();

     System.out.println("Enter the height of triangle");
     double height = sc.nextDouble();

    double area = (base * height) /2;

     System.out.println("The area of the right angled triangle is" + area);
  }
}
     