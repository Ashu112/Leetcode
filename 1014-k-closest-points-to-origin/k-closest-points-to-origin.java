class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] ans = new int[k][2];
        PriorityQueue<int[]> distIndex = new PriorityQueue<>((a, b) -> Integer.compare(b[0] * b[0] + b[1] * b[1], a[0] * a[0] + a[1] * a[1]));

        for(int i = 0 ; i < k ;i++){
           distIndex.offer(points[i]);
        }

        for (int i = k; i < points.length; i++) {
        int[] point = points[i]; // point is now an array [x, y]
        int dist = point[0] * point[0] + point[1] * point[1]; // Squared distance of current point
        int[] top = distIndex.peek();
        int topDist = top[0] * top[0] + top[1] * top[1]; // Squared distance of the farthest point in the max-heap

        // If current point is closer than the farthest point in the heap, replace it
        if (dist < topDist) {
            distIndex.poll();
            distIndex.offer(point);
        }
    }

        int idx = 0 ; 
         while (!distIndex.isEmpty()) {
        ans[idx++] = distIndex.poll();
    }
        return ans;
    }
}