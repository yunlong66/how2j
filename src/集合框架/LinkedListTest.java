package 集合框架;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListTest {
    public static void main(String[] args){
        //List查找低效

        //除了实现了List接口外，LinkedList还实现了双向链表结构Deque，可以很方便的在头尾插入删除数据
        LinkedList ll = new LinkedList();
        ll.addLast("111");
        ll.addFirst("222");
        ll.getFirst();
        ll.getLast();
        ll.removeLast();
        ll.removeFirst();

        //LinkedList 除了实现了List和Deque外，还实现了Queue接口(队列)。
        //Queue是先进先出队列 FIFO，常用方法：
        //offer 在最后添加元素
        //poll 取出第一个元素
        //peek 查看第一个元素
        //Queue代表FIFO 先进先出的队列
        Queue<String> q =new LinkedList<>();
        //加在队列后面
        q.offer(new String("222"));
        //取出第一个
        q.poll();
        //看看第一个，但是不取出来
        String str = q.peek();

    }
}
