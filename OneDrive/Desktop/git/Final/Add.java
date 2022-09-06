public final class Add {
     public final int a;
     public final int b;

    public Add(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public final void addTwo(){
        System.out.println(a+b);
    }
    public static void main(String[] args){
        Add add = new Add(10, 20);
        add.addTwo();
    }


}
