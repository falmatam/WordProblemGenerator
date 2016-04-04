package operations;


public class OperationAsset {

    public Operation createOperation(String type) {
        Operation problem = new Addition();
        if (type.equals("+"))
        	problem = new Addition();
        else if (type.equals("-"))
        	problem = new Subtraction();
        else if (type.equals("/"))
        	problem = new Division();
        else if (type.equals("*"))
        	problem = new Multiplication();


        return problem;
    }

}
