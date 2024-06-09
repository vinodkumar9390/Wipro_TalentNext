import java.util.Scanner;
class twoarray{
    public static void main(String[] args){
        int n,c=0;
        System.out.println("number of elements:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
           
            
        }
        int m=a[0];
        if(n==9){
            
            for(int i=0;i<3;i++){
                
                for(int j=0;j<3;j++){
                    System.out.print(a[c]+" ");
                    c++;
                }
                System.out.println();
            }
            for(int i=0;i<9;i++){
                if(m<a[i]){
                    m=a[i];
                }
            }
            System.out.println("biggest element is:"+m);
        }
        
        else{
            System.out.println("enter 9 elements");
        }
        
    }
}