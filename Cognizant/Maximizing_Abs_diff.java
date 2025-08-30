import java.util.*;

public class MaxAbsDiffSumIndex {
    public static int getMaxAbsDiffSumIndex(int[] A, int[] B) {
        int maxSum = Integer.MIN_VALUE;
        int index = -1;

        for (int i = 0; i < A.length; i++) {
            int currentSum = 0;
            for (int j = 0; j < B.length; j++) {
                currentSum += Math.abs(A[i] - B[j]);
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                index = i;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of arrays
        System.out.print("Enter size of arrays: ");
        int n = sc.nextInt();

        int[] A = new int[n];
        int[] B = new int[n];

        // Input array A
        System.out.println("Enter elements of array A:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        // Input array B
        System.out.println("Enter elements of array B:");
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }

        // Compute result
        int result = getMaxAbsDiffSumIndex(A, B);
        System.out.println("Index with maximum sum of absolute differences: " + result);

        sc.close();
    }
}
