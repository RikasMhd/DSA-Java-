public class FrequencyCount {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 3, 3, 4};
        boolean[] visited = new boolean[arr.length];

        System.out.println("Element : Frequency");
        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        visited[j] = true;
                    }
                }
                System.out.println(arr[i] + " : " + count);
            }
        }
    }
}