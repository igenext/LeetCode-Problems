class solution{
    static int xorOperation(int n, int start) {
        int re = start;
        int count = 1;
        while(count!=n){
            re^=start+2*count;
            count++;
        }
        return re;
    }

    public static void main(String[] args) {
        int start = 3,n=4;
        System.out.println(xorOperation(n, start));
    }
}