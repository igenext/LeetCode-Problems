import java.util.*;


class solution{

    static boolean wordPattern(String pattern, String s) {
        String splString[] = s.split(" ");
        Map<Character, String> mp = new HashMap<>();
        if(pattern.length()!=splString.length) return false;
        for(int i=0;i<pattern.length();i++){
            char val = pattern.charAt(i);
            if(mp.containsKey(val)){
                if(!mp.get(val).equals(splString[i])) return false;
            }
            else {
                if(mp.containsValue(splString[i])) return false;
                mp.put(val, splString[i]);
            }

        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba", s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
    }
}