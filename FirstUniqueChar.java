class Solution {
    public int firstUniqChar(String s) {
        Set<Character> ch = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(ch.contains(s.charAt(i))){
                continue;
            }
            int p=0;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==(s.charAt(j))){
                    ch.add(s.charAt(i));
                    p=1;
                    break;
                }
            }
              if(p==0){
                    return i;
                }
        }
        return -1;
    }
}
