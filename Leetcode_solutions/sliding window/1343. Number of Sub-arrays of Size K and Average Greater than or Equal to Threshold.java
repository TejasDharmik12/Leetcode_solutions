class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int sum = 0;
        int j=0;
        int i=0;
        int avg=0;
        while(j<arr.length){
            sum = sum +arr[j];
            avg = sum/k;
            if(j-i+1 <k){
                j++;
            }
            else if(j-i+1 == k){
                if(avg>=threshold){
                    count++;
                }
                sum = sum -arr[i];
                avg = sum/k;
                i++;
                j++;
            }
        }return count;
    }
}
