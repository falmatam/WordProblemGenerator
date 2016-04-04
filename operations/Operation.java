package operations;

import assets.*;

import java.util.ArrayList;


public abstract class Operation {

    private ArrayList<Person> 	names;
    private ArrayList<Item> 	items;
    private ArrayList<Integer> 	values;

    public abstract String 	createWP(Information info);
    public abstract Float 	checkResult();

}
