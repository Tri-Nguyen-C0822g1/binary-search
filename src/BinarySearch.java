public class BinarySearch {
    static int[] lists = {1, 3, 5, 8, 9, 12, 14, 15};

    static int binarySearch(int[] lists, int key) {
        int low = 0;
        int high = lists.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < lists[mid])
                high = mid - 1;
            else if (key == lists[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(lists,5));
        System.out.println(binarySearch(lists,9));
        System.out.println(binarySearch(lists,8));
        System.out.println(binarySearch(lists,14));
        System.out.println(binarySearch(lists,15));
        System.out.println(binarySearch(lists,1));
    }
}