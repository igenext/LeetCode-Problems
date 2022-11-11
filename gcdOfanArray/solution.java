class solution{

    static int findGCD(int[] nums) {
        int max = nums[0], min=nums[0];
        for(int i=1;i<nums.length;i++){
            max = Math.max(max,nums[i]);
            min = Math.min(min, nums[i]);
        }
        for(int j = min;j>=1;j--) if(max%j==0 && min%j==0) return j;
        return 1;
    }

    public static void main(String[] args) {
        int num[] = {3,3};
        System.out.println(findGCD(num));
    }
}