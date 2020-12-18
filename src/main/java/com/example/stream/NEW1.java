package com.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NEW1 {
    public static void main(String[] args) {
        collectionDataSource();



    }


    public static void collectionDataSource(){
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,0,1,2);
        Stream<Integer> str = list.stream();
        Stream<Integer> integerStream = list.parallelStream();
        System.out.println(str);
    }
    public  static void arrayDataSource(){
        Integer[] array={0,1,2,3,4};
        Stream<Integer> stream = Arrays.stream(array);
        System.out.println(stream);
    }
    public  static void arrayDataSource2(){
        int[] array={0,1,2,3,4};
        IntStream stream = Arrays.stream(array);
        String[] a ={"1","2"};
        Stream<String> stream1 = Arrays.stream(a);
//        Object[] ints = stream1.collect();
    }



}
