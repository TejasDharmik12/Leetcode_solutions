class Solution
{
    public int lcs(String a, String b, int m ,int n){
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
                    t[i][j] = 1 + t[i-1][j-1];
                }
                else{
                    t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }
        return t[m][n];
    }
	public int minOperations(String str1, String str2) 
	{ 
	    // Your code goes here
	    int m = str1.length();
	    int n = str2.length();
	   // System.out.println(lcs(str1,str2,m,n));
	    int del = m - lcs(str1,str2,m,n);
	    int insr = n - lcs(str1,str2,m,n);
	    return del+insr;
	} 
}
