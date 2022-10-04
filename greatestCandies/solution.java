import java.util.*;
import java.lang.Math;

public class solution {
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> re = new LinkedList<>();
        int max = 0;
        for(int i=0;i<candies.length;i++){
            max = Math.max(max,candies[i]);
        }
        for(int j=0;j<candies.length;j++){
            if(candies[j]+extraCandies >= max) re.add(true);
            else re.add(false);
        }

        return re;

    }

    public static void main(String[] args) {
        
        int candies[] = {12,1,12}, extraCandies = 10;
        List<Boolean> li = kidsWithCandies(candies, extraCandies);
        for(int k=0;k<li.size();k++){
            System.out.print(li.get(k) + " ");
        }

    }
}
