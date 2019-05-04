package duoxiancheng.ProducerConsumer;

public class TestThread {
    public static void main(String[] args){
        MyStack<Character> stack = new MyStack<Character>();

        ProducerThread p1 = new ProducerThread(stack,"p1");
        ProducerThread p2 = new ProducerThread(stack,"p2");
        ConsumerThread c1 = new ConsumerThread(stack,"c1");
        ConsumerThread c2 = new ConsumerThread(stack,"c2");
        ConsumerThread c3 = new ConsumerThread(stack,"c3");
        p1.start();
        p2.start();
        c1.start();
        c2.start();
        c3.start();
    }
}
