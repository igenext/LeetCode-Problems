class solution{

    static int[] decode(int[] encoded, int first) {
        int result[] = new int[encoded.length+1];
        result[0] = first;
        for(int i=0;i<result.length-1;i++){
            result[i+1] = result[i]^encoded[i];
        }
        return result;

    }


    public static void main(String[] args) {
        
        int encoded[] = {6,2,7,3}, first = 4;
        int result[] = decode(encoded, first);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }

    }
}
