class Solution {
    public boolean isAnagram(String s, String t) {

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);Arrays.sort(tArr);

        if(s.length() == t.length()){

            for(int i = 0; i<sArr.length; i++){
                if(sArr[i] != tArr[i])
                    return false;
            }

            return true;
        }

        return false;



    }
}
