class midway{
    public static void main(String[] args){
        int a[]={1,2,3};
        int b[]={2,4,5};
        int c[]=new int[2];
        c[0]=a[1];
        c[1]=b[1];
        System.out.print("midway:"+"[");
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
        System.out.print("]");
    }
}