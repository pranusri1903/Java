import java.util.*;
public class domino {
    public static void main(String[] args) {
        //input two integers
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        n=n*m;
        n=n/2;
        System.out.println(n);
    }
}
