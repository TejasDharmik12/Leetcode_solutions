class Solution {
    public int firstUniqChar(String s) {
        if(s == null || s.length()==0){
            return -1;
        }
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            map.putIfAbsent(c,0);
            map.put(c,map.get(c)+1);
            
        }
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.get(c)==1){
                return i;
            }
        }
        return -1;
    }
}
