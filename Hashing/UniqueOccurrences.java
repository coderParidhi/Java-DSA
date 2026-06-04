import java.util.*;

public class UniqueOccurrences {

    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        HashSet<Integer> seen = new HashSet<>();
        for (int freq : freqMap.values()) {
            if (!seen.add(freq)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean result = uniqueOccurrences(arr);
        System.out.println("Result: " + result);
        sc.close();
    }
}