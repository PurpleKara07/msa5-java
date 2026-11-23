package org.example.e09generics;

public class Box<T> {   // T - object로 컴파일
    public T arr;

    public Box(T arr){
        this.arr = arr;
    }
}
