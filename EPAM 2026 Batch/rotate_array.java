// q1 Rotate an array left by k times
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size and rotation value
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Left Rotation using (i + k) % n
        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[i] = arr[(i+k) % n];
        }

        // Print rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(rotated[i] + " ");
        }
    }
}


