
package basic_java.problem_solving;

public class BreakStatement {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            
            if(i == 21){
                break;
            }
            System.out.println(i);
        }
    }
}
