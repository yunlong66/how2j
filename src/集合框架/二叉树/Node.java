package 集合框架.二叉树;

import java.util.ArrayList;
import java.util.List;

public class Node {
    //左子节点
    public Node leftNode;
    //右子节点
    public Node rightNode;
    //值
    public Object value;

    public void add(Object v) {
        //如果当前没有值，就把数据放在当前节点上
        if (value == null) {
            value = v;
        } else {
            //如果准备插入的值大于当前值
            if ((Integer) v > (Integer) value) {
                if (rightNode == null) {
                    rightNode = new Node();
                }
                rightNode.add(v);
            } else {
                if (leftNode == null) {
                    leftNode = new Node();
                }
                leftNode.add(v);
            }
        }
    }

    //中序遍历所有节点
    public List<Object> values(){
        List<Object> values = new ArrayList<>();

        //左节点遍历
        if(leftNode != null){
            values.addAll(leftNode.values());
        }
        //当前节点
        values.add(value);
        //右节点遍历
        if (rightNode != null){
            values.addAll(rightNode.values());
        }

        return values;
    }

    public static void main(String[] args) {
        int[] randoms = new int[]{67, 7, 30, 73, 10, 0, 78, 81, 10, 74};

        Node roots = new Node();
        for (int number : randoms) {
            roots.add(number);
        }

        System.out.println(roots.values());
    }
}
