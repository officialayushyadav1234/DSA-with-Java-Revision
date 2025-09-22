import java.util.Scanner;
public class SecondLargestElementInArray {
  
  // find Secod Largest Element
  public static int findSecondLargestNumber(int array[]) {
    
    // Let 
    int largestNumber = array[0];
    int secondLargestNumber = array[1];
    
    for (int i = 0; i < array.length; i++) {
      if (array[i] > largestNumber) {
        // this line must of before 
        secondLargestNumber = largestNumber;
        // this line
        largestNumber = array[i];

      } else if (array[i] > secondLargestNumber && array[i] != largestNumber) {
        secondLargestNumber = array[i];
      }
    }
    return secondLargestNumber;
  }
  

  public static void main(String[] args) {
    
     // Taking User Input
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array:");
    int size = sc.nextInt();

    // defining an array and initializing
    int arr[] = new int[size];
    
    // for Array element Enter User 
    System.out.println("Enter the Element One by One");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    int secondLargestElement = findSecondLargestNumber(arr);
    System.out.println("Second Largest Value is :"+secondLargestElement);
  }

}
