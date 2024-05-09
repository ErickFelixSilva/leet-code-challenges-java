package felix.silva.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximizeHappinessSelectedChildrenTest {

    MaximizeHappinessSelectedChildren solution = new MaximizeHappinessSelectedChildren();

    @Test
    public void testSolution() {
        var answer = solution.maximumHappinessSum(new int[] {1,2,3}, 2);
        assertEquals(4, answer);
    }

    @Test
    public void testSolution1() {
        var answer = solution.maximumHappinessSum(new int[] {1,1,1,1}, 2);
        assertEquals(1, answer);
    }

    @Test
    public void testSolution2() {
        var answer = solution.maximumHappinessSum(new int[] {2,3,4,5}, 1);
        assertEquals(5, answer);
    }

    @Test
    public void testSolution3() {
        var answer = solution.maximumHappinessSum(new int[] {12,1,42}, 3);
        assertEquals(53, answer);
    }

    @Test
    public void testSolution4() {
        var answer = solution.maximumHappinessSum(new int[] {2135218,73431904,92495076,77528042,82824634,3036629,
                28375907,65220365,40948869,58914871,57169530,89783499,19582915,19676695,11932465,21770144,49740276,
                22303751,80746555,97391584,95775653,43396943,47271136,43935930,59643137,64183008,8892641,39587569,
                85086654,5663585,82925096,24868817,95900395,48155864,74447380,7618448,63299623,91141186,33347112,
                81951555,52867615,92184410,7024265,85525916,29846922,59532692,47267934,6514603,1137830,97807470}, 41);
        assertEquals(2517853814L, answer);
    }
}
