
package basic_java.problem_solving;

import java.util.Scanner;

public class Assignment12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your start number : ");
        int m = input.nextInt();
        System.out.print("Input your end number : ");
        int n = input.nextInt();
        int sum = 0;
        
        for (int i = m; i <= n; i++) {
            if(i % 2 != 0){
            sum = sum + i;
         }
        }
        System.out.println(sum);
    }
}
