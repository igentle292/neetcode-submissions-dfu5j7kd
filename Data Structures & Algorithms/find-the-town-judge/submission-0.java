class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n == 1){
            return 1; 
        }
        Map<Integer, List<Integer>> trustsMap = new HashMap<>();    //person a trusts list
        Map<Integer, List<Integer>> trustedMap = new HashMap<>();   //person a is trusted by list

        for(int[] pair : trust){
            List<Integer> trustsList = trustsMap.get(pair[0]);
            if(trustsList == null){
                List<Integer> newList = new ArrayList<>();
                newList.add(pair[1]);
                trustsMap.put(pair[0], newList);
            } else{
                trustsList.add(pair[1]);
            }


            List<Integer> trustedList = trustedMap.get(pair[1]);
            if(trustedList == null){
                List<Integer> newList = new ArrayList<>();
                newList.add(pair[0]);
                trustedMap.put(pair[1], newList);
            } else{
                trustedList.add(pair[0]);
            }
        }

        for(int i=1; i<n+1; i++){
            if(!trustsMap.containsKey(i)){
                if(trustedMap.getOrDefault(i, Collections.emptyList()).size() == (n - 1)){
                    return i;
                }
            }
        }
        return -1;
    }
}