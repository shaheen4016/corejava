
package basic_java.problem_solving;

import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Do you love JAVA? y/Y = yes, n/N = No : ");
        
        ch = input.next().charAt(0);
        
        if(ch == 'y' || ch == 'Y'){
            System.out.println("You are a JAVA lover");
        }else{
            System.out.println("You are not a JAVA lover");
        }
    }
}
