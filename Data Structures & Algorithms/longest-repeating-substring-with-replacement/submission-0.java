class Solution {
    public int characterReplacement(String s, int k) {


        int left=0,right=0,maxRepeatingCnt=0,longestWindow=0;


        int[] letters = new int[26];


        for(right=0; right<s.length(); right++){

            // 1. increment new letter's counter
            char newLetter = s.charAt(right);
            letters[newLetter - 'A']++;

            // 2. renew max repeating
            maxRepeatingCnt = Math.max(maxRepeatingCnt, letters[newLetter-'A']);

            int winSize = right-left+1 ;
            
            int problemChCnt = winSize - maxRepeatingCnt;

            if(problemChCnt > k){
                char leftCh = s.charAt(left);
                letters[leftCh - 'A']--;
                left++;
            }

            longestWindow = Math.max(longestWindow, right-left+1);


        }


        return longestWindow;
        
    }

    
}
