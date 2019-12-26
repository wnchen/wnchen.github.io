package com.example.kclosestpoints;

import java.util.PriorityQueue;

public class KClosestPoints {

    public int[][] kClosest(int[][] points, int K) {
        if (points == null || points.length <= K) return points;
        PriorityQueue<int[]> pq = new PriorityQueue<>(K, (p1, p2) -> p2[0] * p2[0] + p2[1] * p2[1] - p1[0] * p1[0] - p1[1] * p1[1]);
        for (int[] point : points) {
            pq.offer(point);
            if (pq.size() > K) {
                pq.poll();
            }
        }
        int[][] res = new int[K][2];
        for (int i = 0; i < K; i++) {
            res[i] = pq.poll();
        }
        return res;
    }
}
