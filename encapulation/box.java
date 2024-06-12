class author{
    private String name;
    private String email;
    private char ch;
    private double price;
    private int  qtyInStack;
    author(String name,String email,char ch){
        this.name=name;
        this.email=email;
        this.ch=ch;
    }
    void setName(double price,int qtyInStack ){
        
    this.price=price;
    this.qtyInStack=qtyInStack;
    }
    String getName(){
        return name;
        
        
    }
    String getmail(){
       
        return email;
        
    }
    char getGender(){
        return ch;
    }
    double prize(){
        return price;
    }
    int stack(){
        return qtyInStack;
    }
}
class box{
    public static void main(String[] args){
        double price=1234;
        int qtyInStack=12;
        author s=new author("vinod","saveetha@.com",'m');
        s.setName(price,qtyInStack);
        System.out.println(s.getName());
        System.out.println(s.getmail());
        System.out.println(s.getGender());
        System.out.println(s.prize());
        System.out.println(s.stack());
        
        
    }
}