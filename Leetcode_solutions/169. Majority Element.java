// O(n) space and O(n) time complexity

class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==0 || nums == null){
            return -1;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            if(!map.containsKey(num)){
                map.put(num,0);
            }
            map.put(num,map.get(num)+1);
        }
        
        int halflen = (nums.length/2);
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>halflen){
                return entry.getKey();
            }
        }return -1;
    }
}

//
