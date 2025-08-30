import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // number of elements
        int sum = 0;
        for (int i = 0; i < a; i++) {
            int n = sc.nextInt();
            sum += n;
        }
        double avg = (double) sum / a;
        double targetAvg = avg * avg;

        double k = targetAvg * (a + 1) - sum;
        System.out.println((int) Math.ceil(k)); 
    }
}
