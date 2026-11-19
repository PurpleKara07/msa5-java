package org.example.e06oop;

import org.example.e06oop.inheritance.FlyingFish;
import org.example.e06oop.inheritance.Whale;

public class MainOOP {
    public static void main(String[] args) {
        // Whale whale = new Whale();
        // System.out.println(whale.name);
        // whale.swimming();
        // // System.out.println(Whale.age);
        // whale.name = "돌고래";
        // System.out.println(whale.name);
        //
        // FlyingFish flyingfish = new FlyingFish();
        // System.out.println(flyingfish.name);

        AccessModifier accessModifier = new AccessModifier();
        accessModifier.fnProtected();

        // Whale whale2 = accessModifier.getStrPrivate();
        // System.out.println(whale2);

        // 오버로딩
        // 메소드의 시그니처가 다르거나,  동일한 이름을 가지는 메소드를 중복하여 정의
        System.out.println(OverloadingOOP.add(1));
        System.out.println(OverloadingOOP.add(1, 2));

        ConstructOOP constructOOP = new ConstructOOP();

        // ---------------------------------
        // 상속
        FlyingFish flyingFish = new FlyingFish("날치", "바다");
        System.out.println(flyingFish.breath());
        System.out.println(flyingFish.flying());
        System.out.println(flyingFish.living());

        Whale whale = new Whale("고래", "바다");
        System.out.println(whale.breath());
        System.out.println(whale.swimming());
        System.out.println(whale.living());
    }
}
