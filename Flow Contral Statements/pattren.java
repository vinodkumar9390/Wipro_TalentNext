import java.util.Scanner;
class pattren{
    public  static void main(String[] args){
        int rows;
        System.out.println("enter the number of rows:");
        Scanner sc=new Scanner(System.in);
        rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}