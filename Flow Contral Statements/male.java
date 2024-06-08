import java.util.Scanner;
class  Male{
    public static void main(String[] args) {
    
    
    String str;
    @SuppressWarnings("resource")
    Scanner  sc=new Scanner(System.in);
    System.out.println("enter the gender:");
    str=sc.nextLine();
    int age;
    System.out.println("enter the age:");
    age=sc.nextInt();
    if(str.equals("female") && age>=1 && age<=59)
    {
        System.out.println("perecentage of interst is 8.2%");
    }
    else if(str.equals("female") && age>=59 && age<=100){
        System.out.println("perecentage of interst is 9.2%");
    }
    else if(str.equals("male") && age>=1 && age<=59){
        System.out.println("perecentage of interst is 9.4%");
    }
    else{
        System.out.println("perecentage of interst is 10.4%");
    }
}




}