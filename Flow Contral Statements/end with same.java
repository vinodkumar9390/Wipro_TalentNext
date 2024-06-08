import java.util.Scanner;
class end{
    public static void main(String[] args){
     int num1,num2;
     System.out.println("enter the first number:");
     Scanner sc=new Scanner(System.in);
     num1=sc.nextInt();
     System.out.println("enter the second number:");
     num2=sc.nextInt();
    if(num1%10==num2%10){
     System.out.println("true");
    }
    else{
        System.out.println("false");
    }
    
    }
}