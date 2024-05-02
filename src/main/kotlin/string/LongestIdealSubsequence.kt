package string

import kotlin.math.max
import kotlin.math.min

class LongestIdealSubsequence {
    fun longestIdealString(s: String, k: Int): Int {
        if (k == 25) return s.length

        val idealStringsSizes: MutableList<Int> = mutableListOf()
        val charactersMap: MutableMap<Char, Int> = mutableMapOf()

        for (i in s.indices) {
            var currentMax = (charactersMap[s[i]] ?: 0) + 1
            var start = max((s[i] - k).code,  97).toChar()
            val end = min((s[i] + k).code, 122).toChar()
            while (start <= end) {
                charactersMap[start] = max(currentMax, (charactersMap[start] ?: 0))
                start++
            }

            idealStringsSizes.add(currentMax)
        }
        return idealStringsSizes.max()
    }
}