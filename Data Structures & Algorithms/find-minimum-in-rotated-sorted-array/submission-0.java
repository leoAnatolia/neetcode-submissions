class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        // Döngü left ve right buluşana kadar devam eder
        while (left < right) {
            int mid = left + (right - left) / 2;

            // Ortadaki eleman sağdaki elemandan büyükse, 
            // kırılma noktası (en küçük eleman) sağ taraftadır.
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } 
            // Ortadaki eleman sağdaki elemandan küçükse,
            // en küçük eleman sol taraftadır veya mid'in kendisidir.
            else {
                right = mid;
            }
        }

        // Döngü bittiğinde left == right olur ve en küçük elemanı gösterir
        return nums[left];
    }
}
