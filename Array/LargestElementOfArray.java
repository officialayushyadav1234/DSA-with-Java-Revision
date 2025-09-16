import java.util.Scanner;


public class LargestElementOfArray {

  public static int findlargeElement(int array[]) {

    int largeElement = array[0];

    for (int i = 1; i < array.length; i++) {
      if (largeElement < array[i])
        largeElement = array[i];
    }
    return largeElement;
  }

  // Time Complexity O (n) Linear Complexity
  
  public static void main(String[] args) {
    
    // int arr[] = { 10, 50, 20, 60, 40, 80, 70 };

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

    int largeValue = findlargeElement(arr);
 
    System.out.println("Largest value is " +largeValue);
  }
}