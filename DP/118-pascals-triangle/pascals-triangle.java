class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> list=new ArrayList<>();
        list.add(Arrays.asList(1));
        if(n==1) return list;
        int k=2;
        List<Integer> ref=list.get(0);
        while(k<=n)
        {
            List<Integer> l=new ArrayList<Integer>();
            for(int i=0;i<ref.size()-1;i++)
            {
                l.add(ref.get(i)+ref.get(i+1));
            }
            l.add(0,1);
            l.add(1);
            list.add(l);
            ref=l;k++;
        }
        return list;
    }
}