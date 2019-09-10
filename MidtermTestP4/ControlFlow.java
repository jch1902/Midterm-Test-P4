import java.util.Scanner;

public class ControlFlow {
    public void askQuestion() {
        // Add code that asks the question and retrives an answer here
        Scanner myObj = new Scanner(System.in);
         
        System.out.println("What happens when you don't initialize the loop control variable?");
        System.out.println("a. Your compiler crashes.");
        System.out.println("b. Java produces an error message.");
        System.out.println("c. The code compiles but doesn't work correctly.");
        System.out.println("d. The compiler ignores the error.");
        char answer = myObj.next().charAt(0);
        
        switch(answer){
	        case b: 
		        System.out.println(“Correct.”);
		        break;
	        default:
		        System.out.println(“Incorrect.”);
        }

        
    }
}
