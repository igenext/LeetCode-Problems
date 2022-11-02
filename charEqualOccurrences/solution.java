import java.util.*;


class solution{

    static boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<s.length();i++) mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0)+1);
        for(int values: mp.values()){
            hs.add(values);
        }
        return hs.size()==1;
    }

    public static void main(String[] args) {
        String s = "abcdadcb";
        System.out.println(areOccurrencesEqual(s));
    }
}