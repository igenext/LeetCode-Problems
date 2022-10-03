import java.util.*;

class solution{

    static int lengthOfLastWord(String s) {
        Map<Integer,Character> mp = new HashMap<>();
        boolean con = false;
        for(int i=s.length()-1;i>=0;i--){
           
            
            if(s.charAt(i)!=' '){
                mp.put(i,s.charAt(i));
                con = true;
                continue;
            }
            if(con) break;
            
        }
        return mp.size();
    }
    public static void main(String[] args) {
        
        String s = "  fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));

    }
}