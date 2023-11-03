
package basic_java.problem_solving;

import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter any positive number : ");
        num = input.nextInt();
        
        if(num % 2 == 0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }
}
