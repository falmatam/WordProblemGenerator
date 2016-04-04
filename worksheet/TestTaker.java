package worksheet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class TestTaker implements State {

    private Integer 		currentScore = 0;
    ArrayList<Problem> 		problems;

    public TestTaker(ArrayList<Problem> problems) {
        this.problems = problems;
    }

    public void run(Instance context) {
        context.setState(this);
        
        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        String input;

        //ensure variety
        Collections.shuffle(problems); 

        System.out.println("\n\n---------------------------------- WORKSHEET ----------------------------------");
        for (int i = 0; i < problems.size(); i++) {
            Problem probs = problems.get(i);
            System.out.println("\n" + (i+1) + ". " + probs.getWordProblem());
            try {
                input = buffRead.readLine();
                input = input.replace(" ", "");
                Float result = Float.parseFloat(input);
                if (result.equals(probs.getAnswer())) {
                    System.out.println("Correct!");
                    currentScore += 1;
                }
                else{
                	System.out.println("Sorry, incorrect!");
                }
            }
            catch (IOException e) {
                System.err.println(e);
            }
        }
        
        
        
        
        System.out.println("\n---------------------------------- RESULT ----------------------------------");
        System.out.println("You got " + currentScore + " correct out of " + problems.size() + " problems.");
    }




    public Float getScore() {
        return (float)currentScore/problems.size()*100;
    }

}
