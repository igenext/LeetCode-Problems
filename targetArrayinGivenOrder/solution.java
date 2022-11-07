import java.util.*;

class solution{

    static int[] createTargetArray(int[] nums, int[] index) {
        int re[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(re[index[i]]==0 && re[index[i]]!=0){
                re[index[i]]=nums[i];
                continue;
            }
            for(int j=nums.length-1;j>index[i];j--){
                re[j]=re[j-1];
            }
            re[index[i]]=nums[i];
            
        }
        return re;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4}, index = {0,1,2,2,1};
        int re[] = createTargetArray(nums, index);
        for(int k=0;k<nums.length;k++) System.out.print(re[k]+" ");
    }
}