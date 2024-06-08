import java.util.Scanner;
class even{
    public static void main(String[] args){
        int lower,upper;
        System.out.println("enter the lower limit:");
        Scanner sc=new Scanner(System.in);
        lower=sc.nextInt();
        System.out.println("enter the upper limit:");
        upper=sc.nextInt();
        for(int i=lower;i<=upper;i++){
            if(i%2==0){
                System.out.print(i);
            }
            else{
                System.out.println();
            }
        }
    }
}
