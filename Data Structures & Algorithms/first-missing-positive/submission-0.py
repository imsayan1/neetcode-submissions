class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        n = len(nums)
        curr = 0
        for i in range(n):
            curr = nums[i]
            while curr > 0 and curr <= n and curr != nums[curr - 1]:
                temp = nums[curr - 1]
                nums[curr - 1] = curr
                curr = temp
        res = 1
        for i in range(n):
            if nums[i] == res:
                res += 1
            else:
                break
        return res
