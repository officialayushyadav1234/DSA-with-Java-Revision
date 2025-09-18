import java.util.Scanner;

public class CountTargetArrayElement {
  
  public static int countTargetElement(int array[], int targetElement) {
    
    int count = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] == targetElement) 
        count++;
    }
    return count;
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

    // for target Element
    System.out.println("Enter the Target Element:");
    int targetElement = sc.nextInt();

    // method call
    int count = countTargetElement(arr, targetElement);
    System.out.println("Target Element is" +count+ "times");


  }
}
