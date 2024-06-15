class Project {
    int p, c;
    Project(int p, int c) {
        this.p = p;
        this.c = c;
    }
}
class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        PriorityQueue<Project> pq = new PriorityQueue<>((o1, o2) -> {
            if (o1.c == o2.c) return o1.p - o2.p;
            return o1.c - o2.c;
        });
        int N = profits.length;
        
        for (int i = 0; i < N; i++) {
            pq.offer(new Project(profits[i], capital[i]));
        }

        // while (!pq.isEmpty()) {
        //     Project pj = pq.poll();
        //     System.out.println(pj.p + " " + pj.c);
        // }

        PriorityQueue<Prject> project_q = new PriorityQueue<>((o1, o2) -> {
            return o2.p - o1.p;
        });
        for (int i = 0; i < k; i++) {
            while (!pq.isEmpty()) {
                if (pq.peek().c <= w) project_q.offer(pq.poll());
                else break;
            }
            if (q.isEmpty()) break;
            w += q.poll().p;
            System.out.println(i + " " + w);
        }
        return w;
    }
}