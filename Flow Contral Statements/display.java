import java.util.Scanner;
class number{
    public static void main(String[] args){
        int num;
        System.out.println("enter number of elements to display:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        for(int i=1;i<=num;i++){
            System.out.print(i+" ");
        }
    }
}