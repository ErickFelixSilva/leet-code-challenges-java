package felix.silva.string;

public class MakeStringGreat {
    public String makeGood(String s) {
        var good = new StringBuilder(s);
        var stringGood = false;
        while(!stringGood) {
            stringGood = true;
            for (int i =0 ; i < good.length() - 1; i++) {
                char actualChar = good.charAt(i);
                char nextChar = good.charAt(i+1);

                if (actualChar != nextChar && Character.toLowerCase(actualChar) == nextChar ||
                    nextChar != actualChar && Character.toLowerCase(nextChar) == actualChar) {
                    good.deleteCharAt(i+1);
                    good.deleteCharAt(i);
                    stringGood = false;
                    break;
                }
            }
        }

        return good.toString();
    }
}
