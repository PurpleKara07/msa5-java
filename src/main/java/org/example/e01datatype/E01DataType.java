package org.example.e01datatype;

public class E01DataType {
    public void execute() {
        boolean bool = false;
        bool = true;
        System.out.println(bool);
        System.out.println(bool);
        System.out.printf("현재 변수 bool의 값은 %s", bool);

        // 변수
        int age;
        age = 1;
        char ch = 'a';
        String str = "a";

        // 상수
        final String USER_NAME = "홍길동";

        // Underscore 표기법
        int num = 1_020_304_010;

        // 두변수의 값을 스와핑 해보자
        int swap1 = 1;
        int swap2 = 2;
        int swap3 = swap1;
        swap1 = swap2;
        swap2 = swap3;

        byte bt = -128;
        short sh = 32767;
        int integer = 2147483647;
        long longer = 2147483648L;

        // 실수
        double db = 3.141592;
        float ft = 3.141592F;

        char ch1 = 'g';
    }
}

