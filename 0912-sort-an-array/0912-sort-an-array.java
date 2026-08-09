class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    void mergeSort(int []arr,int low,int high){
        if(low>=high){
            return;
        }
        int mid=low+(high-low)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    void merge(int arr[],int l,int m,int h){
        int temp[]=new int[h-l+1];
        int i=l;
        int j=m+1;
        int k=0;
        while(i<=m && j<=h){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        
    
    while(i<=m){
        temp[k]=arr[i];
        i++;
        k++;
    }
    while(j<=h){
        temp[k]=arr[j];
        j++;
        k++;
    }
    for(int a=l;a<=h;a++){
        arr[a]=temp[a-l];
    }
    }
}