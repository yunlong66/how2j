package duoxiancheng;

import java.io.File;

public class TestSearchFileThread {
    public static void main(String[] args){
        File folder = new File("e:\\project");
        search(folder,"magic");
    }

    public static void search(File file,String search){

        if (file.isFile()){
            if (file.getName().toLowerCase().endsWith(".java")){
                //当找到.java文件的时候，就启动一个线程，进行专门的查找
                new SearchFileThread(file,search).start();
            }
        }

        if (file.isDirectory()){
            File[] fs = file.listFiles();
            for(File f : fs){
                search(f,search);
            }
        }
    }
}
