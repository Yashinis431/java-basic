class Solution {
    public int trap(int[] height) {
        int res=0;
        int lb,rb,tw,wl;
        int n=height.length;
        for(int i=1;i<n-2;i++){
            lb=height[i];
            for(int j=0;j<i-1;j++){
                if(height[j]>lb){
                    lb=height[j];
                }
            }
            rb=height[i];
            for(int j=i+1;j<n-1;j++){
                if(height[i]>rb){
                    rb=height[i];
                }
            }
            wl=Math.min(lb,rb);
            tw=wl-height[i];
            res+=tw;
        }
    return res;
        
    }
}