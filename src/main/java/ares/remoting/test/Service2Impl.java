package ares.remoting.test;

import ares.remoting.test.Service2;

import java.util.concurrent.ConcurrentHashMap;

public class Service2Impl implements Service2 {
    @Override
    public String service2SayHello(String somebody)  {
        ConcurrentHashMap s = new ConcurrentHashMap();
        // sleep(3000 );
        return "hello Service2" + somebody + "!";

    }

    @Override
    public String method2() {
        return null;
    }
}
