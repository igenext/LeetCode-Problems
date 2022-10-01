import java.util.*;


class solution{

    static int[] fun(int arr[], int target){

        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for(int i=0;i<arr.length;i++){
                if(mp.containsKey(target-arr[i])) return new int[]{mp.get(target-arr[i]),i};
                mp.put(arr[i],i); 
        }

        return (arr);

    }

    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 17;
        int s[] = fun(arr, target);
        for(int i=0;i<s.length;i++){
            System.out.print(s[i]+ " ");
        }
        System.out.println();
    }

}