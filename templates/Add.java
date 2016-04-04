package templates;

import java.util.ArrayList;


public class Add extends Template {

    public ArrayList<String> question;

    public Add() {
    	question = new ArrayList<String>();
        this.addTemplate();
    }

    public void addTemplate() {
    	question.add("#person1 has #number1 #item. #person2 has #number2 #item. " +
                "How many #item do they have altogether?");
    }

    public ArrayList<String> getTemplate() {
        return question;
    }

}
