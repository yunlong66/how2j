package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJDBC {
    public static void main(String[] args) {

        //初始化驱动
        try {
            //驱动类com.mysql.jdbc.Driver
            //就在 mysql-connector-java-5.0.8-bin.jar中
            //如果忘记了第一个步骤的导包，就会抛出ClassNotFoundException
            Class.forName("com.mysql.jdbc.Driver");

            System.out.println("数据库驱动加载成功 ！");

            // 建立与数据库的Connection连接
            // 这里需要提供：
            // 数据库所处于的ip:127.0.0.1 (本机)
            // 数据库的端口号： 3306 （mysql专用端口号）
            // 数据库名称 how2java
            // 编码方式 UTF-8
            // 账号 root
            // 密码

            Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
                    "root", "YANYUNLONGyan123");
            System.out.println("连接成功，获取连接对象： " + c);

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }catch (SQLException s){
            s.printStackTrace();
        }

    }
}
