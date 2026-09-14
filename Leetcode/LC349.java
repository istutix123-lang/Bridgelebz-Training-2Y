import java.util.Arrays;
class LC349 {
    public static void main(String []args) {
        int[] arr1 = {1, 2, 2, 1};
        int[] arr2 = {2, 2};
        int[] newar = new int[Math.min(arr1.length, arr2.length)];
        int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    boolean found = false;
                    for (int x = 0; x < k; x++) {
                        if (newar[x] == arr1[i]) {
                            found = true;
                        }
                    }
                    if (!found) {
                        newar[k] = arr1[i];
                        k++;
                    }
                    break;
                }
            }
        }

        int[] result = Arrays.copyOf(newar, k);

        System.out.println(Arrays.toString(result));
    }
}
