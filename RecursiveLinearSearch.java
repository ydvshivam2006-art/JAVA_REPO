public class RecursiveLinearSearch {
    public static int search(int[] arr, int target, int index) {
        if (index >= arr.length) return -1;
        if (arr[index] == target) return index;
        return search(arr, target, index + 1);
    }

    public static void main(String[] args) {
        int[] data = {5, 12, 8, 24, 18};
        int target = 24;
        int result = search(data, target, 0);
        System.out.println(result != -1 ? "Element found at index: " + result : "Element not found");
    }
}