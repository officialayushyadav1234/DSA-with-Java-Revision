public class ArrayExample {
  
  public static void main(String[] args){

        // Create and initialize an array
        int marks[] = { 50, 60, 70, 80, 50, 64 };

        // Declare and initialize another array
        int size = 4;
        int failedStudentMarks[] = new int[size];

        // Access failedStudentMarks
        System.out.println(failedStudentMarks[0]);
        System.out.println(failedStudentMarks[2]);
        System.out.println(failedStudentMarks[3]);
        System.out.println(failedStudentMarks[1]);

        // Access specific elements
        System.out.println(marks[0]); // 50
        System.out.println(marks[1]); // 60
        System.out.println(marks[2]); // 70
        System.out.println(marks[4]); // 50

        // ✅ Access the last element (correct formula)
        System.out.println(marks[marks.length - 1]); // 64

        // Length of the array
        System.out.println(marks.length); // 6

        System.out.println("----------------------------------------------");

        // print all the data of marks elements ( Traverse Array )
        for (int i = 0; i < marks.length; i++) {
          System.out.println("The value at index " + i + " is " + marks[i]);
        }
        
        System.out.println("Modify Array element : ---------------");
        
        
        // Modify an Array element of marks data
        marks[1] = 100;
         
        // for each loop
        for (int i : marks) {
          System.out.println(i);
        }

   }
}