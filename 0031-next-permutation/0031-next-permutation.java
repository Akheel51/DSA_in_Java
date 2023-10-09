class Solution {
    public void nextPermutation(int[] a) {
        int idx=-1,n=a.length;
        for(int i=n-2;i>=0;i--){
            if(a[i]<a[i+1]){
                idx=i;
                break;
            }
        }
        if(idx==-1){
            int j=a.length-1;
            for(int i=0;i<a.length/2;i++){
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
                j--;
            }
        }
        else{
            for(int i=n-1;i>=idx;i--){
                if(a[i]>a[idx]){
                    int t=a[i];
                    a[i]=a[idx];
                    a[idx]=t;
                    break;
                }
            } 
            Arrays.sort(a,idx+1,n);
        }
    }
}