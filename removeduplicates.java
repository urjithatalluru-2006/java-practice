import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 1, 5};

        Set<Integer> set = new LinkedHashSet<>(); // Keeps insertion order
        for (int num : numbers) {
            set.add(num);
        }

        // Convert back to array (optional)
        int[] uniqueNumbers = new int[set.size()];
        int i = 0;
        for (int num : set) {
            uniqueNumbers[i++] = num;
        }

        System.out.println("Array after removing duplicates:");
        for (int num : uniqueNumbers) {
            System.out.print(num + " ");
        }
    }
}
