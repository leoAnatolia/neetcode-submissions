class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        

        HashMap<Integer,Integer> counterMap = new HashMap();
        List<Integer> result = new ArrayList();

        for(int i=0; i<nums.length; i++){

            if(null==counterMap.get(nums[i])){
                counterMap.put(nums[i],1);
            }
            else{
                counterMap.put(nums[i],1+counterMap.get(nums[i]));
            }
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(counterMap.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        for(int i = 0; i < k; i++){
            result.add(list.get(i).getKey());
        }
        int[] res = new int[result.size()];

        for(int i=0; i<result.size(); i++){
            res[i] = result.get(i);
        }
        return res;


    }
}
