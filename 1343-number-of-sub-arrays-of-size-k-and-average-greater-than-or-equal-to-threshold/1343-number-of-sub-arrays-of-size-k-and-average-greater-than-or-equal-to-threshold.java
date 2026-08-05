class Solution {

    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int sum = 0;

        // First window
        for(int i = 0; i < k; i++){
            sum += arr[i];
        }

        int count = 0;

        if(sum >= threshold * k){
            count++;
        }

        // Slide window
        for(int i = k; i < arr.length; i++){

            sum = sum - arr[i-k] + arr[i];

            if(sum >= threshold * k){
                count++;
            }
        }

        return count;
    }
}