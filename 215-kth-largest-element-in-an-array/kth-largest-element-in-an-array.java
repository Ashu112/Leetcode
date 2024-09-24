class Solution {
    public int findKthLargest(int[] nums, int k) {
        // 1. create a pq of k elements
        // 2. for each remaining elements in array
        //      i. check if current element is greater than pq top 
        //          a. if yes replace the current element with the top element
        // 3. return the top element of pq.
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i = 0; i < k ; i++){
            minHeap.add(nums[i]);
        }

        for(int j = k ; j < nums.length;j++){
            int curr = nums[j];
            int top = minHeap.peek();
            if(curr > top){
                minHeap.poll();
                minHeap.add(curr);
            }
        }
        return minHeap.peek();
    }
}