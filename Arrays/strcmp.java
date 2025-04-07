import java.util.Scanner;

public class strcmp {
    public static void main(String[] args) {
        //input 2 strings
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().toLowerCase();
        String s2 = sc.nextLine().toLowerCase();
        //compare the strings
        if (s1.equals(s2)) {
            System.out.println("0");
        } else if (s1.compareTo(s2) < 0) {
            System.out.println("-1");
        } else {
            System.out.println("1");
        }
    }
}
