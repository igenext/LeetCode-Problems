import java.util.*;

class solution{

    static int addDigits(int num) {
        int rev = 0;
        if(num==0 || num/10==0) return num;
        while(num>0){
            rev += num%10;
            num/=10;
        }
        return addDigits(rev);
    
    }

    public static void main(String[] args) {
        
        int num = 38;
        System.out.println(addDigits(num));
    }
}