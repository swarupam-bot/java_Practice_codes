package com.practice.javaBasics;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4,1};
            //this is comment
        System.out.print("old array : ");
        for(int k:nums)
        {
            System.out.print(k+" ");
        }
        System.out.println();

        List<Integer> newList = new ArrayList<>();
        for (int i : nums) {
            if (!newList.contains(i)) {
                newList.add(i);
            }
        }
        int[] newArray = new int[newList.size()];

        for (int k = 0; k < newArray.length; k++) {
            newArray[k] = newList.get(k);
        }
        nums = newArray;
        System.out.print("new array : ");
        for(int k:nums)
        {
            System.out.print(k+" ");
        }
        System.out.println();
        System.out.println("size of new array :"+nums.length);
    }

    }
