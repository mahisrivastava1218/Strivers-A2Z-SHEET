class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder c= new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))){
                c.append(s.charAt(i));
            }
        }
        int n=c.length()-1;
        for(int i=0;i<c.length()/2;i++){
            if(c.charAt(i)!=c.charAt(n)){
                   return false;   
            }
            n--;
        }
        return true;
        
            
    }
}
