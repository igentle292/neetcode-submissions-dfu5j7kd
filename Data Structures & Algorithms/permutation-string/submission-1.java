class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() == 1){
            return s2.contains(s1);
        }

        if(s1.length() > s2.length()){
            return false;
        }

        List<Character> l1 = new ArrayList<>();
        for(int i=0; i<s1.length(); i++){
            l1.add(s1.charAt(i));
        }
        Collections.sort(l1);

        List<Character> l2 = new ArrayList<>();
        int i=0;
        while(i<s1.length()){
            l2.add(s2.charAt(i++));
        }
        Collections.sort(l2);
        if(l1.equals(l2)){
            return true;
        }

        int j=0;
        while(i<s2.length()){
            if(l1.equals(l2)){
                return true;
            }
            l2.remove((Character) s2.charAt(j++));

            //insert next char at sorted order
            char next = s2.charAt(i++);
            for(int k=l2.size() - 1; k>=0; k--){
                if(next >= l2.get(k)){
                    l2.add(k + 1, next);
                    k = -2;
                }
            }

            if(l1.size() != l2.size()){
                l2.add(0, next);
            }

        }
        return l1.equals(l2);
    }
}
