class Solution {
    public boolean isValid(String s) {

        
        if(s.charAt(0)==')' || s.charAt(0)==']' || s.charAt(0)=='}')
            return false;

        Stack<Character> stack = new Stack();

        for(char c:s.toCharArray()){
            if(c=='(' || c=='[' || c=='{'){
                stack.push(c);
            }

            else {
                // Eğer yığın boşsa (karşılık gelen bir açılış parantez yoksa) geçersizdir
                if (stack.isEmpty()) {
                    return false;
                }
                
                char top = stack.pop();
                // Parantez türlerinin eşleşip eşleşmediğini kontrol et
                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }
        
        // İşlem bittiğinde yığın tamamen boş olmalıdır (kapatılmamış parantez kalmamalıdır)
        return stack.isEmpty();
    }
}
        
    
