/**
 * A runner program of WordDefinitioin 
 @author jmadar 
 @author hdarbandi
*/

import java.util.Scanner;

public class CommandLine {

    
    public void start() {
        WordsDefinition words = new WordsDefinition();
        Scanner scanner = new Scanner(System.in);
        String line;
        
        do {
            System.out.print("> ");
            line = scanner.nextLine();
            System.out.println("You Entered: "+line);

            // Currently echoing back the original line
            line = words.getDefinition(line);
	    	   

            System.out.println("Translation: "+line);
        } while(!line.contains("?"));        
    }
        
    public static void main(String[] args) {
        CommandLine commandLine = new CommandLine();     
        commandLine.start();
    }
    
}
