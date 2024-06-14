class Solution:
    def minIncrementForUnique(self, nums: List[int]) -> int:
        answer = 0
        nums.sort()
        for i in range(1,len(nums)):
            if (nums[i] <= nums[i-1]):
                answer += nums[i-1]+1 - nums[i]
                nums[i] = nums[i-1]+1
        return answer
        

1122237
1234567
1234567