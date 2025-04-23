public class FCFS {
    public static void schedule(int[] requests, int head) {
        int total = 0;
        System.out.println("FCFS Order:");
        System.out.print(head);
        for (int i = 0; i < requests.length; i++) {
            total += Math.abs(requests[i] - head);
            head = requests[i];
            System.out.print(" -> " + head);
        }
        System.out.println("\nTotal head movement: " + total);
    }
}
