import java.util.Scanner;
class find{
    public static void main(String[] args){
        int num,num1;
        System.out.print("enter number elements in the array:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        int arr[]=new int[num];
        System.out.println("enter element to find");
        num1=sc.nextInt();
        for(int i=0;i<num;i++){
            System.out.print("enter the element "+i+":");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<num;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<num;i++){
            if(arr[i]==num1){
                System.out.println("search element is"+num1);
                System.out.println("index is:"+(i+1));
            }
            else{
                System.out.println(-1);
                break;
            }
        }
        
        
    }
}