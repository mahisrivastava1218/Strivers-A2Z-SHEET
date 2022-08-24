//User function Template for Java
class Solution {
    static String armstrongNumber(int n){
        int res=n;
        int ok=0;
        int temp=n;
        while(res!=0){
            ok++;
            res/=10;
        }
        int rem=0;
        int sumofpower=0;
        while(n>0){
            rem=n%10;
            sumofpower += Math.pow(rem,ok);
            n=n/10;
        }
        if(sumofpower==temp) return "Yes";
        else return "No";
    }
}
