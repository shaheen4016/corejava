
package basic_java.problem_solving;

public class SumOneToTen {
    public static void main(String[] args) {
        int sum = 0;
        
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println("The sum is : " + sum);
    }
}
