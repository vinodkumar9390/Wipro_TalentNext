import java.util.Scanner;
class odd{
    public static void main(String[] args){
        int num;
        System.out.println("enter the given ");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        if(num%2==0){
            System.out.println(num+" "+"is a even number");

        }
        else{
            System.out.println(num+" "+" is a odd number");
        }
    }
}