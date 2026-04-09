class Solution {
    public int[] replaceElements(int[] arr) {

        int k=-1;
        for(int i=0; i<arr.length-1; i++) {
            k = arr[i+1];
            for (int j=arr.length-1; j>i; j--) {
                if (k < arr[j] ) {
                    k = arr[j];
                }
            }
            arr[i] = k;
        }
        arr[arr.length-1] = -1;
        return arr;
        
    }
}