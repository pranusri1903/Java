import java.util.Arrays;
import java.util.Scanner;

public class sortstrint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();

        String[] str = s.split("\\+");
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i!=arr.length-1){
                System.out.print("+");
            }
        }
    }
}
