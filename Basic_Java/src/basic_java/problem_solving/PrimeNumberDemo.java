
package basic_java.problem_solving;

import java.util.Scanner;


public class PrimeNumberDemo {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.print("Enter first positive integer : ");
            int m = input.nextInt();
            
            System.out.print("Enter last positive integer : ");
            int n = input.nextInt();
            int count = 0;
            
            
            for (int i = m; i <= n; i++) {
                for (int j = 2; j < i; j++) {
                    if(i % j == 0){
                        count++;
                        break;
                    }
                }
                if(count == 0){
                    System.out.println(i);
                    count = 0;
                }
            }
            
    }
}
