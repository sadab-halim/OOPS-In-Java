import java.util.Scanner;

public class Input {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    // array of primitives.
    int[] arr = new int[5];
    arr[0] = 23;
    arr[1] = 45;
    arr[2] = 233;
    arr[3] = 543;
    arr[4] = 3;
    System.out.println(arr[3]);

    //input using for loops
    for(int i = 0; i < arr.length; i++){
      arr[i] = in.nextInt();
    }
  
    for(int i = 0; i < arr.length; i++){
      System.out.print(arr[i] + " ");
    }
  
    //using for each loop
    for(int numL arr){  // for every element in the array, print the array
      System.out.orint(num + " ");  // here, num represents element of the array

      System.out.println(arr[5]);  //index out of bound error

      //printing the array using the toString method
      System.out.println(Arrays.toString(arr));

      //array of objects
      String[] str = new String[4];
      
      for(int i = 0; i < str.length; i++){
        str[i] = in.next();
      }

      System.out.println(Arrays.toString(str));
    }
  }
}