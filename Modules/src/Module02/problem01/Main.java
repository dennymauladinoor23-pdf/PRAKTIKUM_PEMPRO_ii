package Module02.problem01;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Fruit apel = new Fruit ("apel", 0.4, 7000.0, 40.0);
        Fruit mangga = new Fruit("mangga", 0.2,3500.0, 15.0);
        Fruit alpukat =new Fruit("alpukat", 0.25, 10000.0,12.0);

        apel.printInfo();
        mangga.printInfo();
        alpukat.printInfo();
    }
}
