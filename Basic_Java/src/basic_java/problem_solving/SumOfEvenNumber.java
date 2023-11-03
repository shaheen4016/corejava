
package basic_java.problem_solving;

import java.util.Scanner;

public class SumOfEvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter initial number : ");
        int m = input.nextInt();
        
        System.out.print("Enter final number : ");
        int n = input.nextInt();
        
        int sum = 0;
        System.out.println("Even Number are : ");
        for (int i = m; i <= n; i++) {
            if(i % 2 == 0){
                sum = sum + i;
                System.out.print(" " + i);
            }
        }
        System.out.println();
        System.out.println("Total sum of even numbers : " + sum);
    }
}
