
public class solution {
   
    static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(int i=0;i<operations.length;i++)
        x+=(operations[i].contains("++"))?(1):(-1);
        return x;

    }

    public static void main(String[] args) {
        String s[] = {"++X","++X","X++"};
        System.out.println(finalValueAfterOperations(s));
    }
    
}
