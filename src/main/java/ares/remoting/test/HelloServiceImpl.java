package ares.remoting.test;


import java.util.concurrent.ConcurrentHashMap;

import static java.lang.Thread.sleep;

public class HelloServiceImpl implements HelloService {


    @Override
    public String sayHello(String somebody) throws InterruptedException {
       // ConcurrentHashMap s = new ConcurrentHashMap();
        sleep(2000 );
        return "hello " + somebody + "!";
    }

    @Override
    public String method2() {


        return "method2";
    }


}
