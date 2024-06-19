import java.util.Scanner;
class palindrome{
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer();
        String s;
        System.out.println("enter the string:");
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        sb.append(s);
        sb.reverse();
        if(s.equals(sb.toString())){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not  palindrome");
        }
    }
}