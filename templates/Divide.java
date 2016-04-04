package templates;

import java.util.ArrayList;


public class Divide extends Template {

    public ArrayList<String> question;

    public Divide() {
    	question = new ArrayList<String>();
    	question.add("#person1 has #number1 #item. #gender1 wants to divide them evenly " +
                "among #number2 friends. How many #item does each of them get?");
    }

    public ArrayList<String> getTemplate() {
        return question;
    }

}
