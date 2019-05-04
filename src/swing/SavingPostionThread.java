package swing;
import java.io.*;
import javax.swing.JFrame;

public class SavingPostionThread extends Thread{
    private JFrame f;
    File file = new File("./location.txt");

    public SavingPostionThread(JFrame f){
        this.f = f;
    }

    public void run(){
        while (true){
            int x = f.getX();
            int y = f.getY();

            try (FileOutputStream fos = new FileOutputStream(file);
                 DataOutputStream dos = new DataOutputStream(fos);
            ){
                dos.writeInt(x);
                dos.writeInt(y);
            }catch (FileNotFoundException e){
                e.printStackTrace();
            }catch (IOException e){
                e.printStackTrace();
            }

            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
