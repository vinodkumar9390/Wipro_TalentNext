import java.util.Arrays;
import java.util.Scanner;
class largest{
    public static void main(String[] args){
        int n;
        System.out.println("enter the number of elements:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the element "+(i+1)+":");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        Arrays.sort(a);
        System.out.println("first two smallest number:"+a[0]+" "+a[1]);
        System.out.println("largest two elements:"+a[n-1]+" "+a[n-2]);
        
    }
}
