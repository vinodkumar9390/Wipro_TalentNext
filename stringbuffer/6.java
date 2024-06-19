import java.util.*;

class middle{
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        System.err.println("enter the string:");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sb.append(s);
        System.out.println(s.substring(1,sb.length()-1));
    }
}