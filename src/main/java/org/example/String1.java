package org.example;

public class String1 {
    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0,2) + word + out.substring(2);
    }

    public String extraEnd(String str) {
        String sub = str.substring(str.length() - 2, str.length());
        return sub + sub + sub;
    }

    public String firstTwo(String str) {
        if (str.length() < 2) {
            return str;
        }else {
            return str.substring(0,2);
        }
    }

    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    public String comboString(String a, String b) {

        if (a.length() < b.length()){
            return a + b + a;
        }else {
            return b + a + b;
        }
    }

    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    public String left2(String str) {
        if (str.length() < 3) {
            return str;
        }else {
            return str.substring(2) + str.substring(0, 2);
        }
    }

    public String right2(String str) {
        if (str.length() < 3) {
            return str;
        }else {
            return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
        }
    }

    public String theEnd(String str, boolean front) {
        if (true) {
            return Character.toString(str.charAt(0));
        }else {
            return Character.toString(str.charAt(str.length() - 1));
        }
    }

    public String withoutEnd2(String str) {
        if (str.length() < 3) {
            return "";
        }
        return str.substring(1, str.length() - 1);
    }

    public String middleTwo(String str) {
        return "" + str.charAt(str.length() / 2 - 1) + str.charAt(str.length() / 2);
    }

    public boolean endsLy(String str) {
        if (str.length() < 2) {
            return false;
        }else {
            return str.substring(str.length() - 2).equals("ly");
        }
    }

    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }

    public String twoChar(String str, int index) {
        if (index + 1 >= str.length() || index < 0) {
            return str.substring(0, 2);
        }else {
            return str.substring(index, index + 2);
        }
    }

    public String middleThree(String str) {
        int len = str.length();
        return "" + str.charAt(len / 2 - 1) + str.charAt(len / 2) + str.charAt(len / 2 + 1);
    }

    public boolean hasBad(String str) {
        if (str.length() < 3) {
            return false;
        }else if (str.substring(0,3).equals("bad")) {
            return true;
        }else if (str.length() < 4){
            return false;
        }else if (str.substring(1, 4).equals("bad")) {
            return true;
        }
        return false;
    }

    public String atFirst(String str) {
        if (str.length() == 0) {
            return "@@";
        }else if (str.length() == 1) {
            return str.charAt(0) + "@";
        }else {
            return str.substring(0, 2);
        }
    }

    public String lastChars(String a, String b) {
        if (a.length() == 0 ) {
            a = "@";
        }
        if (b.length() == 0 ) {
            b = "@";
        }
        return "" + a.charAt(0) + b.charAt(b.length() - 1);
    }

    public String conCat(String a, String b) {
        if (a.length() == 0) {
            return b;
        }
        if (b.length() == 0) {
            return a;
        }
        if (a.charAt(a.length() - 1) == b.charAt(0)) {
            return a + b.substring(1);
        }else {
            return a + b;
        }
    }

    public String lastTwo(String str) {
        if (str.length() < 2) {
            return str;
        }else {
            int length = str.length();
            return str.substring(0, length - 2) + str.charAt(length - 1) + str.charAt(length - 2);
        }
    }

    public static String seeColor(String str) {
        if (str.length() > 2 && str.substring(0, 3).equalsIgnoreCase("red")) {
            return "red";
        }else if (str.length() > 3 && str.substring(0, 4).equalsIgnoreCase("blue")) {
            return "blue";
        }else {
            return "";
        }
    }

    public boolean frontAgain(String str) {
        if (str.length() < 2) {
            return false;
        }
        String front = str.substring(0,2);
        String again = str.substring(str.length() - 2);

        return front.equals(again);
    }

    public String minCat(String a, String b) {
        if (a.length() < b.length()) {
            b = b.substring(b.length() - a.length());
        }else if (b.length() < a.length()) {
            a = a.substring(a.length() - b.length());
        }
        return a + b;
    }

    public String extraFront(String str) {
        if (str.length() > 1) {
            str = str.substring(0, 2);
        }
        return str + str + str;

    }

    public String without2(String str) {
        if (str.length() < 2 || !(str.substring(0,2).equals(str.substring(str.length() - 2)))) {
            return str;
        }else {
            return str.substring(2);
        }
    }

    public String deFront(String str) {
        String helper = "";
        if (str.charAt(0) == 'a') {
            helper += "a";
        }
        if (str.charAt(1) == 'b') {
            helper += "b";
        }

        return helper + str.substring(2);
    }

    public String startWord(String str, String word) {
        if (str.length() < word.length()) {
            return "";


        }else if (word.length() == 1) {
            return "" + str.charAt(0);
        }else if (str.substring(1, word.length()).equals(word.substring(1))) {
            return str.substring(0, word.length());
        }else {
            return "";
        }
    }

    public String withoutX(String str) {
        if (str.length() < 1) {
            return "";
        }
        if (str.charAt(0) == 'x') {
            str = str.substring(1);
        }
        if (str.length() > 0 && str.charAt(str.length() - 1) == 'x') {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }

    public String withoutX2(String str) {

        if (str.length() > 1 && str.charAt(1) == 'x') {
            str = str.charAt(0) + str.substring(2);
        }
        if (str.length() > 0 && str.charAt(0) == 'x') {
            str = str.substring(1);
        }
        return str;
    }


    public static void main(String[] args) {
        System.out.println(seeColor("red"));
    }
}
