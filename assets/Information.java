package assets;

import java.util.ArrayList;
import java.util.Random;


public class Information {

    public ArrayList<String> 	problemTypes;
    public Integer 				numOfProblems;
    public Integer 				minRange;
    public Integer 				maxRange;
    public ArrayList<Person> 	names;
    public ArrayList<Item> 		items;

    public void inputManager() {
        InputManager input = new InputManager();
        
        System.out.println("Greetings and Welcome! This is a Word Problem Generator Program!\n" +
                "Let's go ahead and set up a worksheet.\n\n");
        
        problemTypes 		= input.promptOpType();
        numOfProblems 		= input.promptNumOfProblems();
        minRange 			= input.promptMinRange();
        maxRange 			= input.promptMaxRange();
        names 				= input.promptNames();
        items 				= input.promptItems();
    }

    public Person getRandName() {
        Random rand = new Random();
        int n = rand.nextInt(names.size()) + 0;
        return names.get(n);
    }

    public Item getRandItem() {
        Random rand = new Random();
        int n = rand.nextInt(items.size()) + 0;
        return items.get(n);
    }

    public Integer getRandNum() {
        Random rand = new Random();
        Integer n = rand.nextInt(maxRange) + minRange;
        return n;
    }
}
