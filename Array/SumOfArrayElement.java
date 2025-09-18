import java.util.Scanner;

public class SumOfArrayElement {

  public static int sumOfArrayElement(int array[]){

    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum = sum + array[i];
    }
    return sum;
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

    // Method Call 
    int result = sumOfArrayElement(arr);
    System.out.println("Sum of Array Element : " +result);
  }
}
