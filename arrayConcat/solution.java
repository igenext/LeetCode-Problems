
public class solution {
    
    static int[] getConcatenation(int[] nums) {
        int arr[] = new int[2*nums.length];
        System.arraycopy(nums, 0, arr, 0, nums.length);
        System.arraycopy(nums, 0, arr, nums.length, nums.length);

        return (arr);
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3};
        int arr[] = getConcatenation(nums);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
