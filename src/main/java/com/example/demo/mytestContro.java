package com.example.demo;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
            public int a(int x,int y) {
                if (x<y){
                    return -1;
                }else if (x==y){
                    return 0;
                }else {
                    return 1;
                }
            }
        };
        mytest mytest3=Integer::compare;
        System.out.println(mytest.a(2,3));
        System.out.println(mytest2.a(3,3));
        System.out.println(mytest3.a(5,4));
        
    }
    public static void main(String[] args) {
//        testLambda lam= mytestContro::add;
//        System.out.println(lam.c(1,2));
        /*LinkedList<String> llist=new LinkedList<>();
        Stream<String> stream = llist.stream();
        String[] iarr={"0","1"};
        Stream<String> stream1 = Arrays.stream(iarr);
        IntStream intStream = stream1.mapToInt(Integer::parseInt);
        int[] iarr2 = intStream.toArray();*/
//        test3();
        ArrayList<Integer> list = new ArrayList<>();


    }

    private interface testLambda{
        int c(int a,int b);
    }
    public static int add(int a,int b){
        return a-b;
    }
}
