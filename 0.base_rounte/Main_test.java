// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main_test {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!\n");
        //double x = binomial(100, 50, 0.25);
        //System.out.printf(x);

        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(6);

        // 修改节点的值
        node1.val = 10;
        node1.left = node2;
        node1.right = node3;
        System.out.printf(String.valueOf(node1.val));

        String s1 = "hello world";
        char c = s1.charAt(2);      //获取第二个字符

    }

    /*public static double lg(int N){
        return 0;
    }

    public static double binomial(int N, int k, double p){
        if (N==0 && k==0) return 1.0;
        if (N<0 || k<0) return 0.0;
        return (1-p)*binomial(N-1, k, p) + p*binomial(N-1, k-1, p);
    }*/
    public static class TreeNode{
        int val;        //节点存储的值
        TreeNode left;
        TreeNode right;
        //构建函数
        TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }



}