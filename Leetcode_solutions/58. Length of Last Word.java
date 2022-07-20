class Solution {
    public int lengthOfLastWord(String s) {
    if(s.length()==0  || s==null){
        return 0;
    }
      s = s.trim();
      for(int i=s.length()-1;i>=0;i--){
          if (s.charAt(i) == ' ') {
              return s.length()-i-1;
          }
      }return s.length() ;
}
}
