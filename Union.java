class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<a.length;i++){
            ans.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            ans.add(b[i]);
        }
        LinkedHashSet<Integer> setWithoutDuplicates = new LinkedHashSet<>(ans); // linked hash set removes duplicates 
        
        ArrayList<Integer> anss = new ArrayList<>(setWithoutDuplicates);// again converting back to array list
        return anss;
    }
}
