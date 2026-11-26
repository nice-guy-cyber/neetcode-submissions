class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
    return false;
  char[] arr = s.toCharArray();
Arrays.sort(arr);
s = new String(arr);

 char[] arr2 = t.toCharArray();
Arrays.sort(arr2);
t = new String(arr2);

return s.compareTo(t) == 0;
    }
}
