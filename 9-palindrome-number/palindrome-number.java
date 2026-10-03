class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        long a=x;
        int n=0;
        while(a!=0){
            a=(long)a/10;
            n++;
        }
        a=x;
        long b=0;
        while(n!=0){
            b+=(long)a%10*Math.pow(10,n-1);
            a=(long)a/10;
            n--;
        }
      
        return x==b;
    }
}