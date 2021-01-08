package org.example;

public class Logic2 {
    public boolean makeBricks(int small, int big, int goal) {

        if (big * 5 <= goal) {
            return (goal - big * 5 <= small);
        }else {
            return (goal % 5 <= small);
        }

    }

    public int loneSum(int a, int b, int c) {
        if (a == b && b == c){
            return 0;
        }else if (a == b) {
            return c;
        }else if (a == c) {
            return b;
        }else if (b == c) {
            return a;
        }else {
            return a + b + c;
        }
    }

    public int luckySum(int a, int b, int c) {
        if (a == 13) {
            return 0;
        }else if (b == 13) {
            return a;
        }else if (c == 13) {
            return a + b;
        }else {
            return a + b + c;
        }
    }

    public int noTeenSum(int a, int b, int c) {
        a = fixTeen(a);
        b = fixTeen(b);
        c = fixTeen(c);

        return a + b + c;
    }

    public int fixTeen(int teen) {
        if ((teen < 15 || teen > 16) && (teen > 12 && teen < 20)) {
            return 0;
        }else {
            return teen;
        }
    }
}
