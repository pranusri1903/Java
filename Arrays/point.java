import java.sql.SQLOutput;
import java.util.*;
public class point {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int x=0;
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            if(i>=k){
                if(arr[i]==arr[k]&&arr[k]!=0)
                {
                    if(arr[k]==0){
                        k=0;
                    }
                    x++;
                }
            }
        }
        System.out.println(x+k);
    }
}
