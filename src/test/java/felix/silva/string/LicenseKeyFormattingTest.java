package felix.silva.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LicenseKeyFormattingTest {

    private final LicenseKeyFormatting solution = new LicenseKeyFormatting();

    @Test
    void testSolution() {
        var answer = solution.licenseKeyFormatting("5F3Z-2e-9-w", 4);
        assertEquals("5F3Z-2E9W", answer);
    }

    @Test
    void testSolution1() {
        var answer = solution.licenseKeyFormatting("2-5g-3-J", 2);
        assertEquals("2-5G-3J", answer);
    }

    @Test
    void testSolution2() {
        var answer = solution.licenseKeyFormatting("ahs-elah-sek-2-5g-3-J", 2);
        assertEquals("A-HS-EL-AH-SE-K2-5G-3J", answer);
    }
}
