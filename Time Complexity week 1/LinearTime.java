public class LinearTime {
 
  public static void linearTime() {
    
    int arr[] = { 10, 20, 30, 40, 50, 60,70,80 };

    // For Linear O(n)   ---->>>   Understand( n times n data)
    for (int i = 0; i < arr.length; i++) {
      System.out.print(( i+1 )+ " times \t");
      System.out.println(arr[i] + " ");
    } 
  }

  public static void main(String[] args) {
    linearTime();
  }
}
