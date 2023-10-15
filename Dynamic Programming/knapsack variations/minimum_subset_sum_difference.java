class Solution
{
     List<Integer> isSubsetSum(int N, int arr[], int sum){
        // code here
        // initialization
        boolean[][] t = new boolean[N+1][sum+1];
        for(int i=0;i<N+1;i++){
            for(int j=0;j<sum+1;j++){
                if(i==0 ){
                    t[i][j] = false;
                }
                if(j==0){
                    t[i][j] = true;
                }
            }
        }
        
        for(int i=1;i<N+1;i++){
            for(int j=1;j<sum+1;j++){
                if(arr[i-1]<=j){
                    t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j];
                    
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        List<Integer> ls = new ArrayList<>();
        // int[]a = new int[sum+1];
        for(int j=0;j<=(sum)/2;j++){
            if(t[N][j]==true){
                ls.add(j);
              
            }
        }
        return ls;
        // return t[N][sum];
    }
	public int minDifference(int arr[], int n) 
	{ 
	    // Your code goes here
	   // 1.find range
	   int range=0;
	   for(int i=0;i<n;i++){
	       range+=arr[i];
	   }
	   int s1=0;
	   int ans=Integer.MAX_VALUE;
	   List<Integer> arrsum= isSubsetSum(arr.length,arr,range);
	   for(int i=0;i<arrsum.size();i++){
	      ans= Math.min(ans,range - 2*arrsum.get(i));
	   }
	   return ans;
	   //int diff = range - 2*s1;
	} 
}
