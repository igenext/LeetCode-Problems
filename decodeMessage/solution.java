import java.util.*;


class solution{

    static String decodeMessage(String key, String message) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Character> mp = new HashMap<>();
        char ch = 'a';
        for(int i=0;i<key.length();i++){
            if(key.charAt(i)==' ' || mp.containsKey(key.charAt(i))) continue;
            mp.put(key.charAt(i),ch);
            ch++;
        }
        for(int k=0;k<message.length();k++){
            if(message.charAt(k)==' ') {
                sb.append(' ');
                continue;
            }
            if(mp.containsKey(message.charAt(k))) sb.append(mp.get(message.charAt(k)));

        }
        return sb.toString();        
    }

    public static void main(String[] args) {
        String message ="zwx hnfx lqantp mnoeius ycgk vcnjrdb", key =  "eljuxhpwnyrdgtqkviszcfmabo";
        System.out.println(decodeMessage(key, message));
    }
}