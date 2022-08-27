class Solution {
    int isPalindrome(String S) {
        // code here
        int c=S.length()-1;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)!=S.charAt(c)){
                return 0;
            }
            c--;
        }
        return 1;
    }
};
