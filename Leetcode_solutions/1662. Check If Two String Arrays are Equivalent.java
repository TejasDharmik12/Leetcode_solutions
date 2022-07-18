class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
     StringBuilder s1 = new StringBuilder();    //String 1  
     StringBuilder s2 = new StringBuilder();   
    for(String s: word1){
         s1.append(s); 
    }
      for(String s: word2){
         s2.append(s); 
    }  
    return s1.toString().equals(s2.toString());
       
    }}
