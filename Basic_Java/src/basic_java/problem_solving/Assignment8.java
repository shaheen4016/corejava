
package basic_java.problem_solving;

import java.util.Scanner;


public class Assignment8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char m;
        System.out.print("Have you completed your masters? y/n : ");
        m = input.next().charAt(0);
        
        char e;
        System.out.print("Are you fulent in English? y/n : ");
        e = input.next().charAt(0);
        
        if(m == 'y' && e == 'y'){
            System.out.println("You  are eligible for the job interview");
        }else{
            System.out.println("Sorry, You  are not eligible for the job interview");
        }
    }
}
