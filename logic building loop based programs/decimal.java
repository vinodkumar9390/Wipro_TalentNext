import java.util.Scanner;
class decimal{
    public static void main(String[] args){
        
        int num,sum=0,d=0;
        System.out.println("enter the binary number:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        while(num!=0){
            int rem=num%10;
            if(rem==1){
                sum+=Math.pow(2,d);
                
            
            
            }
            num=num/10;
            d=d+1;
            
            
        }
        System.out.println("binary number :"+sum);
    }
}
