
public class solution {
    
    static int[] shuffle(int[] nums, int n) {

        int arr[] = new int[2*n];
        for(int i=0;i<n;i++){
            arr[2*i] = nums[i];
            arr[2*i+1] = nums[i+n]; 
        }

        return (arr);
        
    }

    public static void main(String[] args) {
        int num[] = {2,5,1,3,4,7}, n=3;
        int ans[] = shuffle(num, n);
        for(int i=0;i<num.length;i++) System.out.print(ans[i]+" ");
    }

}
