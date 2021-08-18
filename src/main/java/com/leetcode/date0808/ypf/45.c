int jump(int* nums, int numsSize){
    int max_len = 0;
    int max_time = 0;
    int end = 0;

    for(int i = 0; i < numsSize - 1; ++i) {
        if (max_len < i + nums[i]) {
            max_len = i + nums[i];

        }
        if (end == i) {
            end = max_len;
            max_time++;
        }

    }
    return max_time;
}
