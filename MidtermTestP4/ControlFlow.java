package MidtermTestP4;


/**
 * Asks our (control flow) question
 *
 * @author Eagan Kaminetz
 * @version 9/6
 */
import java.util.*;
public class ControlFlow
{
    //User's answer
    private String rawInput;
    //What gets asked
    private String questionText;
    //String array of acceptable answers
    private String[] acceptableAnswers;
    //1 or 0 depending on if answer is correct; int because math doesn't require conversions
    private int correctAnswer;
    //Tells program to ignore case if false
    private boolean caseSensitive;
    //How many times the question has been answered
    private int questionAnswered;
   
    //if params want to be added in later for some reason
    private void GeneralFRQ(){
        caseSensitive = false;
    }
    //constructer that assumes case insensitivity for those precious five keystrokes
    private void GeneralFRQ(String qT, String[] aA){
        rawInput = "";
        questionText = qT;
        acceptableAnswers = aA;
        questionAnswered = 0;
        caseSensitive = false;
    }
    //constructer that lets you specify case sensitivity
    private void GeneralFRQ(String qT, String[] aA, boolean cS){
        rawInput = "";
        questionText = qT;
        acceptableAnswers = aA;
        questionAnswered = 0;
        caseSensitive = cS;
    }

    /**
    * Asks question with given question text, acceptable answers, and case sensitivity.
    * Writes to correctAnswer 1 or 0 for right or wrong
    * Increments questionAnswered
    */
    private void promptUser()
    {
        //Asks question and brings up console prompt
        System.out.println(questionText);
        Scanner sc = new Scanner(System.in);
        rawInput = sc.nextLine();
        //Compares answer to key according to case sensitivity; if answer is right, correctAnswer = 1
        if(caseSensitive){
            for(String thisAnswer : acceptableAnswers){
                if(rawInput.equals(thisAnswer)){
                    //correctAnswer increments per time the question is right in case someone asks it multiple times
                    correctAnswer++;
                    break;
                }
        }
     
        } else {
         
            for(String thisAnswer : acceptableAnswers){
                if(rawInput.equalsIgnoreCase(thisAnswer)){
                    //correctAnswer increments per time the question is right in case someone asks it multiple times
                    correctAnswer++;
                    break;
                }
    }
    
    }
    questionAnswered++;
    }
    /**
    * Asks question, but only if it has not been answered before (or questionAnswered = 0)
    */
    private void askQuestionNoRepeats(){
    if(questionAnswered > 0) {
    askQuestion();
    questionAnswered++;
    }
    }
    
    private void changeQuestionText(String qT){
        questionText = qT;
    }
    
    private void changeAcceptableAnswers(String[] aA){
        acceptableAnswers = aA;
    }
    
    private void changeCaseSensitivity(boolean cC){
        caseSensitive = cC;
    }
    
    private void changeQuestionAnswered(int qA){
        questionAnswered = qA;
    }
    
    private String getQuestionText(){
        return questionText;
    }
    
    private boolean getCaseSensitivity(){
        return caseSensitive;
    }
    
    private String[] getAcceptableAnswers(){
        return acceptableAnswers;
    }
    
    private String getRawInput(){
        return rawInput;
    }
    
    private int getTimesQuestionAnswered(){
        return questionAnswered;
    }
    
    private int getCorrectAnswer(){
        return correctAnswer;
    }
    
    private boolean getCorrectAnswerBool(){
        //returns correctness as boolean
        if(correctAnswer > 0){
            return true;
        } else {
            return false;
        }
    }
    
    private void printCorrectness(){
        //immediately prints whether answer is correct
        if(correctAnswer == 1){
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect!");
        }
    }
    
    private void fillArgs(String qT, String[] aA, boolean cS){
       questionText = qT;
       acceptableAnswers = aA;
       caseSensitive = cS;
    }
       
    private void fillArgs(String qT, String[] aA){
       questionText = qT;
       acceptableAnswers = aA;
    }
    
    public boolean askQuestion(){
        String[] answerKey = {"0 2 4 6 8", "0 2 4 6 8 "};
        fillArgs("What is the output for the following code when compiled and run? \n\npublic class forLoop{ \n   public static void main(String[] args){ \n      for(int i = 0; i<10; i=i+2){ \n         System.out.print(i+\" \"); \n      } \n   } \n}", answerKey);
        promptUser();
        return getCorrectAnswerBool();
    
    }
    
    /*public void askQuestion() {
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
        }*/

        
    }


