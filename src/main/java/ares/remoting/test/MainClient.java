package ares.remoting.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClient {

    private static final Logger logger = LoggerFactory.getLogger(MainClient.class);

    public static void main(String[] args) throws Exception {

        //引入远程服务
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ares-client.xml");
        //获取远程服务
        System.out.println(context.getBean("remoteHelloService").getClass());
        final HelloService helloService = (HelloService) context.getBean("remoteHelloService");
        final Service2 helloService2 = (Service2) context.getBean("remoteHelloService2");
        long count = 1000000000000000000L;

        //调用服务并打印结果
        for (int i = 0; i < count; i++) {
            try {
               String result = helloService.sayHello("黄志豪,i=" + i);
              System.out.println(result);
                String result2 = helloService2.service2SayHello("黄志豪,i=" + i);
                System.out.println(result2);
            } catch (Exception e) {
                logger.warn("--------", e);
            }
        }

        //关闭jvm
        System.exit(0);
    }
}
