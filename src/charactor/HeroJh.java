package charactor;

public class HeroJh {
    public String name;
    public float hp;
    public int damage;
    public synchronized void recover(){
        if (hp == 200){
            try {
                this.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        hp = hp + 1;
        System.out.printf("%s 回血1点,增加血后，%s的血量是%.0f%n", name, name, hp);
        // 通知那些等待在this对象上的线程，可以醒过来了，如第20行，等待着的减血线程，苏醒过来
        this.notify();
    }

    public synchronized void hurt(){
        if (hp == 1){
            try {
                this.wait();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        hp = hp - 1;
        System.out.printf("%s 减血1点,减少血后，%s的血量是%.0f%n", name, name, hp);
        this.notify();
    }

    public boolean isDead(){
        return 0 >= hp ? true : false;
    }
}
