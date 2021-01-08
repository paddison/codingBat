package org.example;

public class String2 {
    public String doubleChar(String str) {
        String doubleChar = "";
        for (int i = 0; i < str.length(); i++) {
            doubleChar += "" + str.charAt(i) + str.charAt(i);
        }
        return doubleChar;
    }

    public int countHi(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if(str.substring(i, i + 2).equals("hi")){
                count++;
            }
        }
        return count;
    }

    public boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;

        for(int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                catCount++;
            }else if(str.substring(i, i + 3).equals("dog")) {
                dogCount++;
            }
        }

        return catCount == dogCount;
    }

    public int countCode(String str) {
        int codeCount = 0;
        for(int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals("co") && str.substring(i + 3, i + 4).equals("e")) {
                codeCount++;
            }
        }

        return codeCount;
    }

    public boolean endOther(String a, String b) {
        if (a.length() > b.length()) {
            return a.substring(a.length() - b.length()).equalsIgnoreCase(b);
        }else {
            return b.substring(b.length() - a.length()).equalsIgnoreCase(a);
        }
    }

    public static boolean xyzThere(String str) {
        if (str.length() < 3) {
            return false;
        }
        if (str.substring(0, 4).equals("xyz")) {
            return true;
        }
        for(int i = 1; i < str.length() - 3; i++) {
            if (str.substring(i + 1, i + 4).equals("xyz") && str.charAt(i) != '.'){
                return true;
            }
        }
        return false;
    }

    public boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }

    public boolean xyBalance(String str) {
        boolean balance = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                balance = false;
            }
            if(!balance) {
                balance = str.charAt(i) == 'y';
            }
        }
        return balance;
    }

    public static String mixString(String a, String b) {
        String mixed = "";
        while(a.length() > 0 && b.length() > 0) {
            mixed = mixed + a.charAt(0) + b.charAt(0);
            a = a.substring(1);
            b = b.substring(1);
        }

        return mixed + a + b;
    }

    public String repeatEnd(String str, int n) {
        String end = "";
        for(int i = n ;i > 0; i--) {
            end += str.substring(str.length() - n);
        }
        return end;
    }

    public String repeatFront(String str, int n) {
        String front = "";
        for(; n > 0; n--) {
            front += str.substring(0, n);
        }
        return front;
    }

    public String repeatSeparator(String word, String sep, int count) {
        if (count == 0) {
            return "";
        }
        String repeat = word;

        for (; count > 1; count--) {
            repeat += sep + word;
        }
        return repeat;
    }

    public boolean prefixAgain(String str, int n) {
        String sub = str.substring(0, n);

        for (int i = n; i <= str.length() - n; i++) {
            if (str.substring(i, i + n).equals(sub)) {
                return true;
            }
        }
        return false;
    }

    public static boolean xyzMiddle(String str) {
        if (str.length() < 3) {
            return false;
        }
        int rightLength;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.substring(i, i + 3).equals("xyz")) {
                rightLength = str.length() - (i + 3);
                if (Math.abs(rightLength - i) < 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public String getSandwich(String str) {
        int bread1 = -1;
        int bread2 = -1;

        for (int i = 0; i < str.length() - 4; i++) {
                if (str.substring(i, i + 5).equals("bread")) {
                    if (bread1 == -1) {
                        bread1 = i + 5;
                    } else {
                        bread2 = i;
                    }

            }
        }
        if (bread2 == -1) {
            return "";
        }
        return str.substring(bread1, bread2);
    }

    public boolean sameStarChar(String str) {
        boolean star = true;
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*') {
                star = str.charAt(i - 1) == str.charAt(i + 1);
            }
        }
        return star;
    }

    public String oneTwo(String str) {
        String moved = "";
        for (int i = 0; i < str.length() - 2; i += 3) {
            moved += str.substring(i + 1, i + 3) + str.charAt(i);
        }
        return moved;
    }

    public String zipZap(String str) {
        if (str.length() < 3) {
            return str;
        }
        String zpzp = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                zpzp += "zp";
                i += 2;
            }else {
                zpzp += str.charAt(i);
            }
        }
        return zpzp;
    }

    public static String starOut(String str) {
        String noStarsStr = "";
        boolean stars = false;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '*' && !stars) {
                stars = true;
                if (noStarsStr.length() > 0) {
                    noStarsStr = noStarsStr.substring(0, noStarsStr.length() - 1);
                }
            }
            else if (stars && str.charAt(i) != '*') {
                    stars = false;
            }else if(!stars){
                noStarsStr += str.charAt(i);
            }
        }

        return noStarsStr;
    }

    public static String plusOut(String str, String word) {
        String out = "";
        for (int i = 0; i < str.length(); i++) {
            if (i <= str.length() - word.length() && str.substring(i, i + word.length()).equals(word)) {
                out += word;
                i += word.length() - 1;
            }else {
                out += "+";
            }
        }
        return out;
    }

    public static String wordEnds(String str, String word) {
        String ends = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.startsWith(word, i)) {
                if(i > 0) {
                    ends += str.charAt(i - 1);
                }
                if (i + word.length() < str.length()) {
                    ends += str.charAt(i + word.length());
                }
            }
        }
        return ends;
    }



    public static void main(String[] args) {
        wordEnds("XY1XY", "XY");
    }
}
