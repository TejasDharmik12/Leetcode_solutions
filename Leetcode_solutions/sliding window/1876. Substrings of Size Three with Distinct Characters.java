class Solution {
    public int countGoodSubstrings(String s) {
        int k=3;
        int j=0;
        int i=0;
        int Gcount = 0;
        String str = new String();
        while(j<s.length()){
            str =str + s.charAt(j);
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1 == k){
              str = s.substring(i);
                if((str.charAt(0) != str.charAt(1)) && (str.charAt(1) != str.charAt(2)) && (str.charAt(0) != str.charAt(2))){
                  Gcount++;
                }
                
                i++;
                j++;
            }
            
        }return Gcount;
    }
}
