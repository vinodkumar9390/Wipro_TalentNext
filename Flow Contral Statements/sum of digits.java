import java.util.Scanner;
class sum{
    public static void main(String[] args){
    int sum=0,num;
    System.out.println("enter the given number:");
    Scanner sc=new Scanner(System.in);
    num=sc.nextInt();
    while(num>0){
        int  rem=num%10;
        sum=sum+rem;
        num=num/10;
    }
    System.out.println("sum of digits is:"+sum);
    }
    
}