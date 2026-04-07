class Solution {

    public String encode(List<String> strs) {
        StringBuilder build = new StringBuilder();
        for(String str : strs){
            build.append(Integer.toString(str.length()));
            build.append('#');
            build.append(str);
        }
        System.out.println(build);
        return build.toString();
    }

    public List<String> decode(String str) {
        if(str.length() == 0){
            return new ArrayList<String>();
        } else{
            List<String> results = new ArrayList<>();
            int i = 0;
            int pound, string_length;
            while(i<str.length()){
                pound = str.indexOf("#", i);
                string_length = Integer.parseInt(str.substring(i, pound));
                i = pound + 1;
                results.add(str.substring(i, i + string_length));
                i += string_length;
            }
            return results;
        }
    }
}
