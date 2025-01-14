import java.util.ArrayList;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable

    String checkSize = "Danny";

    // Find the length of the string

    checkSize.length();

    // Concatenate (add) two strings together and reassign the result

    checkSize = "Danny" + " DEV28";
    
    // Find the value of the character at index 3

    String loader = "";
    char[] refract = checkSize.toCharArray();
    loader += refract[3];

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)

    checkSize.contains("Danny");

    // Iterate over the characters of the string, printing each one on a separate line

    for(char i : refract){
      System.out.println(i);
    }

    // Create an ArrayList of Strings and assign it to a variable

    ArrayList<String> strList = new ArrayList<>();

    // Add multiple strings to the List (OK to do one-by-one)

    strList.add("Danny");
    strList.add("DEV28");
    strList.add("GitHub");

    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop

    String bindingStr = String.join(" ", strList);

    // Check whether two strings are equal

    boolean rEqual = bindingStr.equals(checkSize);

    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
