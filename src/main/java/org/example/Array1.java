package org.example;

import java.util.Arrays;

public class Array1 {

    public static int[] rotateLeft3(int[] nums) {

        // oder: int[] rotated = {nums[1],nums[2],nums[0]};
        int[] rotated = new int[nums.length];
        rotated[rotated.length - 1] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            rotated[i - 1] = nums[i];
        }
        return rotated;
    }

    public int[] makeMiddle(int[] nums) {
        int middle = nums.length / 2 - 1;

        return new int[] {nums[middle], nums[middle + 1]};
    }

    public int[] plusTwo(int[] a, int[] b) {
        int[] added = Arrays.copyOf(a, a.length + b.length);

        for (int i = 0; i < b.length; i++) {
            added[a.length + i] = b[i];
        }

        return added;
    }


    public static int[] makeLast(int[] nums) {
        int[] last = new int[nums.length * 2];
        last[last.length - 1] = nums[nums.length - 1];
        return last;
    }
    
    public static void main(String[] args) {
        int[] test = {1, 2, 3};
        System.out.println(rotateLeft3(test));
    }
}
