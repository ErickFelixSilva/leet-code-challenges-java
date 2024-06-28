package felix.silva.string;

public class LicenseKeyFormatting {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder result = new StringBuilder();
        int counter = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            char actualChar = s.charAt(i);
            if (actualChar != '-') {
                if (counter > 0 && counter % k == 0) {
                    result.append('-');
                }
                result.append(Character.toUpperCase(actualChar));
                counter++;
            }
        }

        return result.reverse().toString();
    }
}
