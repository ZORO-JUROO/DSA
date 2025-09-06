class Solution {
    public int[][] merge(int[][] arr) {
        int n=arr.length;
        if(n<2) return arr;
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> list=new ArrayList<>();
        int s=arr[0][0],e=arr[0][1];
        for(int i=1;i<n;i++)
        {
            if(arr[i][0]<=e)
            e=Math.max(arr[i][1],e);
            else
            {
                list.add(new int[]{s,e});
                s=arr[i][0];e=arr[i][1];
            }
        }
        list.add(new int[]{s,e});
        return list.toArray(new int[0][0]);
    }
}