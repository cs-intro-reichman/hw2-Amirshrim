// Prints a crowd cheering output.
public class Cheers {
    public static void main(String[] args) {
        String word = args[0];
        String letters = "AEFHILMNORSX";
        
        int num = Integer.parseInt(args[1]);
        word = word.toUpperCase();
        for(int i = 0; i < word.length(); i++){
            char currentLetter = word.charAt(i); 
        
            if (letters.indexOf(currentLetter) >= 0) { 
                System.out.println("Give me an " + currentLetter + ": " + currentLetter + "!");
            } else {
                System.out.println("Give me a " + currentLetter + ": " + currentLetter + "!");
            }
        }
        
        
        System.out.println("What does that spell?");         
        
        
        for (int i = 0; i < num; i++){
            System.out.println(word + "!!!");
        }        
        
    } 
} 