import java.util.Scanner;

  class Voting
   {
     public static void main(String[] args)
      {
     
        Scanner sc = new Scanner(System.in);

         int age = sc.nextInt();

         if (age >=18) {
         System.out.println("You can vote.");
         } else{
               System.out.println("You are too young to vote.");
              }
     
   }
} 