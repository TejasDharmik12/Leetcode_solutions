class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0;
        int j=0;
        double sum=0;
        double avg=-Double.MAX_VALUE;
        double mx = -Double.MAX_VALUE;
        while(j<nums.length){
            sum = sum +nums[j];
            avg = sum/k;
            if(j-i+1 <k){
                j++;
            }
            else if(j-i+1 == k){
               
                avg = sum/k;
                mx = Math.max(mx,avg);
                sum = sum -nums[i];
                i++;
                j++;
            }
        }return mx;
    }
}
