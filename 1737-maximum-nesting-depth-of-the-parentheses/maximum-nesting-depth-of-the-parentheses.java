class Solution {
    public int maxDepth(String s) {
        int count=0;
        int max_count=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                count++;
            }
            if(count>max_count){
                max_count=count;
            }
            else if(c==')'){
                count--;
            }
        }
        return max_count;
    }
}