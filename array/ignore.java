import java.util.Arrays;
import java.util.Scanner;
class ignore{
    public static void main(String[] args){
        int n;
        System.out.println("enter number of elements in the array:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the element "+(i+1));
            a[i]=sc.nextInt();
        }
        System.out.println("berofe removing 10:");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("after  removing 10:");
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            if(a[i]==10){
                a[i]=0;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}