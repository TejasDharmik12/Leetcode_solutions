class Solution{
    static int m=1000000007;
 int countSubsetSum(int N, int arr[], int sum){
        // code here
        // initialization
        int[][] t = new int[N+1][sum+1];
            for (int i = 0; i < N + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                if (i == 0) {
                    t[i][j] = 0;
                }
                if (j == 0) {
                    t[i][j] = 1;
                }
            }
        }
        
        for(int i=1;i<N+1;i++){
            for(int j=0;j<sum+1;j++){
                if(arr[i-1]<=j){
                    t[i][j] = t[i-1][j-arr[i-1]]%m + t[i-1][j]%m;
                    
                }else{
                    t[i][j] = t[i-1][j]%m;
                }
            }
        }
        return t[N][sum]%m;
    }
