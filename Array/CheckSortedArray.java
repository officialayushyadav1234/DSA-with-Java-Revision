import java.util.Scanner;

public class CheckSortedArray {
  
  // Check Sorted Array Or Not
  public static boolean checkSortedArray(int array[]) {
    
    // Assumption Array isSorted = true
    boolean isSorted = true;
    
    for (int i = 0; i < array.length - 1; i++) {
    // if check Descending Order Sorted Array then=> if(array[i+1]>array[i])
      // for check Ascending Order Sorted Array 
      if (array[i + 1] < array[i])
        isSorted = false;
    }
    return isSorted;
  }

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
    
    boolean checkResult = checkSortedArray(arr);
    System.out.println("The array is:" +(checkResult ? "" : "Not Sorted Array")+ "Sorted Array");
  }
}
