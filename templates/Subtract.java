package templates;

import java.util.ArrayList;


public class Subtract extends Template {

    public ArrayList<String> question;

    public Subtract() {
    	question = new ArrayList<String>();
    	question.add("#person1 has #number1 #item. #gender1 gives #number2 #item to " +
                "#person2. How many #item does #person1 have left?");
    }

    public ArrayList<String> getTemplate() {
        return question;
    }

}
