package org.example;

import java.util.Arrays;

public class Recursion2 {

    public static boolean groupSum(int start, int[] nums, int target) {
        /*
            two base cases: target = 0 => solution is found, return true
            or
            reached end of array with no solution, return false
         */
        if (target == 0) {
            return true;
        }else if (start == nums.length){
            return false;
        } else {
            /*
                always two options: subtract with num at current index, or not.
                that way all options get tried out when calling recursively with next index
             */
            return groupSum(start + 1, nums, target - nums[start]) ||
                    groupSum(start + 1, nums, target);
        }
    }

    public boolean groupSum6(int start, int[] nums, int target) {
        if (start == nums.length) {
            return target == 0;
        } else if (nums[start] == 6) {
            return groupSum6(start + 1, nums, target - nums[start]);

        }else {
            return groupSum6(start + 1, nums, target - nums[start]) ||
                    groupSum6(start + 1, nums, target);
        }
    }

    public boolean groupNoAdj(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }else {
            return groupNoAdj(start + 2, nums, target - nums[start]) ||
                    groupNoAdj(start + 1, nums, target);
        }
    }

    public boolean groupSum5(int start, int[] nums, int target) {
        if (start == nums.length) {
            return target == 0;
        } else if (nums[start] % 5 == 0) {
            return groupSum5(start + 1, nums, target - nums[start]);
        } else if (start > 0 && nums[start - 1] % 5 == 0 && nums[start] == 1) {
                return groupSum5(start + 1, nums, target);
        }else {
            return groupSum5(start + 1, nums, target - nums[start]) ||
                    groupSum5(start + 1, nums, target);
        }
    }

    public boolean groupSumClump(int start, int[] nums, int target) {
        if (start == nums.length) {
            return target == 0;
        }else {
            int c = 1;
            for (int i = start + 1; i < nums.length; i++) {
                if (nums[i] == nums[start]) {
                    c++;
                }else {
                    break;
                }
            }
                return groupSumClump(start + c, nums, target - (nums[start] * c)) ||
                        groupSumClump(start + c, nums, target);
        }
    }

    public static boolean splitArrayHelper(int i, int sumL , int sumR, int[] nums) {
        if (i == nums.length) {
            return sumL == sumR;
        }else {
            return (splitArrayHelper(i + 1, sumL + nums[i], sumR, nums)) ||
                    (splitArrayHelper(i + 1, sumL, sumR + nums[i], nums));
        }
    }

    public static boolean splitOdd10Helper(int i, int sumOdd , int sum10, int[] nums) {
        if(i == nums.length) {
            return (sumOdd % 2 == 1) && (sum10 % 10 == 0);
        }return (splitOdd10Helper(i + 1, sumOdd + nums[i], sum10, nums)) ||
                (splitOdd10Helper(i + 1, sumOdd, sum10 + nums[i], nums));
    }

    public static boolean split53Helper(int i, int sum5 , int sum3, int[] nums) {
        if(i == nums.length) {
            return sum5 == sum3;
        }else {
            if (nums[i] % 5 == 0){
                return split53Helper(i + 1, sum5 + nums[i], sum3, nums);
            }else if(nums[i] % 3 == 0) {
                return split53Helper(i + 1, sum5, sum3 + nums[i], nums);
            }else {
                return split53Helper(i + 1, sum5 + nums[i], sum3, nums) ||
                        split53Helper(i + 1, sum5, sum3 + nums[i], nums);
            }
        }
    }

    public static void main(String[] args) {
        int[] test = new int[] {5, 5, 5};
        System.out.println(splitOdd10Helper(0, 0, 0, test));
    }
}
