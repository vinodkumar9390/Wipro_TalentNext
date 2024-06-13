class person{
    String name;
    person(){
        name="vinod";
    }
    person(String n){
        name=n;
    }
}
class employee extends person{
    double salary;
    int insurance;
    employee(){
        salary=10023.2;
        insurance=12345;
    }
    employee(double s ,int i){
        super("tharun");
        salary=s;
        insurance=i;
    }
    void display(){
        System.out.println("name is"+" "+name);
        System.out.println("salary is"+" "+salary);
        System.out.println("insurance number"+" "+insurance);
    }
}
class Testemployee{
    public static void main(String[] args){
        employee s=new  employee(10234.5,1345);
        s.display();
    }
}