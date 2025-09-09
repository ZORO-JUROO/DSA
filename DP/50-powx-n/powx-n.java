class Solution {
    double mm(double x,int n)
    {
         if(n==0) return 1;
        if(n%2==0)
        {double k=mm(x,n/2); return k*k;}
        else
        {
            return x * mm(x,n-1);
        }
    }
    public double myPow(double x, int n) {
       if(n<0){ if(n==Integer.MIN_VALUE) return 1/(x*mm(x,Integer.MAX_VALUE)); else
       return 1/mm(x,-n);}
       else
       return mm(x,n);
    }
}