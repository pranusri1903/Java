import java.util.*;
public class beautiful {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][5];
        int x=0,y=0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
                if(arr[i][j]==1){
                    x=i;
                    y=j;
                }
            }
        }
        int distance = Math.abs(x-2) + Math.abs(y-2);
        System.out.println(distance);
    }
}
