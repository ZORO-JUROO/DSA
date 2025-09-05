class Solution {
    public void nextPermutation(int[] arr) {
        int n=arr.length,i;
        //right se chalu kariyo aur chota ko compare karte ja left walo ke saath until u get arr[k]<arr[m],k<m aur swap karde isse tereko 0 to k ka shortest no. joh ki bada hai orginal arr se woh mil jayega..now now just sort k to n to get shortest no. in k to n. MAA KI ANKH BEATS 12 PERCENT HI AYA.
        int k=-1,a=-1,b=-1;
        outer: for(i=n-1;i>Math.max(0,k);i--)
        {

            for(int j=i-1;j>=Math.max(0,k);j--)
            if(arr[i]>arr[j] && j>k)
            {
                k=j;a=i;b=j;
                break;
            }
        }
        if(k!=-1){
                int t=arr[a];
                arr[a]=arr[b];
                arr[b]=t;}
        Arrays.sort(arr,k+1,n);
    }
}