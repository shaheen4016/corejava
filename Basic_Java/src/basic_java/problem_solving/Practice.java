
package basic_java.problem_solving;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter first number : ");
         int a = input.nextInt();
         System.out.print("Enter second number : ");
         int b = input.nextInt();
         System.out.print("Enter third number : ");
         int c = input.nextInt();
         
         if(a > b && a > c){
             System.out.println("The large number is : " + a);
         }else if(b > a && b > c){
             System.out.println("The large number is : " + b);
         }else{
             System.out.println("The large number is : " + c);
         }
         
    }
   
    
}
