// Top Down Approach

class Solution{
    public int longestCommonSubsequence(String text1, String text2) {
        int x = text1.length();
        int y = text2.length();
        int t[][] = new int[x+1][y+1];
        for(int i=0;i<x+1;i++){
            for(int j=0;j<y+1;j++){
                if(i==0 || j==0){
                    t[i][j] = 0;
                }
            }
        }
        for(int i=1;i<x+1;i++){
            for(int j=1;j<y+1;j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    t[i][j] = 1 + t[i-1][j-1];
                }
                else{
                    t[i][j] = Math.max(t[i][j-1],t[i-1][j]);
                }
            }
        }
        return t[x][y];
    }

}


// Memoization
class Solution {
    int lcs(int x, int y, String s1, String s2,int[][]t)
    {
        // your code here
        if(x==0 || y==0){
            return 0;
        }
        if(t[x][y]!=-1){
            return t[x][y];
        }
        if(s1.charAt(x-1)==s2.charAt(y-1)){
            return t[x][y] =  1+ lcs(x-1,y-1,s1,s2,t);
        }
        // else{
            return t[x][y] = Math.max(lcs(x-1,y,s1,s2,t), lcs(x,y-1,s1,s2,t));
        // }
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int x = text1.length();
        int y = text2.length();
        int t[][] = new int[x+1][y+1];
        for(int i=0;i<t.length;i++){
            Arrays.fill(t[i],-1);
        }
        return lcs(x,y,text1,text2,t);
    }
}
