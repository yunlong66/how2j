package 数字与字符串;

public class Buffer {

    public static void main(String[] args) {
        String str = "let here";
        StringBuffer sb = new StringBuffer(str);
        sb.append("be light"); //在最后追加
        sb.delete(4, 10);//删除4-10之间的字符
        sb.insert(4, "there ");//在4这个位置插入 there
        sb.reverse(); //反转
    }

}
