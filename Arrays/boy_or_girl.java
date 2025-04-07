import java.util.Scanner;

public class boy_or_girl {
    public static void main(String[] args) {
        //input a string
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        //count the number of distinct character in the string
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.indexOf(s.charAt(i))==i) {
                count++;
            }
        }
        if(count%2==0) {
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
    }
}
