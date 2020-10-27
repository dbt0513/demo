package com.example.demo;

class A{
    static {
        System.out.println("A的静态代码块");
    }
    {
        System.out.println("A的构造代码块");
    }
    public   A(){
        System.out.println("A的构造方法");
    }
}
class B extends A{
    static {
        A a = new A();
        System.out.println("B的静态代码块");
    }
    {
        System.out.println("B的构造代码块");
    }
    public  B(){
        System.out.println("B的构造方法");
    }
}
public class XXX {
    public static void main(String[] args) {
        B b = new B();
        A a = new A();
    }
}