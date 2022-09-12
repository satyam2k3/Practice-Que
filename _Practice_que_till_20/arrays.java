package _Practice_que_till_20;

import java.util.*;

public class arrays {

    public static void display(int[] array) {
        int[] var1 = array;
        int var2 = array.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            System.out.println(var1[var3]);
        }

    }

    public static int maxima(int[] array) {
        int max = array[0];
        int[] var2 = array;
        int var3 = array.length;

        for(int var4 = 1; var4 < var3; ++var4) {
            int j = var2[var4];
            if (j > max) {
                max = j;
            }
        }

        return max;
    }

    public static int findIndex(int[] array, int req) {
        int ans = -1;

        for(int i = 0; i < array.length; ++i) {
            if (array[i] == req) {
                ans = i;
            }
        }

        return ans;
    }

    public static void barGraph(int[] array) {
        int max = maxima(array);

        for(int i = 1; i <= max; ++i) {
            int[] var3 = array;
            int var4 = array.length;

            for(int var5 = 0; var5 < var4; ++var5) {
                int j = var3[var5];
                if (j >= i) {
                    System.out.print("*     ");
                } else {
                    System.out.print("      ");
                }
            }

            System.out.println();
        }

    }

    public static void reverse(int[] array, int i, int j) {
        int il = i;

        for(int jl = j; il < jl; --jl) {
            int temp = array[il];
            array[il] = array[jl];
            array[jl] = temp;
            ++il;
        }

    }

    public static void rotate(int[] arr, int k) {
        k %= arr.length;
        if (k < 0) {
            k += arr.length;
        }

        reverse(arr, 0, arr.length - k - 1);
        reverse(arr, arr.length - k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
        int[] var2 = arr;
        int var3 = arr.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int i = var2[var4];
            System.out.println(i);
        }

    }

    public static int[] inverse(int[] a) {
        int[] ans = new int[a.length];

        int v;
        for(int i = 0; i < a.length; ans[v] = i++) {
            v = a[i];
        }

        return ans;
    }

    public static void subset(int[] a) {
        for(int i = 0; i < a.length; ++i) {
            for(int j = 0; j <= i; ++j) {
                for(int k = j; k <= i; ++k) {
                    System.out.print(a[k] + "\t");
                }

                System.out.println();
            }
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        barGraph(arr);
    }
}
