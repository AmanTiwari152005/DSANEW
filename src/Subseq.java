import java.util.ArrayList;
import java.util.Arrays;
public class Subseq {
    public static void main(String[] args) {
        System.out.println(ss("","abc"));
    }
    static ArrayList<String> ss(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left=ss(p+ch,up.substring(1));
        ArrayList<String> right=ss(p,up.substring(1));

        left.addAll(right);
        return left;
    }
}
