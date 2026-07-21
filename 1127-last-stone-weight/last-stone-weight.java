class Solution {
    public int lastStoneWeight(int[] stones) {
        int len = stones.length;
        PriorityQueue<Integer> mHeap = new PriorityQueue<>();
        for (int num : stones) {
            mHeap.offer(-num);
        }
        while(mHeap.size() > 1){
            int one = mHeap.poll();
            int two = mHeap.poll();
            if(two > one){
                mHeap.add(one - two);
            }
        }
        mHeap.add(0);
        return Math.abs(mHeap.peek());
    }
}