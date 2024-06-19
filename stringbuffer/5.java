import java.util.Scanner;
class slicing{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        int n=s.length();
       System.out.println(s.substring(1,n-1));
    }
}
