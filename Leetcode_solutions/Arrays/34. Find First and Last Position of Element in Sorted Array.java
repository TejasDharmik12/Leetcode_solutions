class Solution {
    public int[] searchRange(int[] nums, int target) {
        // List<Integer> ls = new ArrayList<Integer
//         int fi = -1;
//         int li = -1;
//         for(int i =0 ; i<nums.length;i++){
//             if(nums[i]==target){
//                 fi = i;
//                 break;
                
//             }
//         }for(int j =nums.length-1 ; j>=0;j--){
            
//             if(nums[j]==target){
//                 li = j;
//                 break;
                
//             }
//         }
//         // int [] result = ls.toArray(ls);
//         // return Arrays.toString(result);
//        return new int[]{fi,li};
//     }
        int[] ans = {-1,-1};
        int lo=0;
        int hi=nums.length-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(nums[mid]==target){
                ans[0]= mid;
                //continue in left part
                hi = mid-1;
                
            }
            else if(nums[mid]<target){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        
        lo=0;
        hi=nums.length-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(nums[mid]==target){
                ans[1]= mid;
                //continue in right part
                lo = mid+1;
                
            }
            else if(nums[mid]<target){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return ans;
    }
}
