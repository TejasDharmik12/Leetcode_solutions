class Solution {
    public int[] singleNumber(int[] nums) {
        Set <Integer> s = new HashSet<Integer>();
        for(int num : nums){
        if(s.contains(num)){
            s.remove(num);
        }
        else{
             s.add(num);   
            }
        }
        int []result = new int[2];
        
        // return s.toArray(new Integer[2]);
        int i=0;
        for(int ele: s){
            result[i] = ele;
            i++;
        }return result;
    }
}
