package com.icha.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //no. 1
        List<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(3, 1, 4, 2));
        int x = 4;
        String word = "souvenir loud four lost";
        
        System.out.println(test1(nums)); //no 1
        System.out.println(test2(nums, x)); //no 2
        System.out.println(test3(word, x));//no 3
    }

    private static List<Integer> test1(List<Integer> nums) {
        //result of substraction <0
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            int currentNumber = nums.get(i);
            for (int j = 0; j < nums.size(); j++) {
                int res = currentNumber - nums.get(j);
                if (res < 0) {
                    break;
                } else if (j == nums.size() - 1) {
                    result.add(currentNumber);
                }
            }
        }
        return result;
    }

    private static List<Integer> test2(List<Integer> nums, int x) {
        //result = all numbers that divided by any integers in nums doesn't return x
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            int currentNumber = nums.get(i);
            for (int j = 0; j < nums.size(); j++) {
                int res = currentNumber / nums.get(j);
                if (res == x) {
                    break;
                } else if (j == nums.size() - 1) {
                    result.add(currentNumber);
                }
            }
        }
        return result;
    }

    private static List<String> test3(String word, int x) {
        //result = array of strings containing all strings that has length of x
        List<String> result = new ArrayList<>();
        String[] arrOfStr = word.split(" ");
        for (String a : arrOfStr) {
            if (a.length() == x)
                result.add(a);
        }
        return result;
    }
}
