import java.util.Scanner;
class month{
    public static void main(String[] args){
        int num;
        System.out.println("enter the month:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        switch(num){
            case 1:
                System.out.println("january");
                break;
            case 2:
                System.out.println("feburaray");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("april");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("june");
                break;
            case 7:
                System.out.println("july");
                break;
            default :
              System.out.println("invalid");
            
                
            
        }
    }
}
