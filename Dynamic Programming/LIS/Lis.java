class Solution {
    public static int f(int arr[],int idx,int prev_idx,int n,int dp[][]){
		// base
		if(idx==n){
			return 0;
		}
		if(dp[idx][prev_idx+1]!=-1){
			return dp[idx][prev_idx+1];
		}
		
		// not take
		int nottake = 0 + f(arr,idx+1,prev_idx,n,dp);
		// take
		int take=0;
		if(prev_idx==-1 || arr[idx]>arr[prev_idx]){
			take = 1+f(arr, idx+1, idx, n,dp);
		}
		// max
		return dp[idx][prev_idx+1]= Math.max(nottake, take);
	}
    public int lengthOfLIS(int[] nums) {
        int idx = 0;
        int prev_idx=-1;
        int n = nums.length;
        int dp[][]= new int[n][n+1];
        for(int[] row :dp){
            Arrays.fill(row,-1);
        }
        return f(nums,idx,prev_idx,n,dp);
    }
}
