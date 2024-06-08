import java.util.Scanner;
class rpali{
    public static void main(String[] args){
    int rev=0,num;
    System.out.println("enter the given number:");
    Scanner sc=new Scanner(System.in);
    num=sc.nextInt();
    int temp=num;
    while(num>0){
        int  rem=num%10;
       rev=rev*10+rem;
       num=num/10;
    }
    

    if(temp==rev){
        System.out.println("is palindrome");

    }
    else{
        System.err.println("is not palindrome");
    }
}
    
}