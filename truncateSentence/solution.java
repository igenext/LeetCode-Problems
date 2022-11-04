import java.util.*;


class solution{

    static String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for(String re: s.split(" ")){
            k--;
            sb.append(re);
            if(k==0) break;
            sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "chopper is not a tanuki";
        int k = 4;
        System.out.println(truncateSentence(s, k));
    }
}