class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int pc=0,l=g.length;
        Arrays.sort(g);
        Arrays.sort(s);
        for(int i:s)
        {
            if(i>=g[pc])
            {
                pc++;
                if(pc==l)
                break;
            }
        }
        return pc;
    }
}