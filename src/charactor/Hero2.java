package charactor;

public class Hero2 {
    public String name;
    public float hp;
    public int damage;

    public Hero2(){

    }

    public Hero2(String name){
        this.name = name;
    }

    public void attackHero(Hero2 h){
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        h.hp-=damage;
        System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n", name, h.name, h.name, h.hp);
        if (h.isDead()){
            System.out.println(h.name + "死了！");
        }
    }

    public boolean isDead(){
        return 0 >= hp ? true : false;
    }

    int totalTime = 3;
    public void adugen(){
        while (true){
            for (int i = 0;i < totalTime;i++ ){
                System.out.printf("波动拳第%d发%n", i + 1);
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println("开始为时5秒的充能");
            try {
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        Hero2 h = new Hero2("蓝猫");
        h.adugen();
    }
}
