import java.util.Scanner;

class  alpha {
    public static void main(String[] args) {
        char n1, n2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first character:");
        n1 = sc.next().charAt(0);
        
        if (n1 >= 'a' && n1 <= 'z') {
            n2 = Character.toUpperCase(n1);
        } else if (n1 >= 'A' && n1 <= 'Z') {
            n2 = Character.toLowerCase(n1);
        } else {
            n2 = n1; 
        }
        
        System.out.println(n2);
        sc.close();
    }
}
