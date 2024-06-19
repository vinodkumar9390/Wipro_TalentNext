import java.util.Scanner;
class aceptstar{
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        String s=sc.nextLine();
        sb.append(s);
        int star=s.indexOf("*");
       if(star>0){
           System.out.print((s.substring(0,star-1)));
           System.out.print((s.substring(star+2,s.length())));
       }
       else{
           System.out.println(s);
       }
    }
}