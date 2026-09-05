class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        HashMap<Integer,String> checkMap = new HashMap();

        for(int a:nums){
            if(checkMap.get(a)!=null){
                return true;
            }

            checkMap.put(a,"constant");
        }

        return false;

    }
}