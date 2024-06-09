import java.util.Arrays;

class RemoveDuplicates {
    public static void main(String[] args) {
        int[] a = {12, 34, 12, 45, 67, 89};
        int n = a.length;
        int[] b = new int[n];
        int count = 0;

        
        Arrays.sort(a);

        
        b[count++] = a[0];

        
        for (int i = 1; i < n; i++) {
            if (a[i] != a[i - 1]) {
                b[count++] = a[i];
            }
        }

        
        for (int i = 0; i < count; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
 