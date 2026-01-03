class Solution {
    public boolean isPalindrome(String s) {
        String result = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        if(result.length()==1){
            return true;
        }
        int n=result.length();
        int i,j=0;
        if(n%2==0){
            i=n/2;
            j=i-1;
        }
        else{
            i=(n/2)+1;
            j=(n/2)-1;
        }
        for(int p=0;p<n/2;p++){
            if(result.charAt(i)!=result.charAt(j)){
                return false;
            }
           
            i++;
            j--;
            
        }
        return true;
    }
}
