package string

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CompareVersionNumbersTest {

    val solution: CompareVersionNumbers = CompareVersionNumbers()

    @Test
    fun testSolution() {
        val answer = solution.compareVersion("1.01", "1.0001")
        assertEquals(0, answer)
    }

    @Test
    fun testSolution1() {
        val answer = solution.compareVersion("1.0", "1.0.0")
        assertEquals(0, answer)
    }

    @Test
    fun testSolution2() {
        val answer = solution.compareVersion("0.1", "1.1")
        assertEquals(-1, answer)
    }

    @Test
    fun testSolution3() {
        val answer = solution.compareVersion("0.0.1", "1.1")
        assertEquals(-1, answer)
    }

    @Test
    fun testSolution4() {
        val answer = solution.compareVersion("3.0.4.10", "3.0.4.2")
        assertEquals(1, answer)
    }
}