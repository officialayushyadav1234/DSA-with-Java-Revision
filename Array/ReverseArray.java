import java.util.Scanner;

public class ReverseArray {
  
  //  These two methods taken time complexity => O(n)

  /*  
  // Rule First for Reverse Array 
  public static void reverseArray(int array[]) {
    
   for (int i = 0; i < array.length / 2; i++) {
       
    int temp = array[i];
    array[i] = array[array.length - i - 1];
    array[array.length - i - 1] = temp;
   }
  }
    */
   
// ----------------------------------------------------------------------    

  // Rule Second for Reverse Array
  public static int[] reverseArray(int array[]) {
    
    int temp[] = new int[array.length];
    for (int i = array.length - 1; i >= 0; i--) {
      temp[temp.length-i-1 ] = array[i];
    }
    return temp;
  }
// -----------------------------------------------------------------------
public static void main(String[] args) {
    
     // Taking User Input
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array:");
    int size = sc.nextInt();
    int arr[] = new int[size];
    
    // for Array element Enter User 
    System.out.println("Enter the Element One by One");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    
    /*
    // for rule First 
    int value = reverseArray(arr);
    for (int value : value) {
      System.out.println(value +"/t");
    }
      */

    // for Second Rule
    int rev[] = reverseArray(arr);
    for (int value : rev) {
      System.out.print(value + "\t");
    }
    
  }
}
