package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mytestContro {
    public static void test3() {
//        List<User> Usesrs = Arrays.asList(
//                new User("张三", 18, 3333.1),
//                new User("李四", 38, 55555.0),
//                new User("王五", 50, 6666.66),
//                new User("赵六", 16, 77777.77),
//                new User("田七", 8, 8888.88)
//        );

        mytestImpl mytest = new mytestImpl();
        mytest mytest2 = new mytest() {

            @Override
            public boolean test(Object o) {
                return false;
            }
        };
        mytest mytest3=x-> true;
        System.out.println(mytest.test(2));
        System.out.println(mytest2.test(3));
        System.out.println(mytest3.test(4));

    }
    public static void main(String[] args) {
        testLambda lam= mytestContro::add;
        System.out.println(lam.c(1,2));
    }

    private interface testLambda{
        int c(int a,int b);
    }
    public static int add(int a,int b){
        return a+b;
    }
}
