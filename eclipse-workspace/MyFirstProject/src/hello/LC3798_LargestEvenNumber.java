package hello;

public class LC3798_LargestEvenNumber {

    public static String largestEven(String s) {
        int last2Index = -1;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '2') {
                last2Index = i;
                break;
            }
        }

        if (last2Index == -1) return "";
        return s.substring(0, last2Index + 1);
    }
}
