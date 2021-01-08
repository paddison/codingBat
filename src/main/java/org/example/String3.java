package org.example;

public class String3 {

    public static int countYZ(String str) {
        int count = 0;
        char last;
        String[] words = str.split("[^a-z^A-Z]");
        for (String word : words) {
            if (word.length() > 0) {
                last = word.toLowerCase().charAt(word.length() - 1);
                if (last == 'y' || last == 'z') {
                    count++;
                }
            }

        }
        return count;
    }

    public String withoutString(String base, String remove) {
        return base.replaceAll("(?i)" + remove, "");
    }

    public boolean equalIsNot(String str) {
        int isCount = 0;
        int notCount = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if(str.startsWith("not", i) && i < str.length() - 2) {
                notCount++;
            }else if (str.startsWith("is", i)) {
                isCount++;
            }
        }
        return isCount == notCount;
    }

    public static boolean gHappy(String str) {
        int count;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g'){
                count = 1;
                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(j) == 'g'){
                        count++;
                        i = j;
                    }else {
                        break;
                    }
                }
                if (count == 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public int countTriple(String str) {
        int triples = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i + 1) == str.charAt(i) && str.charAt(i + 2) == str.charAt(i)) {
                triples++;
            }
        }
        return triples;
    }

    public int sumDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Integer.parseInt("" + str.charAt(i));
            }
        }
        return sum;
    }

    public static String sameEnds(String string) {
        String sameEnds = "";
        for (int i = 0; i < string.length() / 2; i++) {
            if(string.substring(0, i + 1).equals(string.substring(string.length() - (i + 1)))){
                sameEnds = string.substring(0, i + 1);
            }
        }
        return sameEnds;
    }

    static String mirrorEnds(String string) {
        String mirrorString = "";

        if (string.length() == 0) {
            return mirrorString;
        }

        for (int i = 0; i <= string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(string.length() - 1 - i)) {
                return mirrorString;
            }
            mirrorString += string.charAt(i);
        }

        return string;
        
    }

    public static int maxBlock(String str) {
        if (str.length() < 2) {
            return str.length();
        }

        int cur = 1;
        int max = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == str.charAt(i)) {
                cur++;
                max = Math.max(max, cur);
            }else {
                cur = 1;
            }
        }
        return max;
    }

    static int sumNumbers(String s) {
        String num = "0";
        int sum = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                num += (Character.toString(s.charAt(i)));
            }
            else
            {
                sum += Integer.valueOf(num);
                num = "0";
            }
        }
        return sum += Integer.valueOf(num);
    }

    static int sumNumbersFelix(String str) {
        int summ = 0;
        int tmp = 0;
        int stelle = 10;


        for(int i = 0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                tmp *= stelle;
                tmp += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
            if((i + 1) == str.length() || !(Character.isDigit(str.charAt(i)))){
                summ += tmp;
                tmp = 0;
            }
        }
        return summ;
    }

    public static String notReplace(String str) {
        String nots = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.startsWith("is", i)) {
                if ((i == 0 || !Character.isAlphabetic(str.charAt(i - 1))) &&
                    (i == str.length() - 2 || !Character.isAlphabetic(str.charAt(i + 2)))) {
                        nots += "is not";
                        i++;
                }else {
                    nots += str.charAt(i);
                }
            }else {
                nots += str.charAt(i);
            }
        }
        return nots;
    }

    public static void main( String[] args ) {
        // Multiline text block requires Java 15+
        notReplace("This is isabell");
    }
}

