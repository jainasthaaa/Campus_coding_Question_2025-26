import java.util.Scanner;

public class StringDifference {
    public static int findDifferences(String s1, String s2) {
        int count = 0;
        int minLen = Math.min(s1.length(), s2.length());

        // Compare overlapping part
        for (int i = 0; i < minLen; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
            }
        }

        // Add remaining unmatched characters from the longer string
        count += Math.abs(s1.length() - s2.length());

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter first string: ");
        String inp1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String inp2 = sc.nextLine();

        // Print result
        System.out.println("Difference: " + findDifferences(inp1, inp2));

        sc.close();
    }
}
