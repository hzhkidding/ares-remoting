package ares.remoting.framework.cluster.impl;

public class Test {
    public String name;
    public int age;

    //构造代码块
    {
        age  = 21;
        System.out.println("construction code..");
    }

    Test()
    {
        name = "Lisi";
        //age = 20;
    }

    void speak()
    {
        System.out.println("name+" + name);
        System.out.println("age+" + age);
    }


    public static void main(String[] args)
    {
        Test p = new Test();
        p.speak();
    }

}
