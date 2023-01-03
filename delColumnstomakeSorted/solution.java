class solution{

    static int minDeletionSize(String[] strs) {
        int result = 0;
        for(int i=0;i<strs[0].length();i++){
            for(int j=1;j<strs.length;j++){
                if(strs[j-1].charAt(i)>strs[j].charAt(i)){
                    result++;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        String[] strs = {"rrjk","furt","guzm"};
        System.out.println(minDeletionSize(strs));

    }
}