public class solution {
    static int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i=0;i<accounts.length;i++){
            for(int j=1;j<accounts[i].length;j++){       
                accounts[i][0] += accounts[i][j];
            }
            if(max<accounts[i][0]) max=accounts[i][0];
        }
        
        return max;
    }

    public static void main(String[] args) {
        int accounts[][] = {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(accounts));
    }
}
