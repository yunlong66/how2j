package 集合框架;

import java.util.*;

public class HashTest {
    public static void main(String[] args) {
        HashMap<String, String> dic = new HashMap<>();
        dic.put("abc", "123");
        dic.put("bca", "321");
        dic.get("abc");

        //Set中的元素，没有顺序。
        //严格的说，是没有按照元素的插入顺序排列
        HashSet<String> names = new HashSet<>();
        names.add("111");
        names.add("222");

        //Set不提供get方法来获取指定位置的元素
        //遍历Set可以采用迭代器iterator
        for (Iterator<String> iterator = names.iterator();iterator.hasNext();){
            String str = iterator.next();
        }
        //或者采用增强型for循环
        for (String s: names){

        }
        //可以发现HashSet自身并没有独立的实现，而是在里面封装了一个Map.
        //HashSet是作为Map的key而存在的
        //而value是一个命名为PRESENT的static的Object对象，因为是一个类属性，所以只会有一个。


        //HashMap和Hashtable都实现了Map接口，都是键值对保存数据的方式
        //区别1：
        //HashMap可以存放 null
        //Hashtable不能存放null
        //区别2：
        //HashMap不是线程安全的类
        //Hashtable是线程安全的类
        //HashMap可以用null作key,作value
        //Hashtable不能用null作key，不能用null作value

        //HashSet中的数据不是按照插入顺序存放
        HashSet<Integer> numberSet1 =new HashSet<Integer>();

        //LinkedHashSet中的数据是按照插入顺序存放
        LinkedHashSet<Integer> numberSet2 =new LinkedHashSet<Integer>();

        //TreeSet 中的数据是进行了排序的
        TreeSet<Integer> numberSet3 =new TreeSet<Integer>();

    }
}
