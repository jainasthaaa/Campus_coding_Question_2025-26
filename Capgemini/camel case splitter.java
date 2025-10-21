import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        StringBuilder current = new StringBuilder();
        char prevCase = Character.isUpperCase(s.charAt(0)) ? 'U' : 'L';

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char currCase = Character.isUpperCase(c) ? 'U' : 'L';

            // if case changes, print and start new line
            if (currCase != prevCase) {
                System.out.println(current.toString());
                current.setLength(0); // reset
            }

            current.append(c);
            prevCase = currCase;
        }

        // print last collected part
        System.out.println(current.toString());
    }
}
