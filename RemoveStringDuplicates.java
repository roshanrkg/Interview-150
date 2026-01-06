// User function Template for Java

class Solution {
    String removeDuplicates(String s) {
        Set<Character> ch = new HashSet<>();
        StringBuilder s1= new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(!ch.contains(c)){
                ch.add(c);
                s1.append(c);
            }
        }
        return s1.toString();
    }
}
