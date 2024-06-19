import java.util.Scanner;
class repeat{
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer();
        String a;
        System.out.println("enter the string:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextLine();
        System.out.println("enter the last chatacter:");
        int n=sc.nextInt();
        sb.append(a);
        String st=sb.substring(n-1,sb.length());
        for(int i=0;i<n;i++){
            System.out.print(st);
        }
    }
}
