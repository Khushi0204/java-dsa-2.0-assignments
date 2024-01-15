//4. Write a Java program to find the index of a specific element in an integer array.?

import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        int arr[] = {2, 5, 8, 10, 3};
        int index=Arrays.indexOf(arr, 3);   
        System.out.println("The number is found at index : " + index);
    }
}
