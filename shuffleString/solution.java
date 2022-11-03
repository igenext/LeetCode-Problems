import java.util.*;

class index{

    static String restoreString(String s, int[] indices) {
        char[] ch = new char[indices.length];
        for(int i=0;i<indices.length;i++) ch[indices[i]]=s.charAt(i);
        return new String(ch);
    }

    public static void main(String[] args) {
        String s = "codeleet";
        int indeices[] = {4,5,6,7,0,1,2,3};
        System.out.print(restoreString(s, indeices));
    }
}