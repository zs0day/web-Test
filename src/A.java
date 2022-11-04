public class A {
    private int a;
    private int b;
    public  void display(){
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        A e1 = new A();
        e1.a=1;
        e1.b=2;
        A e2 = new A();
        e2.a=3;
        e2.b=4;
//        e1.display();
//        System.out.println("------------------------");
//        e2.display();
//        System.out.println("------------------------");
        System.out.println(e1.a);
//        System.out.println("------------------------");
        System.out.println(e2.b);
    }
}
