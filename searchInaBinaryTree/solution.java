class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class solution{
    static TreeNode searchBSTRecursive(TreeNode root, int val) {
        if(root==null) return null;
        if(root.val==val) return root;
        if(val<root.val) return searchBST(root.left, val);
        else return searchBST(root.right, val);
    }

    static TreeNode searchBST(TreeNode root, int val) {
        while(root!=null){
            if(root.val ==val) return root;
            if(val<root.val) root=root.left;
            else root=root.right;
        }
        return null;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        int val = 2;
        TreeNode fun = searchBST(root, val);
        System.out.println(fun.val+" "+fun.left.val+" "+fun.right.val);
    }
}