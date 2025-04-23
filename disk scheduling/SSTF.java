public class SSTF {
    public static void schedule(int[] requests, int head) {
        int total = 0;
        boolean[] visited = new boolean[requests.length];
        int completed = 0;
        System.out.println("SSTF Order:");
        System.out.print(head);
        while (completed < requests.length) {
            int idx = -1, min = Integer.MAX_VALUE;
            for (int i = 0; i < requests.length; i++) {
                if (!visited[i] && Math.abs(requests[i] - head) < min) {
                    min = Math.abs(requests[i] - head);
                    idx = i;
                }
            }
            total += Math.abs(requests[idx] - head);
            head = requests[idx];
            visited[idx] = true;
            completed++;
            System.out.print(" -> " + head);
        }
        System.out.println("\nTotal head movement: " + total);
    }
}
