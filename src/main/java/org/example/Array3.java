package org.example;

import java.util.Arrays;

public class Array3
{
    public static int maxSpan(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int span = 0;
        int largest = 1;
        for (int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    span = j - i + 1;
                }
            }
            if (span >= largest) {
                largest = span;
            }
        }
        return largest;
    }

    public static int[] fix34(int[] nums) {
        for (int i = 0; i < nums.length; i++)
        {
           if (nums[i] == 3)
           {
               for (int j = 0; j < nums.length; j++)
               {
                   if (nums[j] == 4 && nums[j - 1]  != 3)
                   {
                       nums[j] = nums[i + 1];
                       nums[i + 1] = 4;
                       i++;
                       break;
                   }
               }
           }
       }
       return nums;
    }

    public static int[] fix45(int[] nums) {
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == 4)
            {
                for (int j = 0; j < nums.length; j++)
                {
                    if (nums[j] == 5 && (j == 0 || nums[j - 1]  != 4))
                    {
                        nums[j] = nums[i + 1];
                        nums[i + 1] = 5;
                        i++;
                        break;
                    }
                }
            }
        }
        return nums;
    }

    public static boolean canBalance(int[] nums) {

        int sumL = 0;
        int sumR = 0;

        for (int i = 0; i < nums.length; i++) {
            sumL += nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                sumR += nums[j];
            }
            if (sumL == sumR) {
                return true;
            }else {
                sumR = 0;
            }
        }
        return false;
    }

    public static boolean linearIn(int[] outer, int[] inner) {
        if (inner.length == 0) {
            return true;
        }
        int j = 0;
        for (int i = 0; i < outer.length; i++) {
            if (outer[i] == inner[j]) {
                if (++j == inner.length) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int[] squareUp(int n) {
        int[] square = new int[n * n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (n - j - i <= 1) {
                    square[i * n + j] = n - j;
                } else {
                    square[i * n + j] = 0;
                }

            }
        }
        return square;
    }

    public static int[] seriesUp(int n) {
        int[] series = new int[n * (n + 1) / 2];

        // better solution than mine:
        int i = 0;
        for (int j = 1; j <= n; j++) {
            for (int k = 1; k <= j; k++) {
                series[i++] = k;
            }
        }
        /* my complicated solution

        int index;
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                index =  i * (i + 1) / 2 - (i - j) - 1;
                series[index] = j;
            }
        }
        */
        return series;
    }

    public static int maxMirror(int [] nums) {
        int longest = 0;
        int current = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= 0; j--) {
                if (nums[i] == nums[j]) {
                    current++;
                    for (int k = 1; i + k < nums.length && j - k >= 0; k++) {
                        if (nums[i + k] != nums[j - k]) {
                            break;
                        } else {
                            current++;
                        }
                    }
                    if (longest <= current) {
                        longest = current;

                    }
                    current = 0;
                }
            }
        }
        return longest;
    }

    public static int countClumps(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int [] nums = Arrays.copyOf(arr, arr.length);
        int clumps = 0;
        int current = nums[0];
        boolean found = false;
        for (int i = 1; i < nums.length; i++) {
            if(!found) {
                if (nums[i] == current) {
                    clumps++;
                    found = true;
                }else {
                    current = nums[i];
                }
            }else {
                if (nums[i] != current){
                    found = false;
                    current = nums[i];
                }
            }
        }

        return clumps;
    }

    public static void main(String[] args)
    {
        maxMirror(new int[] {5, 9, 9, 4, 5, 4, 9, 9, 2});
    }
}
