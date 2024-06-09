import java.util.Arrays;
import java.util.Scanner;
class minimum{
    public static void main(String[] args){
        int num,sum=0;
        double averge;
        System.out.print("enter number elements in the array:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
            System.out.print("enter the element "+i+":");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<num;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        System.out.println("min element :"+arr[0]);
        System.out.println("max element :"+arr[num-1]);
        
    }
}