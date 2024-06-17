class Shape{
    void draw(){
        System.out.println("it's a drawing shape:");
    }
    void erase(){
        System.out.println("it is a erasing shape");
    }
}
class circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle");
    }
    void erase(){
        System.out.println("Erasing Circle");
    }
}
class Tringle extends Shape{
    void draw(){
        System.out.println("Drawing tringle");
    }
    void erase(){
        System.out.println("Erasing tringle");
    }
}
class Squre extends Shape{
    void draw(){
        System.out.println("Drawing Squre");
    }
    void erase(){
        System.out.println("Erasing Squre");
    }
}

class gemotry{
    void display(Shape ref){
    ref.draw();
    ref.erase();
    }
}
class Lunch1{
    public static void main(String[] args){
        gemotry g=new gemotry();
        circle c=new circle();
        Tringle t=new Tringle();
        Squre s=new Squre();
        g.display(c);
        g.display(t);
        g.display(s);
    }
}