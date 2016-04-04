package worksheet;

import java.util.ArrayList;


public class Worksheet {

    private ArrayList<Problem> worksheet;
    private Float score;

    public Worksheet() {

    	Instance instance = new Instance();

        InitializeState initState = new InitializeState();
        initState.run(instance);
        worksheet = initState.getProblems();

        TestTaker endState = new TestTaker(worksheet);
        endState.run(instance);
        score = endState.getScore();
    }

    public ArrayList<Problem> getWorksheet() {
        return worksheet;
    }

    public Float getScore() {
        return score;
    }

}
