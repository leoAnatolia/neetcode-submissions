class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String s:strs){
            sb.append(s.length()+"#");
            sb.append(s);
        }

        return sb.toString();

    }

    public List<String> decode(String s) {

        List<String> result = new ArrayList<>();
        int i = 0;
        
        while (i < s.length()) {
            int j = i;
            
            // Find the delimiter to isolate the length number
            while (s.charAt(j) != '#') {
                j++;
            }
            
            // Parse the length of the next string
            int length = Integer.parseInt(s.substring(i, j));
            
            // Extract the string based on the parsed length
            int stringStart = j + 1;
            String word = s.substring(stringStart, stringStart + length);
            result.add(word);
            
            // Move the pointer to the start of the next encoded string
            i = stringStart + length;
        }
        
        return result;


    }
}
