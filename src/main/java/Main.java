import java.util.*;

public class Main {
  
  public static void main(String[] args) {

    System.out.println("Hello");

    Random random = new Random();
    int x = random.nextInt(10);
    //System.out.println("You value is " + x);
    int[] myArray = new int[10];
    for (int i = 0; i < myArray.length; i++) {
      myArray[i] = random.nextInt(10);
      
    }
    

    for (int i:myArray) System.out.println("My rando at " + i);

    int[] myOtherArray = new int[10];
    for (int i = 0; i < myArray.length; i++) {
      myOtherArray[i] = myArray[i];
    }

    for (int i = 0; i < myArray.length; i++) {
      System.out.println("myOtherArray[" + i + "] is " + myOtherArray[i] + " and myArray[" + i + "] is " + myArray[i]);
    }

    double sum = 0;
    for (int i: myArray) sum += i;
    System.out.println("My average (mean) is " + sum/myArray.length);

    my1Method(myArray);
    int[] myReturnedArray = my2Method();
    
    
    
    // System.out.println("My rando at " + i + " is " + myArray[i]);
    System.out.println(Arrays.toString(myArray));
    System.out.println(Arrays.toString(myOtherArray));
  }

  public static void my1Method(int[] thisArray) {

    System.out.println("My array is " + thisArray.length + " long.");
    
  }

  public static int[] my2Method() {
    int[] a = { 1, 2, 3 };
    return a;
  }

}