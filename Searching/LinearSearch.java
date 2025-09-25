package Searching;

import java.util.Scanner;

public class LinearSearch {
  
  // Linear Serching Algorithm
  public static int linearSearch(int array[],int target) {

    int index = -1;
    for (int i = 0; i < array.length; i++) {
      if (array[i] == target) {
        index = i;
        break;
      }
    }
    return index;
  }
//---------------------------------------------------------------------------- 
  
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
    int foundIndex = linearSearch(arr, target);
    if (foundIndex == -1) {
      System.out.println("Element is not found !");
    } else {
      System.out.println("Element is find index :" +foundIndex);
    }
  }
}
