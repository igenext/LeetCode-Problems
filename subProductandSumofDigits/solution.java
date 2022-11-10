class solution{

    static int subtractProductAndSum(int n) {
        int prod = 1, sum=0;
        while(n>0){
            prod = prod*(n%10);
            sum +=(n%10);
            n/=10;
        }
        return prod-sum;
    }

    public static void main(String[] args) {
        int n = 0;
        System.out.println(subtractProductAndSum(n));
    }
}