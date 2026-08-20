class Solution {
    public int findContentChildren(int[] s, int[] c) {
        Arrays.sort(s);
        Arrays.sort(c);
        int i=0,j=0;
        int count=0;
        while(j<c.length){
            if(i<s.length && j<c.length &&c[j]>=s[i] ){
                count++;
                i++;
            }
            j++;
        }
        return count;
    }
}