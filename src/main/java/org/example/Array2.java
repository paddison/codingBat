package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array2 {
    public static int countEvens(int[] nums) {
        int c = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                c++;
            }
        }
        return c;
    }

    public static int bigDiff(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        return max - min;
    }

    public static int centeredAverage(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length - 1; i++) {
            sum += nums[i];
        }

        return sum / (nums.length - 2);
    }

    public static int sum13(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i++;
            }else {
                sum += nums[i];
            }
        }
        return sum;
    }

    public int sum67(int[] nums) {
        int sum = 0;
        boolean ignore = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6) {
                ignore = true;
            }else if (ignore && nums[i] == 7) {
                ignore = false;
            }else if (!ignore) {
                sum += nums[i];
            }
        }
        return sum;
    }

    public boolean has22(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                return true;
            }
        }
        return false;
    }

    public boolean lucky13(int[] nums) {
        for (int num : nums) {
            if (num == 1 || num == 3) {
                return false;
            }
        }
        return true;
    }

    public boolean sum28(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            if (num == 2) {
                sum += num;
            }
        }
        return 8 == sum;
    }

    public boolean more14(int[] nums) {
        int ones = 0;
        int fours = 0;

        for (int num : nums) {
            if (num == 1) {
                ones++;
            }else if(num == 4) {
                fours++;
            }
        }
        return ones > fours;
    }

    public int[] fizzArray(int n) {

        int[] fizzy = new int[n];
        if (n == 0) {
            return fizzy;
        }

        for (int i = 0; i < n; i++) {
            fizzy[i] = i;
        }
        return fizzy;
    }

    public boolean only14(int[] nums) {
        for (int num : nums) {
            if (num != 1 && num != 4) {
                return false;
            };
        }
        return true;
    }

    public String[] fizzArray2(int n) {
        String[] fizzy = new String[n];
        if (n == 0) {
            return fizzy;
        }

        for (int i = 0; i < n; i++) {
            fizzy[i] = Integer.toString(i);
        }
        return fizzy;
    }

    public boolean no14(int[] nums) {
        boolean one = false;
        boolean four = false;
        for (int num : nums) {
            if (num == 1) {
                one = true;
            }else if (num == 4) {
                four = true;
            }
        }
        return !one || !four;
    }

    public boolean isEverywhere(int[] nums, int val) {
        if (nums.length <= 1) {
            return true;
        }
        boolean everywhere = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                everywhere = true;
                i++;
            }else if (everywhere && nums[i] != val) {
                return false;
            }
        }
        return everywhere;
    }

    public boolean either24(int[] nums) {
        boolean two = false;
        boolean four = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && !two) {
                two = nums[i] == nums[i + 1];
            }else if (nums[i] == 4 && !four) {
                four = nums[i] == nums[i + 1];
            }
        }
        return two ^ four;
    }

    public int matchUp(int[] nums1, int[] nums2) {
        int c = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (Math.abs(nums1[i] - nums2[i]) <= 2 && nums1[i] != nums2[i]){
                c++;
            }
        }
        return c;
    }

    public boolean has77(int[] nums) {
        boolean has = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 7 && nums[i + 1] == 7) {
                has = true;
            }else if(i + 2 < nums.length && nums[i] == 7 && nums[i + 2] == 7 ) {
                has = true;
            }
        }
        return has;
    }

    public boolean has12(int[] nums) {
        boolean one = false;
        for (int i = 0; i < nums.length; i++) {
            if (!one && nums[i] == 1) {
                one = true;
            }
            if (one && nums[i] == 2) {
                return true;
            }
        }
        return false;
    }

    public boolean modThree(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if ((nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0) ||
                    (nums[i] % 2 == 1 && nums[i + 1] % 2 == 1 && nums[i + 2] % 2 == 1)) {
                return true;
            }
        }
        return false;
    }

    public boolean haveThree(int[] nums) {
        if (nums.length == 0) {
            return false;
        }
        int c = 0;

        if (nums[0] == 3) {
            c++;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 3) {
                c++;
            }
            if (nums[i] == 3 && nums[i - 1] == 3) {
                c--;
            }
        }
        return c == 3;
    }

    public static boolean twoTwo(int[] nums) {
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
           if (nums[i] == 2) {
               c++;
           }else if (nums[i] != 2 && c == 1){
               return false;
           }else {
               c = 0;
           }
        }
        return c != 1;
    }

    public boolean sameEnds(int[] nums, int len) {
        for (int i = 0; i <= len - 1; i++) {
            if (nums[i] != nums[nums.length - len + i]) {
                return false;
            }
        }
        return true;
    }

    public boolean tripleUp(int[] nums) {
        boolean adjacent = false;
        for (int i = 0; i < nums.length - 2; i++) {
            if (!adjacent && nums[i + 1] - nums[i] == 1 && nums[i + 2] - nums[i] == 2) {
                adjacent = true;
            }
        }
        return adjacent;
    }

    public int[] fizzArray3(int start, int end) {
        int[] fizzy = new int[end - start];
        for (int i = 0; i < end - start; i++) {
            fizzy[i] = i + start;
        }
        return fizzy;
    }

    public int[] shiftLeft(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }
        int[] rotated = new int[nums.length];
        rotated[rotated.length - 1] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            rotated[i - 1] = nums[i];
        }
        return rotated;
    }

    public int[] tenRun(int[] nums) {
        boolean ten = false;
        int multiple = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!ten && nums[i] % 10 == 0) {
                multiple = nums[i];
                ten = true;
            }
            else if (ten && nums[i] % 10 == 0) {
                multiple = nums[i];
            }else if (ten && nums[i] % 10 != 0) {
                nums[i] = multiple;
            }

        }
        return nums;
    }

    public int[] pre4(int[] nums) {
        int fourIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                fourIndex = i;
                break;
            }
        }
        return Arrays.copyOf(nums, fourIndex);
    }

    public int[] post4(int[] nums) {
        int fourIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                fourIndex = i;
            }
        }
        return Arrays.copyOfRange(nums, fourIndex + 1, nums.length);
    }

    public int[] notAlone(int[] nums, int val) {
        int max;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == val && (nums[i - 1] != val && nums[i + 1] != val)) {
                max = Math.max(nums[i - 1], nums[i + 1]);
                nums[i] = max;
            }
        }
        return nums;
    }

    public int[] zeroFront(int[] nums) {
        int[] zeroes = new int[nums.length];
        int frontIndex = 0;
        int endIndex = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroes[frontIndex++] = 0;
            }else{
                zeroes[endIndex--] = nums[i];
            }
        }
        return zeroes;
    }

    public int[] withoutTen(int[] nums) {
        int index = 0;
        int[] without = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 10) {
                without[index++] = nums[i];
            }
        }
        return without;
    }

    public int[] zeroMax(int[] nums) {
        int max = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 0) {
                nums[i] = max;
            }
            if (nums[i] % 2 == 1) {
                if (max == 0) {
                    max = nums[i];
                }else {
                    max = Math.max(nums[i], max);
                }

            }
        }
        return nums;
    }

    public int[] evenOdd(int[] nums) {
        int[] oddities = new int[nums.length];
        int frontIndex = 0;
        int endIndex = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                oddities[frontIndex++] = nums[i];
            }else{
                oddities[endIndex--] = nums[i];
            }
        }
        return oddities;
    }

    public static String[] fizzBuzz(int start, int end) {
        String[] strings = new String[end - start];

        for (int i = 0; i < strings.length; i++) {
            if ((i + start) % 3 == 0 && (i + start) % 5 == 0) {
                strings[i] = "FizzBuzz";
            }else if ((i + start) % 3 == 0) {
                strings[i] = "Fizz";
            }else if((i + start) % 5 == 0) {
                strings[i] = "Buzz";
            }else {
                strings[i] = Integer.toString(i + start);
            }
        }

        return strings;
    }

    public static void main(String[] args) {
        twoTwo(new int[] {2, 2, 4});
    }
}
