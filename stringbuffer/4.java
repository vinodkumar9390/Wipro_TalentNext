import java.util.Scanner;
class WritenFirstHalf{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        int n=s.length();
        if(n%2==0){
            System.out.println(s.substring(0,n/2));
        }
        else{
            System.out.println("null");
        }
    }
}
