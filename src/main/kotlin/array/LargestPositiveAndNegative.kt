package array

import kotlin.math.abs

class LargestPositiveAndNegative {
    fun findMaxK(nums: IntArray): Int {
        val numsMap: MutableMap<Int, Int> = mutableMapOf()
        val opposingValues: MutableList<Int> = mutableListOf()
        for (num in nums) {
            numsMap[num] = num
            val opposingValue: Int? = if (num > 0) numsMap[-num] else numsMap[abs(num)]

            if (opposingValue != null && num + opposingValue == 0) {
                opposingValues.add(abs(num))
            }
        }

        return if (opposingValues.isEmpty()) -1 else opposingValues.max()
    }
}