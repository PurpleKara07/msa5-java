package org.example.e02operator;

public class E02Operator {
    public static void main(String[] args) {
        // 대입 연산자
        int num1 = 2;
        int num2 = 5;

        // 산술 연산자
        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1/num2);
        System.out.println(num1*num2);
        System.out.println(num1%num2);

        // 산술 대입 연산자
        int num3 = 1;
        num3 += 3;
        num3 -= 3;
        num3 /= 3;
        num3 *= 3;
        num3 %= 3;

        // 증감 연산자
        int num5 = 0;
        System.out.println(num5++);
        System.out.println(++num5);

        // 비교 연산자
        System.out.println(num1 > num2);
        System.out.println(num1 < num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 <= num2);
        System.out.println(num1 == num2);
        System.out.println(num1 != num2);

        // 문자열 비교
        String str1 = "str1";
        String str2 = "str1";
        System.out.println(str1.equals(str2));

        String str3 = new String("str1");
        System.out.println(str1.equals(str3));

        String str4 = str3;
        String str5 = str3;

        System.out.println(str4.equals(str5));

        // 논리 연산자
        int num10 = 0;
        int num11 = 2;
        System.out.println(num10 > 2 && num11<= 11);
        System.out.println(num10 > 2 || num11<= 11);
        System.out.println(!(num10 > 0));

        // 삼항 연산자
        String result = num1 > num2 ? "num1이 크다" : "num1이 작다";
    }
}
