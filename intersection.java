class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {
         LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    numbers.add(nums1[i]);
                    break;
                }
            }
        }
        int[] arr = numbers.stream().mapToInt(Integer::intValue).toArray();
        return arr;
    }
}
