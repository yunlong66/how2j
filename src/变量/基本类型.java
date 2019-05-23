package 变量;

public class 基本类型 {
    public static void main(String[] args){
        byte b = 1;
        short s = 200;
        int i = 300;
        long l = 400;

        /*如果试图给byte类型的变量赋予超出其范围的值，就会产生编译错误*/
        //byte b2 = 200;

        //char 只能存放一个字符，超过一个字符就会产生编译错误
        //长度和short一样，也是16位的
        char c = 'a';

        //小数默认double
        float f = 1.23f;

        boolean bc = true;

        //String是不可变类型
        String a = "hello";

        double pi = 3.14;
        double e = 2.1312313;
        short days = 365;
        char chi = '吃';
        String bk = "不可描述";

        long val = 26L;
        int a2 = 0x1b;
        int binVal = 0b11011;
        int x = 032;

        double d2 = 1.234e2;
        char tab = '\t';

        //虽然short和char都是16位的，长度是一样的
        //但是彼此之间，依然需要进行强制转换
        char test = 'A';
        short t = 80;
        test = (char) t;


        int ii = 100;
        long iii = 1000;
        iii = ii;
        ii = (int)iii;

        //有一个超过int，就按最长的算
        int as = 5;
        long aas = 6;
        int ass = (int) (as + aas);
        long bbb = as + aas;

        //两个运算单元长度都小于int，结果按int算
        byte zz = 1;
        byte zzz = 127;

        int big1 = 2147483647;
        int big2 = 2;
        int ad = big1 + big2;
        System.out.println(ad);

        //只能被赋值一次
        final int NUM;
        NUM = 100;


    }

    //调用方法的时候一定会第一次赋值
    public void method1(final int j) {
        //j = 5; //这个能否执行？
    }
}
