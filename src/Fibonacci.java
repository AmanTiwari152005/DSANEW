public class Fibonacci {

    public static void main(String[] args) {
        int ans=fib(6);
        System.out.println(ans);
    }
    public static int fib(int n){
        if(n<2) {
            return n;
        }else{
             return (fib(n-1) + fib(n-2));
            }
        }
    }

