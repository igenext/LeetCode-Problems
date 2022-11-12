import java.util.*;

class solution{

    static int countTriples(int n) {
        int count=0;
        HashSet<Integer> hs  = new HashSet<>();

        for(int j=1;j<=n;j++){
            hs.add((int)Math.pow(j, 2));
        }

        for(int i=1;i<n;i++){
            for(int k=1;k<n;k++){
                if(hs.contains((int)(Math.pow(i, 2)+Math.pow(k, 2)))) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(countTriples(n));
    }
}