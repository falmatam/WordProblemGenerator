package worksheet;

import assets.Information;

import java.util.ArrayList;


public class InitializeState implements State {

    ArrayList<Problem> problems;

    public void run(Instance instance) {
        System.out.println("Worksheet is being initialized..");
        instance.setState(this);
        createProblems();
    }

    private void createProblems() {
        problems = new ArrayList<Problem>();
        Information information = new Information();
        information.inputManager();

        int problemCount = information.numOfProblems/information.problemTypes.size(); 
        int problemRemaining = information.numOfProblems - (problemCount * information.problemTypes.size());

        for (String ops : information.problemTypes)
            for (int i = 0; i < problemCount; i++)
                problems.add(new Problem(information, ops));

        for (int i = 0; i < problemRemaining; i++)
            problems.add(new Problem(information, information.problemTypes.get(i)));

        // generate problems for each problem obj
        for (Problem probs : problems)
            probs.createProblem();
    }

    public ArrayList<Problem> getProblems() {
        return problems;
    }



}
