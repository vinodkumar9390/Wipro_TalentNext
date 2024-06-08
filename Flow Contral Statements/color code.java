import java.util.Scanner;
class color{
    public static void main(String[] args){
        char c;
        System.out.println("enter the given color code:");
        Scanner sc=new Scanner(System.in);
        c=sc.next().charAt(0);
        
        if(Character.toUpperCase(c)=='R'){
            System.out.println("given color code is:"+" "+"RED");
        }
        else if(Character.toUpperCase(c)=='W'){
            System.out.println("given color code is:"+" "+"WHITE");
        }
        else if(Character.toUpperCase(c)=='O'){
            System.out.println("given color code is:"+" "+"ORANGE");
        }
        else if(Character.toUpperCase(c)=='Y'){
            System.out.println("given color code is:"+" "+"YELLOW");
        }
        else if(Character.toUpperCase(c)=='G'){
            System.out.println("given color code is:"+" "+"GREEN");
        }
        else{
            System.out.println("invalid code");
        }
    }
}
