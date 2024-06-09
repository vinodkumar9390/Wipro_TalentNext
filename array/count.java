import java.util.Scanner;
class find{
    public static void main(String[] args) {
        
    
    char ch;
   System.out.println("enter the character:");
    Scanner sc=new Scanner(System.in);
    ch=sc.next().charAt(0);
    if(ch<='a' || ch>='z'){
        System.out.println("Alpha");
    }
    else if(ch>='1' || ch<='9'){
        System.out.println("Number");
    }
    else{
        System.out.println("special character");
    }

    }
}