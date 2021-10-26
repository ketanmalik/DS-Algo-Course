package IsomorphicStrings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicStrings {

    public static void main(String[] args) {
        String s1 = "paper";
        String s2 = "title";
        System.out.println(isIsomorphic(s1, s2));
    }

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map1 = new HashMap<>();
        Set<Character> set2 = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (map1.containsKey(c1)) {
                if (c2 != map1.get(c1)) return false;
            } else {
                if (set2.contains(c2)) return false;
                map1.put(c1, c2);
                set2.add(c2);
            }
        }

        return true;
    }
}
