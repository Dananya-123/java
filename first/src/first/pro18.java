package first;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class pro18 {

	
	     public static void main(String [ ] args) throws FileNotFoundException {
	              new pro18().findLongestWords();
	         }

	     public String findLongestWords() throws FileNotFoundException {

	       String longest_word = "";
	       String current;
	       Scanner sc = new Scanner(new File("C:\\Users\\DELL\\Documents\\java_anan"));


	       while (sc.hasNext()) {
	          current = sc.next();
	           if (current.length() > longest_word.length()) {
	             longest_word = current;
	           }

	       }
	         System.out.println("\n"+longest_word+"\n");
	            return longest_word;
	            }
	}



