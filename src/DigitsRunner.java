public class DigitsRunner {
    public static void main(String[] args) {
        Digits d1 = new Digits(15704);
        Digits d2 = new Digits(0);

        System.out.println(d1.getDigitList());
        System.out.println(d2.getDigitList());

        System.out.println(new Digits(7).isStrictlyIncreasing());
        System.out.println(new Digits(1356).isStrictlyIncreasing());
        System.out.println(new Digits(1336).isStrictlyIncreasing());
        System.out.println(new Digits(1536).isStrictlyIncreasing());
        System.out.println(new Digits(65310).isStrictlyIncreasing());
    }
}
