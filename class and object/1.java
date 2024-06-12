class box{
    private int width;
    private int height;
    private int depth;
    box(int width , int height, int depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
    int vol(){
        int volume=width*height*depth;
        return volume;
    }
    
}
class result{
    public static void main(String[] args){
        box s=new box(10,2,3);
        System.out.print(s.vol());
    }
}
