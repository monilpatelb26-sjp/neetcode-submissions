class Solution {
    public boolean isAnagram(String s, String t) {

        int arr1[] = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int n = ch - 'a';
            arr1[n]++;
        }
        int arr2[] = new int[26];
        for(int i=0;i<t.length();i++){
            char ch1 = t.charAt(i);
            int n1 = ch1 - 'a';
            arr2[n1]++;
        }

        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;

    }
}
