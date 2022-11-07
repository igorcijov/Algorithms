package lesson3_20220920;

// Padobie Recursii
// Builder (Stroiteli)

public class PaternProgramirovanie {
    String products = "";

    public static void main(String[] args) {
        PaternProgramirovanie test = new PaternProgramirovanie();
        test = test.withApple(test).withEggs(test).withMilk(test).withEggs(test).withEggs(test).withEggs(test);
        System.out.println(test.products);
    }

    private PaternProgramirovanie withApple(PaternProgramirovanie test) {
        test.products += "apple\n";
        return test;
    }

    private PaternProgramirovanie withMilk(PaternProgramirovanie test) {
        test.products += "milk\n";
        return test;
    }

    private PaternProgramirovanie withMeat(PaternProgramirovanie test) {
        test.products += "meat\n";
        return test;
    }

    private PaternProgramirovanie withEggs(PaternProgramirovanie test) {
        test.products += "eggs\n";
        return test;
    }
}
