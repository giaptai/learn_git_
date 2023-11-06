public class tma_que {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            minLength = Math.min(minLength, strs[i].length());
        }
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < minLength; i++) {
            char currChar = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != currChar) {
                    return result.toString();
                }
            }
            result.append(currChar);
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        // String[] s = { "flower", "flow", "flight" };
        // String[] s = { "ab", "a" };
        // String[] s = { "dog","racecar","car" };
        // String[] s = { "a" };
        String[] s = { "a", "b" };
        System.out.println(longestCommonPrefix(s));
    }
}
