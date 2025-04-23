import java.util.*;

public class LRUPageReplacement {
    public static void main(String[] args) {
        int[] pages = {7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2, 3};
        int frames = 4;
        LinkedHashSet<Integer> Memory = new LinkedHashSet<>(frames);
        int page_faults = 0;
        for (int page : pages) {
            if (!Memory.contains(page)) {
                if (Memory.size() >= frames) {
                    Iterator<Integer> it = Memory.iterator();
                    Memory.remove(it.next());
                }
                page_faults++;
            } else {
                Memory.remove(page);
            }
            Memory.add(page);
            System.out.println(Memory);
        }
        System.out.println("Total page faults: " + page_faults);
    }
}
