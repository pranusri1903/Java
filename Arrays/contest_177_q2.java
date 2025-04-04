import java.util.*;
public class contest_177_q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int f=0;f<t;f++){
            int count=0;
            int n=sc.nextInt();
            int k=sc.nextInt();
            int x=sc.nextInt();
            int[] a= new int[n];
            int[] b= new int[n*k];
            if(n<1||k>100000)
            {
                System.out.println(0);
                return;
            }
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }
            for (int i = 0; i < n*k; i++) {
                b[i]=a[i%n];
            }
            for (int i = 0; i < n*k; i++) {
                int c=b[i];
                for (int j = i+1; j < n*k; j++) {
                    c += b[j];
                    if(c>=x){
                        count++;
                        break;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
