class solution{

    static boolean isSameAfterReversals(int num) {
        return num==0 || num%10!=0;
    }

    public static void main(String[] args) {
        int num  = 12300;
        System.out.println(isSameAfterReversals(num));
    }
}