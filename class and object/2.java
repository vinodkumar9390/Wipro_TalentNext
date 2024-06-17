class calculator{
    static int powerInt(int num1,int num2){
        int num3=(int)Math.pow(num1 ,num2);
        return num3;
    }
    static double powerDouble(double num1,int num2){
        double num3=(double)Math.pow(num1,num2);
        return num3;
    }
}
public class launch{
    public static void main(String[] args){
       int res= calculator.powerInt(3 ,5);
       System.out.println(res);
       double res1= calculator.powerDouble(3.5 ,5);
       System.out.println(res1);
    }
}
