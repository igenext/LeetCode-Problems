import java.util.*;

class solution{

    static int[] smallerNumbersThanCurrent(int[] nums) {
        int re[] = nums.clone();
        Map<Integer, Integer> mp = new HashMap<>();
        Arrays.sort(re);
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(re[i])) continue;
            mp.put(re[i],i);
        }
        for(int j=0;j<nums.length;j++){
            re[j] = mp.get(nums[j]);
        
        }
        return re;
    }

    public static void main(String[] args) {
        int nums[] = {8,1,2,2,3};
        int re[] = smallerNumbersThanCurrent(nums);
        for(int j=0;j<nums.length;j++){
            System.out.print(re[j]+" ");
        }
        System.out.println();
    }
}