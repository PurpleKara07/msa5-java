package org.example.e06oop.inheritance;

public class FlyingFish extends Animal{
    public FlyingFish(String name, String residence){
        super(name, residence);    // 자식에서 부모 호출
        System.out.println("날치 생성자");
    }

    public String flying(){
        return String.format("%s이/가 날아갑니다.", super.name);
    }

    // 오버라이딩 : 상속받은 메서드를 재정의
    @Override
    public String living(){
        return "수정했다";
    }
}
