import java.util.Scanner;
class copies{
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        String s=sc.nextLine();
        int n=s.length();
        sb.append(s);
        String s1=sb.substring(0,2);
        for(int i=0;i<n;i++){
            System.out.print(s1);
        }
    }
}