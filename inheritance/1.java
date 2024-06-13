class Animal{
    void eat(){
        System.out.println("animal eat  grass");
    }
    void sleep(){
        System.out.println("animal sleep after eatinng");
    }
}
class Bird extends Animal{
    void eat(){
        System.out.println("birds eat small insects:");
    }
    void sleep(){
        System.out.println("birds sleep at night time");
    }
    void fly(){
        System.out.println("when birds fly it's looks beatiful");
    }
}
class launch{
    public static void main(String[] args){
        Bird b=new Bird();
        b.eat();
        b.sleep();
        b.fly();
    }
}