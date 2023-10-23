// Recursive

class Solution{
    static int solve(int arr[],int i,int j){
        if(i>=j){
            return 0;
        }
        int mn = Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++){
            int tempans = solve(arr,i,k) + solve(arr,k+1,j) + arr[i-1]*arr[k]*arr[j];
            if(tempans<mn){
                mn = tempans;
            }
        }
        return mn;
    }
    static int matrixMultiplication(int N, int arr[])
    {
        // code here
        return solve(arr,1,N-1);
    }
}


// Memoization
class Solution{
    static int solve(int arr[],int i,int j,int t[][]){
        if(i>=j){
            return 0;
        }
        if(t[i][j] !=-1){
            return t[i][j];
        }
       
        int mn = Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++){
            int tempans = solve(arr,i,k,t) + solve(arr,k+1,j,t) + arr[i-1]*arr[k]*arr[j];
            if(tempans<mn){
                mn = tempans;
            }
        }
        return t[i][j] = mn;
    }
    static int matrixMultiplication(int N, int arr[])
    {
        // code here
      // as per constraints
      int t[][] = new int[1001][1001];
      for(int i=0;i<1001;i++){
        for(int j=0;j<1001;j++){
          t[i][j] = -1;
        }
      }
        return solve(arr,1,N-1,t);
    }
}
