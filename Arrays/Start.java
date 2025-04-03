import java.util.*;

public class Start {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int c= sc.nextInt();
            int b = sc.nextInt();

            if (a + c + b >= 2) {
                count++;
            }
        }

        System.out.println(count);
    }
}
