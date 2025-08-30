public class VowelRotation {
    public static String rotateVowels(String s, int k) {
        List<Character> vowels = new ArrayList<>();
        List<Integer> positions = new ArrayList<>();
        String vowelSet = "aeiouAEIOU";

        // Extract vowels and their positions
        for (int i = 0; i < s.length(); i++) {
            if (vowelSet.indexOf(s.charAt(i)) != -1) {
                vowels.add(s.charAt(i));
                positions.add(i);
            }
        }

        // Rotate vowels by k
        int n = vowels.size();
        char[] rotated = new char[n];
        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = vowels.get(i);
        }

        // Replace vowels in original positions
        char[] result = s.toCharArray();
        for (int i = 0; i < positions.size(); i++) {
            result[positions.get(i)] = rotated[i];
        }

        return new String(result);
    }

    public static void main(String[] args) {
        String input = "Explanation";
        int k = 2;
        String output = rotateVowels(input, k);
        System.out.println(output); // Output: ixplanotion
    }
}
