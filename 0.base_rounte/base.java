import java.util.*;

import static java.lang.System.out;
public class base {
    public static  void main(String[] args) {

        System.out.println("shameless: fuke the world!");
        /*
        //      数组
        int m=5, n= 10;
        int [] nums = new int[n];
        boolean[][] visited = new boolean[m][n];
        System.out.println(m+n);
        System.out.println(nums[0]);
        System.out.println(visited[0][0]);
        out.println('\n');
        if (nums.length == 0){
            return;
        }
        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
            out.println(nums[i]+1);
        }

        //      字符串String
        String s1 ="fuke world";
        char c = s1.charAt(2);

        char[] chars = s1.toCharArray();
        chars[1] = 'a';
        out.println(chars);
        String s2 = new String(chars);
        out.println(s2);

        if (s1.equals(s2)){
            out.println("Yes, Yes");
        } else {
            out.println("Oh my god! no no");
        }

        String s3 = s1 + "!";
        out.println(s3);

        StringBuilder sb = new StringBuilder();

        for (char c1 = 'a'; c1<='f'; c1++){
            sb.append(c1);
        }
        sb.append(",oh, yes");
        String res = sb.toString();
        out.println(res);
        */

        /*
        // ArrayList
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Integer> nums = new ArrayList<>();

        out.println(nums.isEmpty());
        out.println(nums.size());
        //out.println(nums.get(0));  out of bound
        out.println(nums.add(5));
        out.println(nums);
        */

        // 双链表 LinkedList, 底层同样使用数组实现
        LinkedList<Integer> nums1 = new LinkedList<>();
        out.println(nums1.contains(null));
        nums1.addLast(2);
        out.println(nums1);
        nums1.addFirst(1);
        out.println(nums1);
        nums1.removeFirst();
        out.println(nums1);

        //      哈希表
        //  从整数映射到字符串的哈希表， key-value对
        HashMap<Integer, String> map = new HashMap<>();
        // .get,  .put(key, value), .remove(key),  .getOrDefault(key, value)
        // set<K> keyset(). K is the type of key.
        // V putIfAbsent(K key, V value); If key don't exist, it will store key and key into hashmap.else don't do anything.


        // 哈希集合   HashSet
        Set<String> set = new HashSet<>();
        //  队列
        Queue<String> q = new LinkedList<>();
        //  堆栈
        Stack<Integer> s = new Stack<>();




    }

}
