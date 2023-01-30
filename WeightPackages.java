import java.util.Scanner;

  class WeightPackages{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter the mass of package in grams:");
      double mass = sc.nextDouble();

     System.out.println("Enter the number of packages:");
      double number = sc.nextDouble();

     double weight = mass /1000;
     double packagenumber = number/ weight;
    
     System.out.println("The weight of package is" + weight + "kilograms");
     System.out.println("It takes " + packagenumber +" such packages to form one kilogram.");

  }
}