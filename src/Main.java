import tasks.RomanToInteger13;

public class Main {

    public static void main(String[] args) {
        submit("MDCCCLXXXIV");
        /*submit("III");
        submit("IX");
        submit("LVIII");
        submit("MCMXCIV");*/
    }

    private static void submit(final String number) {
        System.out.println(new RomanToInteger13().submit(number));

    }
}