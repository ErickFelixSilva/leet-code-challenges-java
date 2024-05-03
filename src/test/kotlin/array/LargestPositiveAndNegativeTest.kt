package array

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LargestPositiveAndNegativeTest {

    val solution = LargestPositiveAndNegative()
    @Test
    fun testSolution() {
        val answer = solution.findMaxK(intArrayOf(-1,2,-3,3))
        assertEquals(3, answer)
    }

    @Test
    fun testSolution1() {
        val answer = solution.findMaxK(intArrayOf(-1,10,6,7,-7,1))
        assertEquals(7, answer)
    }

    @Test
    fun testSolution2() {
        val answer = solution.findMaxK(intArrayOf(-10,8,6,7,-2,-3))
        assertEquals(-1, answer)
    }
}