import java.util.Scanner;
public static void main(String[]args){

   int[] arr = {1,2,3,0,0,0};
   int m = 3;
   int [] arr2 = {2,5,6};
   int n = 3;
        int i = 0;
        int j = 0;
        int k = 0;
        int[] arrN = new int[m + n];
        while (i < m && j < n) {
            if (arr[i] <= arr2[j]) {
                arrN[k] = arr[i];
                i++;
            } else {
                arrN[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < m) {
            arrN[k] = arr[i];
            i++;
            k++;
        }
        while (j < n) {
            arrN[k] = arr2[j];
            j++;
            k++;
        }
        for (int x = 0; x < m + n; x++) {
            arr[x] = arrN[x];
            System.out.print(arr[x]+" ");
        }
    }

