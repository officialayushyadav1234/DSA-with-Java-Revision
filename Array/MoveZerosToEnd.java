import java.util.Scanner;

public class MoveZerosToEnd {
  
  // Move all Zeros at end index of the given Array.
  public static void moveAll0AtEnd(int arr[]) {
    
    // for Non Zero Number
    int index = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != 0) {
        arr[index] = arr[i];
        index ++;
      }
    }
    // for Zero Number
    while (index < arr.length) {
      arr[index] = 0;
      index ++;
    }
  }


  public static void main(String[] args) {
    
     // Taking User Input
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array:");
    int size = sc.nextInt();
    
    // for Array element Enter User 
    int arr[] = new int[size];
    System.out.println("Enter the Element One by One");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    // call the method
    moveAll0AtEnd(arr);
    for(int value : arr){
    System.out.print(value+ "\t");
    }
    System.out.println();
  }
}
