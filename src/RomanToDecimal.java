/**
 * Converts roman numerals to decimals
 * @author 25gaddy
 * @version 10.9.23
 * Hey Mr. Cochran, I used these two resources for my extra. First resources: https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#replaceFirst-java.lang.String-java.lang.String-. Second Resource: https://stackoverflow.com/questions/12967896/converting-integers-to-roman-numerals-java
 * Hey Mr. Cochran, I got a little bit of help from Andrew and Siddharth, so apologies if anything is similar with the syntax in our extra
 */
public class RomanToDecimal {
    /**
     * Takes a roman numeral, returns the int value
     * @param roman a String
     * @return the int value of roman
     */
    public static int romanToDecimal(String roman)  {
        int value = 0;
        char temp;
        roman = roman.toLowerCase();

        if(roman.equals("your_mom"))    {
            System.out.println("DON'T TALK ABOUT MY MOM LIKE !!");
            return -1; }

        for(int i = 0; i < roman.length(); i++) {
            temp = roman.charAt(i);
            if(letterVal(temp) == -1)
                return -1;
            value += letterVal(temp);
        }
        // HERE IS WHERE WE WILL HANDLE INVARIANTS
        if(roman.indexOf("iv") != -1)
            value -= 2;
        if(roman.indexOf("ix") != -1)
            value -= 2;
        if(roman.indexOf("xl") != -1)
            value -= 20;
        if(roman.indexOf("xc") != -1)
            value -= 20;
        if(roman.indexOf("cd") != -1)
            value -= 200;
        if(roman.indexOf("cm") != -1)
            value -= 200;
        // RETURNING FINAL VALUE
        return value;
    }

    private static int letterVal(char roman)   {
        if (roman == 'i')
            return 1;
        else if(roman == 'v')
            return 5;
        else if(roman == 'x')
            return 10;
        else if(roman == 'l')
            return 50;
        else if(roman == 'c')
            return 100;
        else if(roman == 'd')
            return 500;
        else if(roman == 'm')
            return 1000;
        else
            return -1;
    }

    /**
     * Correctly takes into account all the invariants into the roman numeral and stores it into a newValue variable
     * @param roman, a String
     * @return the new int value that will compare to the other int value variable
     */
    // this is my extra
    public static int validRomanToDecimal(String roman)  {
        int newValue = 0;
        roman = roman.toLowerCase();
        while(roman.contains("iv"))  {
            roman = roman.replaceFirst("iv", "");
            newValue += 4;
        }
        while(roman.contains("ix"))  {
            roman = roman.replaceFirst("ix", "");
            newValue += 9;
        }
        while(roman.contains("xl"))  {
            roman = roman.replaceFirst("xl", "");
            newValue += 40;
        }
        while(roman.contains("xc"))  {
            roman = roman.replaceFirst("xc", "");
            newValue += 90;
        }
        while(roman.contains("cd"))  {
            roman = roman.replaceFirst("cd", "");
            newValue += 400;
        }
        while(roman.contains("cm"))  {
            roman = roman.replaceFirst("cm", "");
            newValue += 900;
        }
        for(int i = 0; i < roman.length(); i++) {
            char temp = roman.charAt(i);
            int num = letterVal(temp);
            if (num == -1)
                return -1;
            newValue += num;
        }
        return newValue;
    }
    /**
     * Main method of class RomanToDecimal
     * @param args command line args if needed
     */
    public static void main(String[] args) {
        int val = 0;
        for(String roman : args) {
            val = romanToDecimal(roman);
            int newValue = validRomanToDecimal(roman);
            if(val == -1)
                System.out.println("Input: " + roman + " => output: invalid");
            else if (val != newValue)
                System.out.println("Input: " + roman + " => output: logically incorrect");
            else
                System.out.println("Input: " + roman + " => output: " + newValue);
        }
    }
}
