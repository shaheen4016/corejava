
package basic_java.problem_solving;

import java.util.Scanner;

public class SumOfSerice {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter initial number : ");
        int m = input.nextInt();
        
        System.out.print("Enter final number : ");
        int n = input.nextInt();
        int sum = 0;
        
        for (int i = m; i <= n; i++) {
            sum = sum + i;
        }
        
        System.out.println("Total sum is : " + sum);
    }
}
