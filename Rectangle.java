import java.util.Scanner;

 class Rectangle
 {

    public static void main(String[] args)
    {
      
      Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter the length of the rectangle:");
        double length = sc.nextDouble();

        System.out.println("\nEnter the width of the rectangle:");
        double width = sc.nextDouble();


        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("\n The area of the rectangle is:" + area);
        System.out.println("\n The perimeter of the rectangle is:" + perimeter);

  }
}