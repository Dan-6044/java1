import java.util.Scanner;

  public class Circle
    {
       public static void main(String args[])
       {
          Scanner sc = new Scanner(System.in);
          System.out.println("\nEnter the radius of a circle; ");
          double radius = sc.nextDouble();

          double circumference = 2 * Math.PI * radius;
          double area = Math.PI * radius * radius;

          System.out.println("\nThe circumference of the circle is: " + circumference);
          System.out.println("\nThe area of the circle is: "+ area);
   }
}
   