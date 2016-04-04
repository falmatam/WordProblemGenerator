package worksheet;

import operations.*;
import assets.*;


public class Problem {

    private String 		problemTypes; 
    private Information infos;
    private String 		wordProblem;
    private Float 		answer;

    public Problem(Information info, String problemType) {
        this.problemTypes = problemType;
        this.infos = info;
    }

    public Operation createProblem() {
        OperationAsset assets 	= new OperationAsset();
        Operation problem 		= assets.createOperation(problemTypes);
        wordProblem 			= problem.createWP(infos);
        answer 					= problem.checkResult();

        return problem;
    }

    public String getWordProblem() {
        return wordProblem;
    }

    public Float getAnswer() {
        return answer;
    }

}
