import java.util.Scanner;
class ascii{
    public static void main(String[] args){
        char ch;
        int a[]={65,66,67,68,69,70,71};
        System.out.print("enter the charcter:");
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        System.out.println("enter the which ascii value:");
        int n=sc.nextInt();
        for(int i=0;i<a.length-1;i++){
            if(n==1){
                System.out.println("Ascii of A--"+a[i]);
                break;
            }
            else if(n==2){
                 System.out.println("Ascii of B--"+a[i+1]);
                break;
            }
            else if(n==3){
                 System.out.println("Ascii of C--"+a[i+2]);
                break;
            }
            else if(n==4){
                 System.out.println("Ascii of D--"+a[i+3]);
                break;
            }
            else if(n==5){
                 System.out.println("Ascii of E--"+a[i+4]);
                break;
            }
            else if(n==6){
                 System.out.println("Ascii of F--"+a[i+5]);
                break;
            }
            else{
                 System.out.println("Ascii of G--"+a[i+6]);
                break;
            }
            
        }
    }
}