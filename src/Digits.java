import java.util.ArrayList;

public class Digits {
    private ArrayList<Integer> digitList;

    public Digits(int num) {
        digitList = new ArrayList<Integer>();
        digitList.add(0, num % 10);
        for (int n = num / 10; n > 0; n = n / 10) {
            digitList.add(0, n % 10);
        }
    }

    public boolean isStrictlyIncreasing() {
        int lastNum = digitList.get(0);
        for (int i = 1; i < digitList.size(); i++) {
            if (digitList.get(i) <= lastNum) {
                return false;
            }
            lastNum = digitList.get(i);
        }
        return true;
    }

    public ArrayList<Integer> getDigitList() {
        return digitList;
    }
}
