import java.util.Scanner;
class binary{
    public static void main(String[] args){
        String str="";
        int num;
        System.out.println("enter the decimal number:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        while(num!=0){
            int rem=num%2;
            str=rem+str;
            num=num/2;
        }
        System.out.println("binary number :"+str);
        sc.close();
    }
}
