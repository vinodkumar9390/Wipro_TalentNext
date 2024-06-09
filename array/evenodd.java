import java.util.Arrays;
class evenodd {
    public static void main(String[] args) {
        int[] a = {1, 0, 2, 3, 4, 0, 1};
        
        int n = a.length;
        

        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
               System.out.print(a[i]+" ") ;
            }
        }
        for(int i=0;i<n;i++){
            if(a[i]%2!=0){
                System.out.print(a[i]+" ");;
            }
        }

      
    }
}
