class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagrams = new ArrayList();

        for(String str : strs){
            if(anagrams.isEmpty()){
                List<String> anagramGroup = new ArrayList();
                anagramGroup.add(str);
                anagrams.add(anagramGroup);
            } else{
                boolean isAnagramFound = false;
                for(int i=0; i<anagrams.size() && !isAnagramFound; i++){
                // for(List<String> anagramGroup : anagrams){
                    List<String> anagramGroup = anagrams.get(i);
                    if(isAnagram(anagramGroup.get(0), str)){
                        anagramGroup.add(str);
                        isAnagramFound = true;
                    }
                }
                if(!isAnagramFound){
                    List<String> anagramGroup = new ArrayList();
                    anagramGroup.add(str);
                    anagrams.add(anagramGroup);
                }
            }
        }
        return anagrams;
    }

// if no other anagrams, add string to list of anagrams
// if other anagrams present, check, if true do not add, if false add


    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> stringSChars = new HashMap();
        HashMap<Character, Integer> stringTChars = new HashMap();

        for(int i=0; i<s.length(); i++){
            if(stringSChars.putIfAbsent(s.charAt(i), 1) != null){
                stringSChars.replace(s.charAt(i), stringSChars.get(s.charAt(i)) + 1);
            }
            if(stringTChars.putIfAbsent(t.charAt(i), 1) != null){
                stringTChars.replace(t.charAt(i), stringTChars.get(t.charAt(i)) + 1);
            }
        }
        
        return stringSChars.equals(stringTChars);
    }
}
