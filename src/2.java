import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int[] arr2 = new int[m];
        for (int j = 0; j < m; j++) {
            arr2[j] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr1[i] != arr1[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}