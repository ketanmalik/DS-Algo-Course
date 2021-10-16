package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] a1 = new int[]{1,2,3,4,5};
        int[] a2 = new int[]{6,1,8};
        boolean hasCommon = false;

        Map<Integer, Integer> map = new HashMap<>();

        for(Integer i: a1) {
            if(map.get(i) == null) map.put(i, 1);
        }

        for(Integer i: a2) {
            if(map.get(i) != null) {
                hasCommon = true;
                break;
            }
        }

        System.out.println(hasCommon);
    }
}
