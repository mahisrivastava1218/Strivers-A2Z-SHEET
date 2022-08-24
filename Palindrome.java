class Solution
{
    public String is_palindrome(int n)
    {
        if(n==0){
            return "Yes";
        }
        int temp=n;
        int ans=0;
        while(n>0){
            int rem=n%10;
            ans=rem+ans*10;
            n=n/10;
        }
        if(ans==temp){
            return "Yes";
        }else{
            return "No";
        }
    }
}
