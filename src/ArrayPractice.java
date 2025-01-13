public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4

    String[] firstArray = new String[4];

    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one

    firstArray[0] = "one";
    firstArray[1] = "two";
    firstArray[2] = "three";
    firstArray[3] = "four";

    // Get the value of the array at index 2

    System.out.println(firstArray[2]);

    // Get the length of the array
    
    System.out.println(firstArray.length);

    // Iterate over the array using a traditional for loop and print out each item

    for(int i = 0; i < firstArray.length; i++){
      System.out.println(firstArray[i]);
    }

    // Iterate over the array using a for-each loop and print out each item

    for(String fString: firstArray){
      System.out.println("value:" +fString);
    }

    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
