import java.util.Scanner;
class prime{
    public static void main(String[] args){
        int num,num1;
        System.out.println("enter the given number:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        System.out.println("enter the upper limit:");
        num1=sc.nextInt();
        for(int i=num;i<=num1;i++){
            boolean isprime=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime){
                System.out.print(i+" ");
            }
        }
        
    }
}