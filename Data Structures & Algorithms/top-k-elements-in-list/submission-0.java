class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        int[] count = new int[n];
        boolean[] visited = new boolean[n];

        // count frequency of each number
        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;
            int c = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] == nums[i]) {
                    c++;
                }
            }
            count[i] = c;
            visited[i] = true;
        }

        // pair each number with its frequency, avoiding duplicates
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) indices[i] = i;

        Arrays.sort(indices, (a, b) -> count[b] - count[a]);

        int[] result = new int[k];
        boolean[] used = new boolean[2001 + 100000]; // adjust based on constraints, or use a Set
        Set<Integer> seen = new HashSet<>();
        int idx = 0;
        for (int i = 0; i < n && idx < k; i++) {
            int num = nums[indices[i]];
            if (!seen.contains(num)) {
                result[idx++] = num;
                seen.add(num);
            }
        }

        return result;
    }
}