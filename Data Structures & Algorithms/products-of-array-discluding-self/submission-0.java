class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        
        // 1. Her indeks için, sadece solundaki elemanların çarpımını hesapla
        output[0] = 1;
        for (int i = 1; i < n; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }
        
        // 2. Diziyi sağdan sola tara, sağdaki çarpımları mevcut sol çarpımla buluştur
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            output[i] = output[i] * rightProduct;
            rightProduct *= nums[i]; // Bir sonraki döngü adımı için sağ çarpımı büyüt
        }
        
        return output;
    }
}  
