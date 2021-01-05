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


}
