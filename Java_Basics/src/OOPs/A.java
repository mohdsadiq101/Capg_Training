package OOPs;

public class A {
    int i ;
    int j ;
    static int k ;
    public void display (int i , int j )
    {
        AboutThis t = new AboutThis();
        System.out.println(t.i + "\t" + t.j);
        System.out.println(i);
        System.out.println(j);
    }

    public void m1 (int i ,int j)
    {
        this.i=i;
        this.j=j;
        System.out.println(i);
        System.out.println(j);
    }

    public static void main(String[] args) {
        A a = new A();
        a.display(10, 20);
        a.m1(10, 20);

        System.out.println(a.i);
        A b = new A();

        System.out.println(b.i);
        a.k=100;

        System.out.println(b.k);
        System.out.println(a.k);

    }
}
