package ares.remoting.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainServer {


    public static void main(String[] args) throws Exception {

        //发布服务
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ares-server.xml");
        System.out.println(context.getBean("helloService").getClass());
        System.out.println(" 服务发布完成");
    }
}
