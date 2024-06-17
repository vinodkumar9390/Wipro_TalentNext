class fruit{
    String name;
    String taste;
    int size;
    void eat(){
        name="mango";
        taste="sweet";
        
    }
}
class Apple extends fruit{
    Apple(){
    name="apple";
    taste="sweet";
    }
    void eat(){
       System.out.println("fruit name:"+name);
       System.out.println("fruit name:"+taste);
        
        
    }
}
class Orange extends fruit{
    Orange(){
    name="Orange";
    taste="sour";
    }
    void eat(){
       System.out.println("fruit name:"+name);
       System.out.println("fruit name:"+taste);
        
        
    }
}
 class Lunch{
    public static void main(String[] args){
        Apple c=new Apple();
        c.eat();
        Orange o=new Orange();
        o.eat();
    }
}