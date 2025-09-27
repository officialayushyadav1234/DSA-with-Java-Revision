package Searching;

import java.util.Scanner;

public class BinarySearch {

  // Binary Searching Algorithm Logic
  public static int binarySearch(int arr[], int target) {

    int low = 0;
    int high = arr.length - 1;
    
    // for count loop working
    int i = 1;

    while (low <= high) {

      // for count loop to find target element its not mendatory
      System.out.println("pass" + i);
      i++;
     
      // find mid element
      int midIndex = low + (high - low) / 2;

      // Middle element is equals to target
      if (target == arr[midIndex]) {
        return midIndex;
      }
      // Middle element is less than target
      if (target < arr[midIndex]) {
        high = midIndex - 1;
      }
      // Middle element is greater than target
      if (target > arr[midIndex]) {
        low = midIndex + 1;
      }
      
    }
    return -1;
  }
  // ------------------------------------------------------------------------------

  public static void main(String[] args) {
    
    // Taking the User Input
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the Size of an array:");
    int size = sc.nextInt();

    // for Array element Enter User
    int arr[] = new int[size];
    System.out.println("Enter the Array Element One By One:");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }

    // for Taking target element
    System.out.println("Enter the target Element: ");
    int target = sc.nextInt();

    // Call method 
    int foundIndex = binarySearch(arr, target);
    if (foundIndex == -1) {
      System.out.println("Element is not found !");
    } else {
      System.out.println("Element is find index :" +foundIndex);
    }
  
  }
}
