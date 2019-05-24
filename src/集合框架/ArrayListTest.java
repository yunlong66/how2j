package 集合框架;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListTest {

    public static void main(String[] args){
        //为了解决数组的边界问题

        //ArrayList实现了接口List
        //常见的写法会把引用声明为接口List类型
        //注意：是java.util.List,而不是java.awt.List
        //接口引用指向子类对象（多态）

        //常用方法
        ArrayList<String> a = new ArrayList();
        //（指定位置）增加
        a.add("aa");
        a.add(3, "aaa");

        // 判断一个对象是否在容器中
        // 判断标准： 是否是同一个对象，而不是name是否相同
        a.contains("aaa");

        //获取指定位置的对象,超出范围会报错
        a.get(1);

        //判断对象所在位置
        //判断标准与contains一样
        a.indexOf("aaa");

        //（根据指定位置）删除
        a.remove(1);

        //替换指定位置元素
        a.set(1, "qqq");

        //获取大小
        a.size();

        //转换为数组
        String[] strs = a.toArray(new String[]{});

        //把另一个容器所有对象都加进来
        //a.addAll(XXX);

        //清空
        a.clear();

        //for循环遍历
        for (int i = 0; i < a.size(); i++){
            a.get(i);
        }

        //迭代器方式遍历
        Iterator<String> i = a.iterator();
        //从最开始的位置判断"下一个"位置是否有数据
        //如果有就通过next取出来，并且把指针向下移动
        //直到"下一个"位置没有数据
        while(i.hasNext()){
            String str = i.next();
        }

        //Collections 容器的工具类
        //翻转
        Collections.reverse(a);
        //混淆打乱
        Collections.shuffle(a);
        //排序
        Collections.sort(a);
        //交换
        Collections.swap(a, 0, 2);
        //滚动
        Collections.rotate(a,2);


    }
}
