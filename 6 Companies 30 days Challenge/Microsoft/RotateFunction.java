class RotateFunction {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int S = 0;
        int D = 0;
        for (int i = 0; i < n; i++) {
            S += nums[i];
            D += i * nums[i];
        }
        int maxF = D;
        for (int k = 1; k < n; k++) {
            D = D + S - n * nums[n - k];
            maxF = Math.max(maxF, D);
        }
        return maxF;
    }
}
