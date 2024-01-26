public class oneAway {

    public static boolean isOneEditAway(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }

        int len1 = s1.length();
        int len2 = s2.length();

        if (Math.abs(len1 - len2) > 1) {
            return false;
        }

        String shorter = (len1 < len2) ? s1 : s2;
        String longer = (len1 < len2) ? s2 : s1;

        int index1 = 0;
        int index2 = 0;
        boolean foundDifference = false;

        while (index1 < shorter.length() && index2 < longer.length()) {
            if (shorter.charAt(index1) != longer.charAt(index2)) {
                if (foundDifference) {
                    return false;
                }
                foundDifference = true;

                if (len1 == len2) {
                    index1++; // Move shorter pointer if replacement
                }
            } else {
                index1++; // Move shorter pointer if characters match
            }
            index2++; // Always move pointer for longer string
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isOneEditAway("pale", "ple")); // true
        System.out.println(isOneEditAway("pales", "pale")); // true
        System.out.println(isOneEditAway("pale", "bale")); // true
        System.out.println(isOneEditAway("pale", "bake")); // false
    }
}
