package 变量;

import java.util.Arrays;

public class Arraytest {
    public static void main(String[] args) {
        int[] a = new int[2];
        a[0] = 1;

        //如果指定了数组的内容，就不能同时设置数组的长度
        int[] b = new int[]{1,2,4,5};
        //这种省略new也可以
        int[] b2 ={5,0,2,4,1,2,3};

        int[][] c = new int[][]{{1,2},{3,4},{4,5},{1,2}};
        int[][] c1 = new int[2][];
        c1[0] = new int[4];

        //增强型for 循环只能用来取值
        for (int val: b) {
            //System.out.println(val);
        }

        //Arrays数组工具类
        //数组复制
        int[] b3 = Arrays.copyOfRange(b, 1,3);
        //数组转换为字符串
        String s = Arrays.toString(b3);

        //数组排序
        Arrays.sort(b2);
        //System.out.println(b2);
        //查找元素出现的位置
        //使用binarySearch进行查找之前，必须使用sort进行排序
       // System.out.println(Arrays.binarySearch(b2, 2));
        //判断两个数组是否相同
        Arrays.equals(b,b2);
        //使用同一个值填充数组
        Arrays.fill(b,9);
        System.out.println(Arrays.toString(b));
    }


}
