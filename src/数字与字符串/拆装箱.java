package 数字与字符串;

public class 拆装箱 {

    public static void main(String[] args){
        int i = 1;
        Integer a = new Integer(2);
        i = a.intValue();
        Integer I = i;
        int ii = I;
        //数字封装类有Byte,Short,Integer,Long,Float,Double
//        Byte b = new Byte(1);
//        Short s= new Short(2);
        i = Integer.MAX_VALUE;

        //数字转字符串
        String s = String.valueOf(i);
        s= a.toString();
        //字符串转数字
        String str = "999";
        int st = Integer.parseInt(str);

        //数学方法
        float f1 = 1.23f;
        float f2 = 1.56f;
        //四舍五入
        System.out.println(Math.round(f1));
        //得到一个0-1之间的随机浮点数（取不到1）
        System.out.println(Math.random());

        //得到一个0-10之间的随机整数 （取不到10）
        System.out.println((int)( Math.random()*10));
        //开方
        System.out.println(Math.sqrt(f1));
        //次方，二的四次方
        System.out.println(Math.pow(2,4));

        //格式化输出
        //直接打印数字
        int year = 2036;
        System.out.format("%d%n",year);
        //总长度是8,默认右对齐
        System.out.format("%8d%n",year);
        //总长度是8,左对齐
        System.out.format("%-8d%n",year);
        //总长度是8,不够补0
        System.out.format("%08d%n",year);
        //千位分隔符
        System.out.format("%,8d%n",year*10000);

        //小数点位数
        System.out.format("%.2f%n",Math.PI);

        //char的封装类是character
        char c1 = 'c';
        Character c2 = c1;
        c1 = c2;

        //Character常见方法
        Character.isLetter(c1);
        Character.isDigit(c1);
        Character.isWhitespace(c1);//是否为空格
        Character.isUpperCase(c1);//是否大写
        Character.toUpperCase(c1);//转换为大写
        Character.toLowerCase(c1);//转换为小写
        //String a = 'a'; //不能够直接把一个字符转换成字符串
        String a2 = Character.toString('a'); //转换为字符串

        //字符串
        String garen ="盖伦"; //字面值,虚拟机碰到字面值就会创建一个字符串对象

        String teemo = new String("提莫"); //创建了两个字符串对象

        char[] cs = new char[]{'a', 'b', 'c'};
        String css = new String(cs);
        css.length();

        //操纵字符串
        String sentense = "我骄傲我是中国人";
        //charAt(int index)获取指定位置的字符
        char s1 = sentense.charAt(0);
        //获取字符数组
        char[] ccs = sentense.toCharArray();
        //截取从第3个开始的字符串 （基0）
        String subString1 = sentense.substring(3);

        System.out.println(subString1);

        //截取从第3个开始的字符串 （基0）
        //到5-1的位置的字符串
        //左闭右开
        String subString2 = sentense.substring(3,5);
        //分割字符串
        String[] subsen = sentense.split(" ");
        //去掉首位空格
        sentense.trim();

        //全部变成小写
        System.out.println(sentense.toLowerCase());
        //全部变成大写
        System.out.println(sentense.toUpperCase());

        //定位
        System.out.println(sentense.indexOf('8')); //字符第一次出现的位置

        System.out.println(sentense.lastIndexOf("了")); //字符串最后出现的位置

        System.out.println(sentense.indexOf(',',5)); //从位置5开始，出现的第一次,的位置

        System.out.println(sentense.contains("击杀")); //是否包含字符串"击杀"

        //替换
        String temp = sentense.replaceAll("击杀", "被击杀"); //替换所有的

        temp = temp.replaceAll("超神", "超鬼");

        System.out.println(temp);

        temp = sentense.replaceFirst(",","");//只替换第一个

        //比较字符串
        String str1 = "hello1";
        String str2 = new String(str1);
        String str3 = str1.toLowerCase();
        //==用于判断是否是同一个字符串对象
        System.out.println(str1 == str2);
        //特例
//        str1 = "the light";
//        str3 = "the light";
//        一般说来，编译器每碰到一个字符串的字面值，就会创建一个新的对象
//        所以在第6行会创建了一个新的字符串"the light"
//        但是在第7行，编译器发现已经存在现成的"the light"，那么就直接拿来使用，而没有进行重复创建

        //内容是否相同
        System.out.println(str1.equals(str2));//完全一样返回true
        System.out.println(str1.equals(str3));//大小写不一样，返回false
        System.out.println(str1.equalsIgnoreCase(str3));//忽略大小写的比较，返回true

        //是否以指定字符串开始或结尾
        System.out.println(str1.startsWith("start"));//以...开始
        System.out.println(str1.endsWith("end"));//以...结束


    }
}
