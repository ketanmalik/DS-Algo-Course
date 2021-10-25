/* Given an array, find the first recurring character and return it
*  Input - ['h', 'e', 'l', 'l', 'o', 'o']
*  Output - 'l'
* */

package FirstRecurringChar;

import java.util.HashMap;
import java.util.Map;

public class FirstRecurringChar {
    public static void main(String[] args) {
        char[] arr = {'h', 'e', 'l', 'l', 'o', 'o'};
        System.out.println(findFirstReccChar(arr));
    }

    public static String findFirstReccChar(char[] arr) {
        Map<Character, Boolean> hmap = new HashMap<>();

        for(char c: arr) {
            if(hmap.containsKey(c)) return String.valueOf(c);
            hmap.put(c, true);
        }
        return null;
    }
}
