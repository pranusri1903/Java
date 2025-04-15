import java.util.Scanner;

public class capi {
    public static void main(String[] args) {
        //input a string
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        //convert the first letter of the string to uppercase
        s= s.substring(0, 1).toUpperCase()+s.substring(1);
        System.out.println(s);

    }
}
