class Solution {
    public String lcs(String a, String b, int m, int n){
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
                }else{
                    t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }
        // return t[m][n];
        StringBuilder sb = new StringBuilder();
        int i = m;
        int j=n;
        while(i>0 && j>0){
            if(a.charAt(i-1)==b.charAt(j-1)){
                sb.append(a.charAt(i-1));
                i--;
                j--;
            }
            else if(t[i-1][j]>t[i][j-1]){
                i--;
            }
            else{
                j--;
            }
        }
        return sb.reverse().toString();
    }
    public String shortestCommonSupersequence(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        int i=0;
        int j=0;
        StringBuilder sb = new StringBuilder();
        String lcss = lcs(str1,str2,m,n);
        for(char c:lcss.toCharArray()){
            while(str1.charAt(i)!=c){
                sb.append(str1.charAt(i++));
            }
            while(str2.charAt(j)!=c){
                sb.append(str2.charAt(j++));
            }
            sb.append(c);
            i++;
            j++;
        }
        sb.append(str1.substring(i)).append(str2.substring(j));
        return sb.toString();
    }
}
