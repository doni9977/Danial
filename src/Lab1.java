package src;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        int min = findMin(array,n);
        System.out.println(min);

        sc.close();
    }

    public static int findMin(int[] array, int n){
        if (n == 1) {
            return array[0];
        }
        int minOfRest = findMin(array, n - 1);

        if (minOfRest < array[n-1]) {
            return minOfRest;
        } else {
            return array[n-1];
        }
    }
}
