import java.util.Scanner;

class  Deno {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();

        if (str.length() > 1) {
            System.out.println("The characters from the third position onwards are:");
            for (int i = 2; i < str.length(); i++) {
                System.out.print(str.charAt(i));
            }
        } else {
            System.out.println("The string is too short.");
        }
    }
}
