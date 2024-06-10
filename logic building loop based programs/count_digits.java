import java.util.Scanner;
class count_digits{
    public static void main(String[] args){
        int count=0,num;
        System.out.println("enter the digit:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        while(num!=0){
            int rem=num%10;
            count+=1;
            num=num/10;
        }
        System.out.println("number of digits count:"+count);
        sc.close();
    }
}