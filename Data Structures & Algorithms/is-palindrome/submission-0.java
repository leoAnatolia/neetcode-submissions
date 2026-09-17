class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Soldaki alfanümerik olmayan karakterleri atla
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // Sağdaki alfanümerik olmayan karakterleri atla
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Karakterleri küçük harfe çevirip karşılaştır
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            // İşaretçileri merkeze doğru kaydır
            left++;
            right--;
        }

        return true;
    }
    }

