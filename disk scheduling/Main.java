import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] requests = {98, 183, 37, 122, 14, 124, 65, 67};
        int head = 53;
        FCFS.schedule(Arrays.copyOf(requests, requests.length), head);
        System.out.println();
        SSTF.schedule(Arrays.copyOf(requests, requests.length), head);
    }
}
