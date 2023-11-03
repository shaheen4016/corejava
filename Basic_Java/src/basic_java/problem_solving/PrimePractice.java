
package basic_java.problem_solving;

import java.util.Scanner;

public class PrimePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any possitive integer : ");
        int num = input.nextInt();
        
        
        for (int i = 2; i < num; i++) {
             if(num % 2 == 0){
            System.out.println("Not a Prime Number");
            break;
        }else{
            System.out.println("Prime Number");
            break;
        }
        }
    }
}
