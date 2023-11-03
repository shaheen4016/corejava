
package basic_java.problem_solving;

import java.util.Scanner;

public class possitiveOrNegetive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = input.nextInt();
        
        if(num < 0){
            System.out.println("Negative Number");
        }else if(num == 0){
            System.out.println("This is Zero");
        }else{
            System.out.println("Possitive Number");
        }
        
    }
}
