public class Stream {
    public static void main(String[] args) {
        StringBuilder p=new StringBuilder();
        skip(p,"anirudh");
    }
    static void skip(StringBuilder p,String up){
        if(up.isEmpty()){                           //isempty() is used the check whether the string is empty or not
            System.out.println(p.toString());
            return;
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            skip(p,up.substring(1));
        }else{
            p.append(ch);
            skip(p,up.substring(1));
        }
    }
}
