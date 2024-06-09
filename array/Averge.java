import java.util.Scanner;

class Averge{
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
            sum=sum+arr[i];
        }
        System.out.println();
        averge=sum/arr.length;
        System.out.println("sum of array is:"+sum);
        System.out.println("averge of the array is "+averge);
        
        
    }
}