class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length()==0){
            return 0;
        }
        HashSet<Character> set1 = new HashSet<>();
        int result = 1;
        int start = 0;
        int end;
        
        for(end=0;end<s.length();end++){
            char c = s.charAt(end);
            if(!set1.contains(c)){
                set1.add(c);
                result = Math.max(result,set1.size());
            }else{
                while(start<end){
                    if(s.charAt(start)==c){
                        start++;
                        break;
                    }
                    set1.remove(s.charAt(start));
                    start++;
                    
                }
                
            }
        }
        return result;
    }
}
