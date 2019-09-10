import java.util.Random;

public class RandomLogic {
        
    public void askQuestion()
    {
        Random random = new Random();
        
        int[] answerAmount = new int[4];
        for (int i=0; i<answerAmount.length; i++)
        {
            answerAmount[i] = i;
        }
        
        for (int i=0; i<answerAmount.length; i++)
        {
            int randomNum = random.nextInt(answerAmount.length);
            int originalNum = answerAmount[i];
            answerAmount[i] = answerAmount[randomNum];
            answerAmount[randomNum] = originalNum;
        }
        
        String[] answers = {"==","=","!=","/="};
        
        System.out.println("Which operator do you use to test if two numbers are not equal to each other?");
        /*
        System.out.println("1. " + answers[answerAmount[0]]);
        System.out.println("2. " + answers[answerAmount[1]]);
        System.out.println("3. " + answers[answerAmount[2]]);
        System.out.println("4. " + answers[answerAmount[3]]);
        */
       
        for (int i=0; i<answerAmount.length; i++)
        {
            System.out.println((i+1) + ". " + answers[answerAmount[i]]);
        }
    }
    
}
