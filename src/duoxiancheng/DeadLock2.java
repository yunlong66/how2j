package duoxiancheng;

public class DeadLock2 {
    public static void main(String[] args){
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();
        Thread t1 = new Thread(){
            @Override
            public void run(){
                synchronized (a){
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    synchronized (b){

                    }
                }
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run(){
                synchronized (b){
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    synchronized (c){

                    }
                }
            }
        };

        Thread t3 = new Thread(){
            @Override
            public void run(){
                synchronized (c){
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    synchronized (a){

                    }
                }
            }
        };
        t1.start();
        t2.start();
        t3.start();
    }
}
