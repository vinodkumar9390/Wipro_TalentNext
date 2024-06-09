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
        if(a.length==4){
            
            for(int i=0;i<2;i++){
                
                for(int j=0;j<2;j++){
                    System.out.print(a[c]+" ");
                    c++;
                }
                System.out.println();
            }
            System.out.println("reverse elements:");
            for(int i=0;i<2;i++){
                
                for(int j=0;j<2;j++){
                    System.out.print(a[c-1]+" ");
                    c--;
                }
                System.out.println();
            }
            
        }
        
        else{
            System.out.println("enter four elements");
        }
        
    }
}
