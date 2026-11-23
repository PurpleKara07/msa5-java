package org.example.e09generics;

public class BoxMain {
    public static void main(String[] args) {
        Box<int[]> boxIntArr = new Box<>(new int[3]);
        Box<String[]> boxStrArr = new Box<>(new String[3]);
        // Box<int> - 안됨
        // Box<Integer> boxInt = new Box<>();

         Integer a = 1;     // 1은 int 레퍼런스 a(오토박싱) => a
         int b = a+1;       // a는 레퍼런스 b는 int(언박싱) => b

        Integer c = null;
        if(c != null) {
            int d = c + 1;
        }

        // BoxRestrict<Tv> boxRestrict1        = new BoxRestrict<>();
        // extends / 인터페이스도 => extends 사용  / 두개이상 &사용
        BoxRestrict<Mobile> boxRestrict2    = new BoxRestrict<>();
        // BoxRestrict<Novel> boxRestrict3     = new BoxRestrict<>();
    }
}
