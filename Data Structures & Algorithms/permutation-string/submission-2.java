class Solution {
    public static boolean isTrue(int[] arr1, int[] arr2){
        for(int i=0;i<26;i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length()){
            return false;
        }
        int arr1[] = new int[26];
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            int inx1 = ch - 'a';
            arr1[inx1]++;
        }
        int i = 0;
        int windowSize = s1.length();
        int arr2[] = new int[26];
        for(i=0;i<windowSize;i++){
            char ch1 = s2.charAt(i);
            int inx2 = ch1 - 'a';
            arr2[inx2]++;
        }
        
        if(isTrue(arr1 , arr2)==true){
            return true;
        }
        else{

            while(i < s2.length()){
                char newChar = s2.charAt(i);
                int newCharInx = newChar - 'a';
                arr2[newCharInx]++;

                int oldIndex = i - s1.length();
                char oldChar = s2.charAt(oldIndex);
                //have olde charter ni frequnci ma index sodhva ni
                int friqOldChar = oldChar - 'a';
                arr2[friqOldChar]--;

                if(isTrue(arr1, arr2) == true) return true;
                i++;
            }

        }

        return false;

    }
}
