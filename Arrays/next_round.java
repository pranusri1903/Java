import java.util.*;
public class next_round {
    public static int countSmallerThanTarget(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int result = arr.length; // Default to array length if all elements are >= target

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] < target) {
                // Found a value smaller than target
                result = mid; // Possible answer
                high = mid - 1; // Search on the left to find earlier occurrence
            } else {
                // arr[mid] >= target, go right
                low = mid + 1;
            }
        }

        return arr.length - result;
    }

    public static void main(String[] args) {
        //input n and k
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int x=0;
        //input n elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]>0){
                x++;
            }
        }
        if(arr[k-1]==0){
            System.out.println(x);
            return;
        }
        n= countSmallerThanTarget(arr, arr[k-1]);
        System.out.println(arr.length-n);
    }
}
