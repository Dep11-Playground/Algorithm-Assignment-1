class Algo2 {
    public static void main(String[] args) {
        int[] nums = { -5, 2, 7, 10, 58, -7, 8, 23 };

        int smallet = nums[0];
        int largets = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (largets < nums[i]) {
                largets = nums[i];
            }

            if (smallet > nums[i]) {
                smallet = nums[i];
            }
        }
        System.out.println("Largets Number : " + largets);
        System.out.println("Smallest Number :" + smallet);
    }
}
