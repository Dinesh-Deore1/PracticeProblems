public class Fibonacci {
    public static void main(String[] args) {

                Fibonacci ob = new Fibonacci();
                ob.fib(10);

    }
    public void fib(int n)
    {
        int a=0;
        int b=1;
        for(int i=0;i<n;i++)
        {
            System.out.println(a);
            int c=a+b;
            a=b;
            b=c;
        }
    }
}
