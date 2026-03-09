package OOPs;

public class AboutThis {
    int i ;
    int j ;

    public void m1(int i , int j )
    {
        i=i;
        j=j;

        System.out.println(i);
        System.out.println(j);
    }

    public static void main(String[] args) {

        AboutThis a = new AboutThis();

        System.out.println(a.i);
        System.out.println(a.j);
        a.m1(10, 20);
        System.out.println(a.i);
        System.out.println(a.j);

    }
}