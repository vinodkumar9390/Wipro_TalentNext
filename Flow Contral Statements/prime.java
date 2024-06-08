import java.util.Scanner;
class prime{
    public static void main(String[] args){
        int num;
        System.out.println("enter the given number:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        boolean isprime=true;
        for(int i=2;i<num;i++){
            
            if(num%i==0){
                isprime=false;
                break;
            }
        }
        if(isprime){
            System.out.println("is a prime number:");
        
        }
        else{
            System.out.println("is not a prime number");
        }
    }
}