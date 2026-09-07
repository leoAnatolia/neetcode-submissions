class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Map to hold the sorted string as a key, and list of anagrams as the value
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            // 1. Sort the characters of the current word
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            // 2. Initialize a new list if the key is not already in the map
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }

            // 3. Add the original unsorted word to the correct list
            map.get(sortedWord).add(word);
        }

        // 4. Return all the grouped lists 
        return new ArrayList<>(map.values());
    }
}
