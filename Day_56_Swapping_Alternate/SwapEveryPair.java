import java.util.Scanner;
public class SwapEveryPair {
public static void main(String[] args) {
    //input from user
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    //length of array
    for (int i = 0; i < arr.length; i++) {
        arr[i] = scn.nextInt();

    }
    //travsering
    for (int i = 0; i < (arr.length - 1); i += 2) {
      //  swapping
        int temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
    }
    //printing
    for(int i=0; i< arr.length; i++){
        System.out.println(" " + arr[i]);
    }
}
}