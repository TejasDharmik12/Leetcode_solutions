// // 
// Input:
// X = abcd, Y = xycd
// Output: 6
// Explanation: Shortest Common Supersequence
// would be abxycd which is of length 6 and
// has both the strings as its subsequences.
class Solution
{
    public static int lcs(String a,String b,int m,int n){
        int t[][] = new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                if(i==0 || j==0){
                    t[i][j] = 0;
                }
            }
        }
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(a.charAt(i-1)==b.charAt(j-1)){
                    t[i][j] = 1+t[i-1][j-1];
                }
                else{
                    t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }
        return t[m][n];
    }
    //Function to find length of shortest common supersequence of two strings.
    public static int shortestCommonSupersequence(String X,String Y,int m,int n)
    {
        //Your code here
        return m+n-lcs(X,Y,m,n);
        
    }
}
