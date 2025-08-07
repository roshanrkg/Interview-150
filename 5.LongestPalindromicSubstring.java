class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);       
            int len2 = expandAroundCenter(s, i, i + 1);   
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}

// Brute force approach
class Solution {
    public String longestPalindrome(String s) {
        int length=0;
        String longest="";
          for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
               String s2= s.substring(i, j);
                String s3 = new StringBuffer(s2).reverse().toString();
                // for(int k=0;k<s2.length();k++){
                // char ch=s2.charAt(k);
                // s3=ch+s3;
                // }
                if(s3.equals(s2)){  
                    if(s3.length()>length){
                        length = s3.length();
                        longest = s3;
                    }

                }
                
            }
        }
        return longest;
    }
}
