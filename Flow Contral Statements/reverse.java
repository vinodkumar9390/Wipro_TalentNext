import java.util.Scanner;
class reverse{
    public static void main(String[] args){
    int rev=0,num;
    System.out.println("enter the given number:");
    Scanner sc=new Scanner(System.in);
    num=sc.nextInt();
    while(num>0){
        int  rem=num%10;
       rev=rev*10+rem;
       num=num/10;
    }
    System.out.println("sum of digits is:"+rev);
    }
    
}