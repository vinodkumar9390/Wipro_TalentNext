import java.util.Scanner;
class Demo{
    public static void main(String[] args) {
        int num;
        System.out.println("enter the number:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        if(num==0){
            System.out.println(num+" "+"is a zero");
        }
        else if(num>0){
            System.out.println(num+" "+" is a postive number");


        }
        else{
            System.out.println(num+" "+" is a negtive number:");
        }

        }

        

    }

