import java.util.Scanner;
class  alpha{
    public static void main(String[] args) {
        char n1,n2;
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
    
        System.out.println("enter the first charcter:");
        n1=sc.next().charAt(0);
        System.out.println("enter the second charcter:");
        n2=sc.next().charAt(0);
        if(n1<n2){
            System.out.println("alphabtical order is"+" "+n1+" "+ n2);
        }
        else{
            System.out.println("alphabtical order is"+" "+n2+" "+ n1);
        }

    }
}