// Prints a crowd cheering output.
public class Cheers {
    public static void main(String[] args) {
        String word = args[0];
        String letters = "AEFHILMNORSX";
        
        // הנחה: הקלט num תקין וחיובי (כדי לא להוסיף בדיקות שלא נדרשו)
        int num = Integer.parseInt(args[1]);
        
        // המרת המילה לרישיות
        word = word.toUpperCase();
        
        // 1. לולאה להדפסת שורות "Give me..."
        for(int i = 0; i < word.length(); i++){
            char currentLetter = word.charAt(i); 
            
            // בדיקה האם התו קיים במחרוזת letters (דורש "an")
            if (letters.indexOf(currentLetter) >= 0) { 
                System.out.println("Give me an " + currentLetter + ": " + currentLetter + "!");
            } else {
                // דורש "a"
                System.out.println("Give me a " + currentLetter + ": " + currentLetter + "!");
            }
        }
        
        
        System.out.println("What does that spell?");         
        
        
        for (int i = 0; i < num; i++){
            System.out.println(word + "!!!");
        }        
        
    } 
} 