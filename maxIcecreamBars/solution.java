import java.util.Arrays;

class solution{

    static int maxIceCream(int[] costs, int coins) {
        int result = 0, sumCoins = 0;

        Arrays.sort(costs);

        for(int i=0;i<costs.length;i++){
            if(sumCoins+costs[i]>coins) break;
            sumCoins+=costs[i];
            result+=1;
        }

        return result;
    }


    public static void main(String[] args) {
        int costs[] = {1,6,3,1,2,5}, coins = 20;
        System.out.println(maxIceCream(costs, coins));
    }
}