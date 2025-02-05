import java.util.*;

// Write a program to find the missing number in a sequence
public class missing {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of digits (n-1): ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int expectedSum =n*(n+1) / 2;  
        int actualSum = 0;

        for (int i = 0; i < n; i++) {
            actualSum += arr[i];
        }
        int Number = actualSum-expectedSum;
        
        System.out.println("The missing number is: " +Number);
    }
}
