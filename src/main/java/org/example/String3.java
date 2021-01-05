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

    public static void main( String[] args ) {
        // Multiline text block requires Java 15+
        System.out.println(countYZ("!!day--yaz!!"));
    }
}

