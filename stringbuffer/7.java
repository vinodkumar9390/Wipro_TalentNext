import java.util.Scanner;
class removex{
    public static void main(String[] args){
       StringBuffer sb=new StringBuffer();
       System.out.println("enter the string:");
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       sb.append(s);
       int n=sb.length();
       if('x'==sb.charAt(0) || 'x'==sb.charAt(n-1)){
           if('x'==sb.charAt(0) && 'x'==sb.charAt(n-1)){
               System.out.println(sb.substring(1,n-1));
           }
           else if('x'==sb.charAt(0)){
                 System.out.println(sb.substring(1,n));
           }
           else{
                System.out.println(sb.substring(0,n-1));
           }
           
       }
       else{
            System.out.println(sb);
       }
    }
}