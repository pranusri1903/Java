import java.util.Scanner;

public class treasure_hunt {
    public static void main(String[] args) {
        //input an integer t
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] arr=new String[t];
        for (int i = 0; i < t; i++) {
            //input 3 integers x,y,a
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();
            int p=a/(x+y);
            if(((p+1)*x)+(p*y)>a){
                arr[i]="NO";
            }
            else{
                arr[i]="YES";
            }
        }
        for (int i = 0; i < t; i++) {
            System.out.println(arr[i]);
        }
    }
}
