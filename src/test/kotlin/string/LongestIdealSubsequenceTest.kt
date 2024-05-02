package string

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LongestIdealSubsequenceTest {

    val solution: LongestIdealSubsequence = LongestIdealSubsequence()

    @Test
    fun testSolution() {
        val answer = solution.longestIdealString("acfgbd", 2)
        assertEquals(4, answer)
    }

    @Test
    fun testSolution1() {
        val answer = solution.longestIdealString("abcd", 3)
        assertEquals(4, answer)
    }

    @Test
    fun testSolution2() {
        val answer = solution.longestIdealString("pvjcci", 4)
        assertEquals(2, answer)
    }

    @Test
    fun testSolution3() {
        val answer = solution.longestIdealString("eduktdb", 15)
        assertEquals(5, answer)
    }
}