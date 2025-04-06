import java.sql.SQLOutput;

public class factorial{

    public static void main(String[] args){
        int ans=fact(4);
        System.out.println(ans);
    }
    public static int fact(int n){
        if(n<2){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }

}
