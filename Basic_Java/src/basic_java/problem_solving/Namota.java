
package basic_java.problem_solving;

import java.util.Scanner;

public class Namota {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int m = input.nextInt();
        
        System.out.print("Enter second number : ");
        int n = input.nextInt();
        
        for(int i = m; i <= n; i++){
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "*" + j + " = " + i * j);
            }
            System.out.println("\n");
        }
    }
}
