package felix.silva.bitwise;

public class NumberStepsReduceNumberToOne {
    public int numSteps(String s) {
        StringBuilder sb = new StringBuilder(s);
        int operationsCounter = 0;
        while (!sb.toString().equals("1")) {
            if (sb.charAt(sb.length() - 1) == '0') {
                divideByTwo(sb);
            } else {
                addOneToBinaryString(sb);
            }
            operationsCounter++;
        }
        return operationsCounter;
    }

    private void divideByTwo(StringBuilder sb) {
        sb.deleteCharAt(sb.length() - 1);
    }

    private void addOneToBinaryString(StringBuilder sb) {
        int carry = 1;
        for (int i = sb.length() - 1; i >= 0; i--) {
            char bit = sb.charAt(i);

            if (bit == '1' && carry == 1) {
                sb.setCharAt(i, '0');
            } else if (bit == '0' && carry == 1) {
                sb.setCharAt(i, '1');
                carry = 0;
                break;
            }
        }

        if (carry == 1) {
            sb.insert(0,'1');
        }
    }
}
