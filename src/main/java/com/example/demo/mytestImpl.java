package com.example.demo;

public class mytestImpl implements mytest {


    @Override
    public int a(int x, int y) {
        if (x<y){
            return -1;
        }else if (x==y){
            return 0;
        }else {
            return 1;
        }
    }
}
