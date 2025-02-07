class Solution{
    public int lcs(String a,String b,int m,int n){
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
                if(a.charAt(i-1) == b.charAt(j-1)){
                    t[i][j] = 1 + t[i-1][j-1];
                }
                else{
                    t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
                }
            }
        }
        return t[m][n];
    }
    public int minInsertions(String s) {
        // lps = lcs(s,s.reverse())
        String s1 = new StringBuilder(s).reverse().toString();
        int m = s.length();
        return s.length() - lcs(s,s1,m,m);
    }
    
}
