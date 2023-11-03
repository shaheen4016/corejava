
package basic_java.problem_solving;

import java.util.Scanner;

public class PositiveDemo {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int num;
         System.out.print("Enter any number : ");
         num = input.nextInt();
         
         if(num > 0){
             System.out.println("Number is Possitive");
         }else if(num < 0){
             System.out.println("Negative Number");
         }else{
             System.out.println("Equal to Zero");
         }
    }
}
