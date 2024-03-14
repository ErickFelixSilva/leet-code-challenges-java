package felix.silva.string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomSortStringTest {

    @Test
    public void testSolution() {
        CustomSortString solution = new CustomSortString();
        var answer = "";
        answer = solution.customSortString("cba", "aabbcd");
        assertEquals(answer, "cbbaad");

        answer = solution.customSortString("bcafg", "abcd");
        assertEquals(answer, "bcad");

        answer = solution.customSortString("jdioypvznrsexfchb", "cjtpnleyimhytcjwwtjkrixnvzmzmrbsonxuzynmgwzvzlxinjzrxfrwsaytbmlbalxmqbdxkcrqtaulemxdjtkeovxpludxrqjctggsokamzcxctyvdfqdnstfefpxljsvpxhohasehwbmpkdfgcibsgtfkrhsppvylmcrnqpanrwijebftjgvamntpscuprobvhbib");
        assertEquals(answer, "jjjjjjjjjddddddiiiiiioooooyyyyyyppppppppppvvvvvvvvzzzzzzznnnnnnnnnrrrrrrrrrrssssssssseeeeeexxxxxxxxxxxxfffffffccccccccchhhhhhbbbbbbbbbbaaaaaaaggggggkkkkkkllllllllmmmmmmmmmmmqqqqqttttttttttttuuuuwwwwww");
    }
}