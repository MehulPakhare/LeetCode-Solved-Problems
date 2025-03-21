class Solution {

    private void bubbleSort(int[] arr ){
        int n =arr.length;
        for(int i = 0; i < n-1; ++i){

            for(int j =0; j < n-i -1; ++j){

                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }
    public int heightChecker(int[] heights) {
        int[] temp = heights.clone();
        int n = heights.length;
        int count = 0;
        bubbleSort(temp);

        for(int i = 0; i < n; ++i){
            if(temp[i] != heights[i]){
                count++;
            }
        }

        return count; 
      
    }
}