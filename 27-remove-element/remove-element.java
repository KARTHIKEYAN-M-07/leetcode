class Solution {
    public int removeElement(int[] arr, int val) {
    int count=0;
    int ptr=0;
    int n=arr.length;
    for(int i=0;i<n;i++){
      if(arr[i]!=val && i==ptr){
        ptr++;
        count++;
      }
      else if(arr[i]!=val && i!=ptr){
        arr[ptr]=arr[i];
        arr[i]=val;
        ptr++;
        count++;
      }
    }
    return count;
    }
}