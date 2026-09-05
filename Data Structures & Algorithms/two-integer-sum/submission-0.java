class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> checkMap = new HashMap<>();

        int len = nums.length;
        for(int i=0; i<len; i++){
            int complement = target - nums[i];
            if(checkMap.containsKey(complement)){
                return new int[]{checkMap.get(complement), i};
            }
            checkMap.put(nums[i], i);
        }

        return null;
            }


}
