package StringReverse;

/*
*   Create a function that reverses a string
*   Input - 'Hi, my name is Ketan'
*   Output - 'nateK si eman ym ,iH'
*
*   Create another function that reverses a string with only O(1) space
*   Input - ['H', 'e', 'l', 'l', 'o']
*   Output - ['o', 'l', 'l', 'e', 'H']
*
* */


import java.util.Arrays;

public class StringReverse {
    public static void main(String[] args) {
        String str = "Hi, my name is Ketan";
        System.out.println(reversedString(str));

        char[] strArr = new char[]{'H', 'e', 'l', 'l', 'o'};
        reversedStringEfficient(strArr);
        System.out.println(Arrays.toString(strArr));
    }

    // Uses O(n) time, O(n) space
    public static String reversedString(String str) {
        return new StringBuilder(str)
                .reverse()
                .toString();

        /*  Another way of doing it
        *   StringBuilder sb = new StringBuilder();
            char[] charArray = str.toCharArray();
            for(int i = charArray.length - 1; i >= 0; i--) {
                sb.append(charArray[i]);
            }
        *
        * */


    }

    // Uses O(n) time, O(1) space
    public static void reversedStringEfficient(char[] strArr) {
        int first = 0, last = strArr.length - 1;
        char temp;

        while(first < last) {
            temp = strArr[first];
            strArr[first++] = strArr[last];
            strArr[last--] = temp;
        }
    }
}
