class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> checkSet = new HashSet();

        for(int a:nums){
            if(checkSet.contains(a)){
                return true;
            }

            checkSet.add(a);
        }

        return false;

    }
}