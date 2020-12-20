package com.example.stream;

import javax.sound.midi.Soundbank;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NEW2 {

    public static void main(String[] args) {
//        FC1();
//        FC2();
//        FC3();
        FC4();
    }


    public static  void FC4(){
        int[] data={0,1,2,3,4,5};
        IntStream stream = Arrays.stream(data);
        List<Integer> integers = new ArrayList<>();
        Stream<Integer> stream1 = integers.stream();
        OptionalInt max = stream.max();
        System.out.println(max);


    }

    public static void FC3() {
//        Stream<Integer> stream = dataSource();
//        Integer integer = stream.max(Integer::compareTo).get();
//        System.out.println(integer);
//        boolean b = stream.noneMatch(x -> x > 5);
//        System.out.println(b);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        Stream<Integer> stream = list.stream();

        Optional<Integer> integer = stream.parallel().findAny();
        System.out.println(integer);


    }
    
    public static void  FC2(){
        Stream<Integer> stream = dataSource();
//        Optional<Integer> reduce = stream.reduce(Integer::sum);
//        Integer reduce = stream.reduce(1, Integer::max);

//        long count = stream.count();
//        stream.parallel().forEach(System.out::print);
        stream.parallel().forEachOrdered(System.out::print);//区别在对并行流的处理，严格按照顺序输出
//        System.out.println(count);;\
    }

    public static void FC1(){
        Stream<Integer> stream = dataSource();
//        List<Integer> list = stream.collect(Collectors.toList());
//        list.forEach(System.out::println);
        Map<String, Integer> collect = stream.collect(Collectors.toMap(Object::toString, i -> i));

        System.out.println(collect);
    }


    public static Stream<Integer> dataSource(){
        List<Integer> list = Arrays.asList(5,0, 1, 2, 3);
        return list.stream();
    }
}
