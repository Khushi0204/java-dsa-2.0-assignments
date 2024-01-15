//3. Write a Java program to calculate the sum of all elements in an integer array?
public class Q3 {
  public static void main(String[] args) {
    int arr[] = {1,2,3,4,5};
    int n= arr.length;
    for(int i=0;i<n-1;i++){
    
        arr[i+1] += arr[i];
    }
    System.out.println("Sum is: " + arr[n-1]);
  }  
}
