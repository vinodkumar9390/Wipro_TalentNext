import java.util.Scanner;
class cocatei{
    public static void main(String[] args){
        
        String s,s1,s2;
        System.out.println("enter the string1");
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        System.out.println("enter the second string2:");
        s1=sc.nextLine();
        s2=s+s1;
        System.out.println("concate two strings with lowercase: "+s2.toLowerCase());
        
    }
}