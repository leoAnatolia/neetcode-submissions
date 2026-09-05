class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Map<Character,Integer> sMap = new HashMap();
        Map<Character,Integer> tMap = new HashMap();

        for(int i =0; i<sArr.length; i++){
            sMap.put(sArr[i],sMap.getOrDefault(sArr[i],0) + 1);
            tMap.put(tArr[i],tMap.getOrDefault(tArr[i],0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : sMap.entrySet()) {
            if(!Objects.equals(tMap.get(entry.getKey()), entry.getValue()))
            return false;
        }
        return true;


    }
}
