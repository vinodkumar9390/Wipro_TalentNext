class calculator{
    private int num1;
    private int num2;
    static int powerInt(int num1,int num2){
        int power=(int)Math.pow(num1,num2);
        return power;
    }
    static double poweDouble(double num1,double num2){
        double power1=(double)Math.pow(num1,num2);
        return power1;
    }
        
    
}
 class lunch{
    public static void main(String[] args){
        calculator s=new calculator();
        System.out.println(s.powerInt(2,3));
        System.out.println(s.poweDouble(4.5,5.5));
    }
}