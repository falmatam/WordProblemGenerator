package templates;

import java.util.ArrayList;

public class Multiply extends Template {

    public ArrayList<String> question;

    public Multiply() {
    	question = new ArrayList<String>();
    	question.add("#person1 has #number1 groups of #number2 #item. " +
                "How many #item does #person1 have total?");
    }

    public ArrayList<String> getTemplate() {
        return question;
    }

}
