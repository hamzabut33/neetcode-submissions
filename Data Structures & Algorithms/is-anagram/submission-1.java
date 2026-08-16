class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap <Character, Integer> letters = new HashMap <>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            letters.put(c, letters.getOrDefault(c, 0) + 1);
        }
        for (int j = 0; j < t.length(); j++) {
            char c = t.charAt(j);

            if (!letters.containsKey(c))
                return false;

            letters.put(c, letters.get(c) - 1);

            if (letters.get(c) < 0)
                return false;
        }
        return true;
        }
        
    }
