class Solution {
    public int longestConsecutive(int[] nums) {
        
        int longest = 0;
        Set<Integer> checkSet = new HashSet();

        for(int n:nums){
            checkSet.add(n);
        }


        for(int n:nums){
            // check if it is the start of a sequence
            // if there is not a smaller number by 1 of any element of the array,
            // then it means it is the START of a sequence. If there is, then it means 
            // the sequence that element is a part of it doesn't start with this element

            if (!checkSet.contains(n-1)){
                int length = 0;

                while(checkSet.contains(n+length)){
                    length +=1 ;
                }
                longest = Math.max(longest,length);
            }

        }

        return longest;
    }
}
