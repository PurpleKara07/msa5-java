package org.example.e06oop.abstractclass;

public abstract class Mammal {
    protected String name;
    protected String resident;

    public String breath(){
        return String.format("%s이/가 숨을 쉽니다.", this.name);
    }
    // 추상메서드 : 추상 클래스와 일반 클래스 차이는 추상 메서드 존재
    // 상속에서 자식 클래스에게 반드시 구현하도록 강제하는 메서드

    /**
     * 해당 메서드는 반드시 사는곳을 출력하기 위해 문자열을 반환
     * @return
     */
    public abstract String living();
}
