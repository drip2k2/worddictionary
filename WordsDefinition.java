
/**
 * transtaltes a given line based on the difinition of each word in file core-wordnet.txt
 *
 * @author jmadar 
 * @author hdarbandi
*/
 

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class WordsDefinition {
    
    private ArrayList<EachWord> dictionary;
    
    public WordsDefinition() {        
        try {
            getWords("core-wordnet.txt");
        } catch (IOException ex) {
            System.out.println("Error: Cannot read file. "+ex);
        }       
    }
    
    /**
    *  Splits line into words, calls searchDefinition(String word) method to get the definitionof each word. 
    Attach the returned result into a line, and returns it.
    * @return returns the translation of the line
    */
    public String getDefinition(String line) {
        //*** your code goes here


        String[] arr = line.split(" ",-1);
        int l = arr.length;
        String str = "";
        String word = "";
        for (int i = 0; i < l; i++){


          word = searchDefinition(arr[i]);

          if(word.equals("")){

            str = str + " " + arr[i];

          }
          else{
              str = str + " " + searchDefinition(arr[i]+"");
          }



        }



        return str;
    } 
    
    /**
    * Search ArrayList for meaning of a word and returns it.
    * @return meaning in case of success 
    *           otherwise returns "" (empty String)
    */
    private String searchDefinition(String word) {
      String def="";
        //*** your code goes here

        for(int i=0;i<dictionary.size();i++){
            String w =dictionary.get(i).getWord().toString();

            if(w.equals(word)) {
                def = dictionary.get(i).getMeaning().toString();
                return def;
            }
        }
        return "";
        }


    
    
            
    /**
     * Given a file, return all the lines in an array for easy processing
     */
    private void getWords(String dictionaryFile) throws IOException {
        dictionary = new ArrayList<EachWord>();

        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(dictionaryFile)));
        while (true) {
            String line = in.readLine();
            if (line == null) 
                break;
            line = line.trim();
            if(line.length()==0)
                continue;
            dictionary.add(new EachWord(line));        
        }
     
    
    }
   
}

