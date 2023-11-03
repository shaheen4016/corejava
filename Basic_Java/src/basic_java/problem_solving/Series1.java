
package basic_java.problem_solving;

import java.util.Scanner;

public class Series1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter last number : ");
        int num = input.nextInt();
        int sum = 0;
        
        for (int i = 1; i <=num; i = i + 2) {
            System.out.print(i + " ");
            sum = sum + i;
        }
        System.out.println(" ");
        System.out.println(sum);
    }
}
