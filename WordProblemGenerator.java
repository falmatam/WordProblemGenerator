import worksheet.Worksheet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import java.io.*;


public class WordProblemGenerator {

    static private Map<Integer, Float> scoreRecord;

    public WordProblemGenerator() {
        scoreRecord = new HashMap<Integer, Float>();
    }



    private void makeScoreBook(WordProblemGenerator generator, String fileName) {
        try (BufferedWriter score = new BufferedWriter(new FileWriter(fileName))) {
        
            for (Map.Entry<Integer, Float> i : scoreRecord.entrySet()) {
            	score.write(i.getValue() + ", " + i.getKey());
            	score.flush();
            }
        }
        catch (IOException e) {
            System.err.println(e);
        }
    }



    public static void main(String args[]) {
        WordProblemGenerator generator = new WordProblemGenerator();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        boolean continueVar = true;
        while (continueVar) {
            Worksheet worksheet = new Worksheet();
            scoreRecord.put(i, worksheet.getScore());
            System.out.println("\nGenerate another worksheet? Enter YES or NO");
            try {
                String input = reader.readLine();
                input = input.replace(" ", "");
                if (!(input.equals("YES"))){
                    continueVar = false;
                }
                else{
                    i++;
                }
            }
            catch (IOException e) {
                System.err.println(e);
            }
        }
        generator.makeScoreBook(generator, "scorebook.txt");
    }

}
