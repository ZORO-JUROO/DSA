class Solution {
    public List<Integer> majorityElement(int[] arr) {
        ArrayList<Integer> al=new ArrayList<>();
        int n=arr.length,a=Integer.MIN_VALUE,ac=0,b=Integer.MIN_VALUE,bc=0;
        int need=(int)Math.floor(n/3)+1;
        for(int i=0;i<n;i++)
        {
            if(ac==0 && arr[i]!=b)
            {ac=1;a=arr[i];}
            else if(bc==0 && arr[i]!=a)
            {bc=1;b=arr[i];}
            else if(arr[i]==a)
            ac++;
            else if(arr[i]==b)
            bc++;
            else
            {ac--;bc--;}
        }
        ac=0;bc=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==a) ac++;
            if(arr[i]==b) bc++;
        }
        if(ac>=need) al.add(a);
        if(bc>=need) al.add(b);
        return al;
    }
}