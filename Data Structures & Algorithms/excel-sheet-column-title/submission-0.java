class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while(columnNumber > 0){
            int remainder = (columnNumber - 1) % 26;
            char ch = (char) ('A' + remainder);
            result.insert(0, ch);
            columnNumber = (columnNumber - remainder) / 26;
        }
        return result.toString();
    }
}