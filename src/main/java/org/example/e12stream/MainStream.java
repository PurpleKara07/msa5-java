package org.example.e12stream;

import java.util.ArrayList;
import java.util.List;

public class MainStream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(2);
        list.add(4);
        list.add(7);
        list.add(9);

        List<Integer> copyList = new ArrayList<>();
        list.forEach((i)->{
            copyList.add(i+3);
        });
       // for(int i=0 ; i<list.size() ; i++){
       //     copyList.add(list.get(i)+3);
       // }
        System.out.println(copyList);

        // List<Whale> whaleList = new ArrayList<>();
        // whaleList.add(new Whale("밍크","바다"));
        // whaleList.add(new Whale("흰수염","바다"));
        // whaleList.forEach((item)->{
        //     System.out.println(item.living());
        // });
        // List<Integer> result1 = list.stream().map(i-> i+3).toList();
        List<Integer> result1 = list.stream().map((i) -> {
            return i+3;
        }).toList();
        System.out.println(result1);

        // 짝수의 개수를 구해주세요
        long result2 = list.stream().filter((i)->{
            return i%2 == 0;
        }).count();
        System.out.println(result2);
    }
}
