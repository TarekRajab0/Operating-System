import java.util.*;
public class PageReplacement {
    public static void FIFOPR(int[] pages, int frames) {
        Queue<Integer> memory = new LinkedList<>();
        int page_faults = 0;
        for (int page : pages) {
            if (!memory.contains(page)) {
                if (memory.size() == frames) {
                    memory.poll();
                }
                memory.add(page);
                page_faults++;
            }
            System.out.println("Memory: " + memory);
        }
        System.out.println("Total page faults: " + page_faults);
    }
        public static void main(String[] args) {
        System.out.println("Page Replacment using FIFO");
        int[] pages = {1, 3, 0, 3, 5, 6, 3};
        int capacity = 3;
        FIFOPR(pages, capacity);
        System.out.println("Page Replacment using LRU");
        
    }
}
