
/**
* EachWord represents a word and its meaning
*  wordType [token] [word] meaning 
*
* @author jmadar 
* @author hdarbandi
*/
 

public class EachWord
{
    private String wordType;
    private String token;
    private String word;
    private String meaning;
    
    /** constructor takes an string with following format:
        wordType [token] [word] meaning 
        the meaning part can be missed
        tokenize each part and store them in instance fields
        @param str 
    */
    public EachWord(String str){
        // Here we used regular expression to split the string
        // use symbols '['  or ']' to split the string
        // you are free to use any method. The following is just suggested.
        String[] arr = str.split("\\] \\[|\\[|\\]");
       
        // set values of implicit variables.
        //****** your code goes here.
     
        if(arr.length > 3){

            wordType = arr[0];
            token = arr[1];
            word = arr[2];
            meaning = arr[3];


        }
        else{
            wordType = arr[0];
            token = arr[1];
            word = arr[2];


        }










    }
    /** accessor method to word instance field
    @return word
    */
    public String getWord(){
        return word;
    }

    /** accessor method to meaning instance field
    @return meaning
    */
    public String getMeaning(){
        return meaning;
    }
    
    public String toString(){
        return "["+wordType+" - "+token+" - "+word+" - "+meaning+"]";
    }   
    
}    
