package org.example;

import java.util.Arrays;

public class AP1 {
    public boolean scoresIncreasing(int[] scores) {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < scores[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public boolean scores100(int[] scores) {
        boolean hundred = false;
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] == 100 && scores[i + 1] == 100) {
                hundred = true;
            }
        }
        return hundred;
    }

    public boolean scoresClump(int[] scores) {
        boolean differ = false;
        for (int i = 0; i < scores.length - 2; i++) {
            if (Math.abs(scores[i] - scores[i + 2]) <= 2){
                differ = true;
            }
        }
        return differ;
    }

    public int scoresAverage(int[] scores) {
        int sumL = average(scores, 0, scores.length / 2);
        int sumR = average(scores, scores.length / 2, scores.length);

        if (sumL > sumR) {
            return sumL;
        }else {
            return sumR;
        }
    }

    public int average(int[] scores, int start, int end) {
        int sum = 0;

        for (int i = start; i < end; i++) {
            sum += scores[i];
        }

        return sum / (end - start);
    }

    public int wordsCount(String[] words, int len) {
        int c = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == len) {
                c++;
            }
        }

        return c;
    }

    public String[] wordsFront(String[] words, int n) {
        String[] returnWords = new String[n];

        for (int i = 0; i < n; i++){
            returnWords[i] = words[i];
        }

        return returnWords;
    }

    public String[] wordsWithoutList(String[] words, int len) {
        String[] without = new String[0];
        for (String word : words) {
            if (word.length() != len) {
                without = Arrays.copyOf(without, without.length + 1);
                without[without.length - 1] = word;
            }
        }

        return without;
    }

    public static boolean hasOne(int n) {
        boolean one = false;
        while (n > 0) {
            if (n % 10 == 1) {
                one = true;
            }
            n = n / 10;
        }
        return one;
    }

    public static boolean dividesSelf(int n) {

        int num = n;
        while (num > 0) {
            if(num % 10 == 0 || (n % (num % 10)) != 0) {
                return false;
            }
            num = num / 10;

        }
        return true;
    }

    public int[] copyEvens(int[] nums, int count) {
        int[] evens = new int[count];
        for (int i = 0; count > 0; i++) {
            if (nums[i] % 2 == 0) {
                evens[evens.length - count--] = nums[i];

            }
        }
        return evens;
    }

    public int[] copyEndy(int[] nums, int count) {
        int[] endies = new int[count];
        for (int i = 0; count > 0; i++) {
            if (isEndy(nums[i])) {
                endies[endies.length - count--] = nums[i];
            }
        }
        return endies;
    }

    public boolean isEndy(int num) {
        return ((num <= 10 && num >= 0) || (num <= 100 && num >= 90 ));
    }

    public int matchUp(String[] a, String[] b) {
        int matches = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].length() > 0 && b[i].length() > 0&& a[i].charAt(0) == b[i].charAt(0)){
                matches++;
            }
        }

        return matches;
    }

    public int scoreUp(String[] key, String[] answers) {
        int score = 0;

        for (int i = 0; i < key.length; i++) {
            if (answers[i].charAt(0) == '?') {
                continue;
            }else if (answers[i].charAt(0) == key[i].charAt(0)) {
                score += 4;
            }else {
                score--;
            }
        }

        return score;
    }

    public String[] wordsWithout(String[] words, String target) {
        String[] without = new String[0];
        for (String word : words) {
            if (!target.equals(word)) {
                without = Arrays.copyOf(without, without.length + 1);
                without[without.length - 1] = word;
            }
        }

        return without;
    }

    public int scoresSpecial(int[] a, int[] b) {
        return largestSpecial(a) + largestSpecial(b);
    }

    public int largestSpecial(int[] arr) {
        int largest = 0;
        for (int n : arr) {
            if (n % 10 == 0 && n > largest) {
                largest = n;
            }
        }
        return largest;
    }

    public int sumHeights(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start + 1; i <= end; i++){
            sum += Math.abs(heights[i - 1] - heights[i]);
        }
        return sum;
    }

    public static int sumHeights2(int[] heights, int start, int end) {
        int sum = 0;
        int difference;
        for (int i = start + 1; i <= end; i++){
            difference = heights[i] - heights[i - 1];
            if (difference > 0) {
              sum += difference * 2;
            }else {
                sum += -difference;
            }
        }
        return sum;
    }

    public int bigHeights(int[] heights, int start, int end) {
        int sum = 0;
        int difference;
        for (int i = start + 1; i <= end; i++){
            difference = Math.abs(heights[i] - heights[i - 1]);
            if (difference >= 5) {
                sum++;
            }
        }
        return sum;
    }

    public int userCompare(String aName, int aId, String bName, int bId) {
        int compare = aName.compareTo(bName);
        if (compare < 0) { // a before b
            return -1;
        }else if (compare > 0) { // b before a
            return 1;
        }else {
            if (aId < bId){
                return -1;
            }else if (aId > bId) {
                return 1;
            }else {
                return 0;
            }
        }
    }

    public static String[] mergeTwo(String[] a, String[] b, int n) {
        String[] merged = new String[n];
        int aIndex = 0;
        int bIndex = 0;
        while(n > 0) {
            if (a[aIndex].compareTo(b[bIndex]) == 0) {
                merged[merged.length - n--] = a[aIndex];
                aIndex++;
                bIndex++;
            }else if (a[aIndex].compareTo(b[bIndex]) < 0) {
                merged[merged.length - n--] = a[aIndex++];
            }else {
                merged[merged.length - n--] = b[bIndex++];
            }
        }
        return merged;
    }

    public int commonTwo(String[] a, String[] b) {
        int commons = 0;
        int aIndex = 0;
        int bIndex = 0;
        String lastAdded = "";
        while (aIndex < a.length && bIndex < b.length) {
            if((a[aIndex].equals(b[bIndex])) ){
                if (!a[aIndex].equals(lastAdded)){
                    commons++;
                    lastAdded = a[aIndex];
                }
                aIndex++;
                bIndex++;
            }else if (a[aIndex].compareTo(b[bIndex]) < 0){
                aIndex++;
            }else{
                bIndex++;
            }
        }
        return commons;
    }


    public static void main(String[] args) {
        mergeTwo(new String[]{"a", "c", "z"}, new String[]{"c", "f", "z"}, 3);
    }

}
