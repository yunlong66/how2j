package reflection;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import charactor.Hero;

public class TestReflection3 {
    public static void main(String[] args) throws InterruptedException {
        Hero h = getHero();
        h.name = "hahaah";
        System.out.println(h.name);
    }

    public static Hero getHero() {

        File f = new File("/Users/yanyunlong/IdeaProjects/how2j/src/reflection/hero.config");

        try (FileReader fr = new FileReader(f)) {
            String className = null;
            char[] all = new char[(int) f.length()];
            fr.read(all);
            className = new String(all);
            Class clazz=Class.forName(className);
            Constructor c= clazz.getConstructor();
            Hero h= (Hero) c.newInstance();
            return h;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
