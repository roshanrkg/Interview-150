class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        if(n==1){
            return ;
        }
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
            char temp=s[j];
            s[j]=s[i];
            s[i]=temp;
           
            i++;
            j--;
            
        }
    }
}
