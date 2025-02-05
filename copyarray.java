import java.util.*;

public class copyarray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] copyArr = new int[n];

        for (int i = 0; i < n; i++) {
            copyArr[i] = arr[i];
        }

        System.out.println("Copied array:");
        for (int i = 0; i < n; i++) {
            System.out.print(copyArr[i] + " ");
        }
    }
}
