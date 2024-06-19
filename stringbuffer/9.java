import java.util.Scanner;
class aceptstar{
    public static void main(String[] args){
       String a,b;
       System.out.println("enter the first string:");
       Scanner sc=new Scanner(System.in);
       a=sc.nextLine();
       System.out.println("enter the second string:");
       b=sc.nextLine();
       for(int i=0;i<Math.max(a.length(),b.length());i++){
          if(i<a.length()){
              System.out.print(a.charAt(i));
          }
           if(i<b.length()){
              System.out.print(b.charAt(i));
          }
       }
    }
}
