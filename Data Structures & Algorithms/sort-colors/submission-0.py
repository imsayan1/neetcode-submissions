class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        counts = [0, 1, 2]
        freq_count = [0, 0, 0]
        for i in range(len(nums)):
            freq_count[counts[nums[i]]] += 1
        
        i = 0
        for j in range(len(counts)):
            for _ in range(freq_count[j]):
                nums[i] = counts[j]
                i += 1