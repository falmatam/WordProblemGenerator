package assets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;


public class InputManager {

    BufferedReader buffReader;

    public InputManager() {
    	buffReader = new BufferedReader(new InputStreamReader(System.in));
    }

    
    public ArrayList<String> promptOpType() {
        ArrayList<String> problemTypes = new ArrayList<String>();
        System.out.println("Indicate the type(s) of operations you would " +
                "like to generate word problems for: \n" +
                "   Enter + for Addition\n   Enter - for Subtraction\n" +
                "   Enter / for Division\n   Enter * for Multiplication\n" +
                "\nChoice(s):");
        try {
            String 			input = buffReader.readLine();
            input = 		input.replace(" ", "");
            String[] 		inputString = input.split("");
            problemTypes = 	new ArrayList<String>(Arrays.asList(inputString));
        }
        catch (IOException e) {
            System.err.println(e);
        }
        return problemTypes;
    }


    public Integer promptNumOfProblems() {
        Integer numOfProblems=0;
        System.out.println("\nHow many word problems would you like to generate?:");
        try {
            String input = buffReader.readLine();
            input = input.replace(" ", "");
            numOfProblems = Integer.parseInt(input);
        } catch (IOException e) {
            System.err.println(e);
        }
        return numOfProblems;
    }


    public Integer promptMinRange() {
        Integer minRange = 0;
        System.out.println("\nEnter minimum range for operand values?:");
        try {
            String input = buffReader.readLine();
            input = input.replace(" ", "");
            minRange = Integer.parseInt(input);
        }
        catch (IOException e) {
            System.err.println(e);
        }
        return minRange;
    }


    public Integer promptMaxRange() {
        Integer maxRange = 0;
        System.out.println("\nEnter  maximum range for operand values?:");
        try {
            String input = buffReader.readLine();
            input = input.replace(" ", "");
            maxRange = Integer.parseInt(input);
        }
        catch (IOException e) {
            System.err.println(e);
        }
        return maxRange;
    }


    public ArrayList<Person> promptNames() {
        ArrayList<Person> names = new ArrayList<Person>();
        System.out.println("\nList the NAMES of people you wish to be featured (follow format below): \n" +
                "Name1, Name2, NameN, etc...\n\nThen press ENTER.");
        try {
            String input = buffReader.readLine();
            input = input.replace(" ", "");
            String[] namesArray = input.split(",");
            for (String i : namesArray) {
                names.add(new Person(i));
            }
        }
        catch (IOException e) {
            System.err.println(e);
        }
        return names;
    }


    public ArrayList<Item> promptItems() {
        ArrayList<Item> items = new ArrayList<Item>();
        System.out.println("\nList items you wish to be featured (separated by a comma):" +
                "\n\nThen press ENTER.");
        try {
            String input = buffReader.readLine();
            input = input.replace(" ", "");
            String[] itemsArray = input.split(",");
            for (String i : itemsArray)
                items.add(new Item(i));
        }
        catch (IOException e) {
            System.err.println(e);
        }
        return items;
    }
}
