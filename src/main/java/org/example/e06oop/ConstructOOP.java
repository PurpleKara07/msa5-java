package org.example.e06oop;

public class ConstructOOP {
    public String name;
    private int age;
    private final char gender;
    // 생성자 (constructor)
    // 클래스를 인스턴스화 할때 최초1회만 실행되는 메소드
    // 주로 객체의 초기화 또는 인스턴스 생성시 실행되야할 작업을 위해 사용
    // 기본생성자 : 별도로 정의하지 않으면 자동으로 생성되는 생성자
    public ConstructOOP() {
        // this("무명",  20);
        this("무명", 20, 'M');
    }

    // 커스텀 생성자
    public ConstructOOP(String name, int age) {
        // this();         //  : 생략
        // this참조변수 : 클래스 자기 자신
        // this.name = name;
        this(name, age, 'M');
    }
    public ConstructOOP(String name,int age, char gender) {
        // this(name);         // 나 자신의 생성자
        this.name  = name;
        this.age  = age;
        this.gender = gender;
    }
}