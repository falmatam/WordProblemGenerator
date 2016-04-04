package operations;

import assets.*;
import templates.*;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;


public class Subtraction extends Operation {

    private ArrayList<Person> names;
    private ArrayList<Item> items;
    private ArrayList<Integer> values;
    public Float answer;

    public Subtraction () {
        names = new ArrayList<Person>();
        items = new ArrayList<Item>();
        values = new ArrayList<Integer>();
    }

    public String createWP(Information info) {
        pickRandomInfo(info);
        // get a template
        Template templates = new Subtract();
        ArrayList<String> opList = templates.getTemplate();
        String wordProblem = opList.get(0);

        // add gathered info into the template
        wordProblem = wordProblem.replace("#person1", names.get(0).name);
        wordProblem = wordProblem.replace("#person2", names.get(1).name);
        wordProblem = wordProblem.replace("#gender1",names.get(0).name);
        wordProblem = wordProblem.replace("#item", items.get(0).item +"'s");
        wordProblem = wordProblem.replace("#number1", Integer.toString(values.get(values.size()-1))); // get the max value
        wordProblem = wordProblem.replace("#number2", Integer.toString(values.get(0))); // get the min value

        return wordProblem;
    }

    private void pickRandomInfo(Information info) {
        // get random names, items, and numbers to plug into the template
        Person person1 = info.getRandName();
        // add a different person
        Person person2 = person1;
        while (person2.name.equals(person1.name)) {
            Person tempPerson = info.getRandName();
            if (!tempPerson.name.equals(person1.name))
                person2 = tempPerson;
        }
        Item item = info.getRandItem();
        Integer number1 = info.getRandNum();
        Integer number2 = info.getRandNum();

        // add gathered info into their corresponding lists
        names.add(person1); names.add(person2);
        items.add(item);
        values.add(number1); values.add(number2);
        // sort values list and reassign number1 and number2
        Collections.sort(values);
    }

    public Float checkResult() {
        Float result = (float)values.get(values.size()-1);
        for (int i=0; i<values.size()-1; i++)
            result -= values.get(i);
        DecimalFormat form = new DecimalFormat("0.00");
        answer = Float.parseFloat(form.format(result));
        return answer;
    }

}
