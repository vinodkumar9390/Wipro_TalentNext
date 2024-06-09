class present{
    public static void main(String[] args){
      int a[]={1,4,1,4,1,4};
      boolean pre=true;
      for(int i=0;i<a.length-1;i++){
          if(a[i]==1 || a[i]==4){
              pre=true;
          }
          else{
              pre=false;
              break;
          }
      }
      if(pre){
          System.out.println("TRUE");
      }
      else{
          System.out.println("false");
      }
    }
}