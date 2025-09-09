public class BigOConstantTimeComplexity {
  
  public static void constantTime(){
     
    int arr[] = { 5, 10, 56, 45, 36, 40 };

    System.out.println(arr[2]);   // O(1) only one time execute
  }

  public static void main(String[] args) {
    
    constantTime();

  }
}
