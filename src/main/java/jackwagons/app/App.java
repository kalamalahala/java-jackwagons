package jackwagons.app;

import jackwagons.app.tennis.racket.Racket;
import jackwagons.app.tennis.racket.RacketGrip;
import jackwagons.app.tennis.racket.RacketStrings;

public class App {
    public static void main(String[] args) {
        Racket testRacket = buildTestRacket();
        System.out.println(testRacket.toString());
    }

    public static Racket buildTestRacket() {
        Racket testRacket = new Racket();
        RacketGrip testRacketGrip = new RacketGrip();
        RacketStrings testRacketStrings = new RacketStrings();

        testRacket.setMake("Wilson");
        testRacket.setModel("Clash 98 V2");
        testRacket.setHeadSize(98);
        testRacket.setBalance(32);
        testRacket.setCrossSection(24);
        testRacket.setLength(27);
        testRacket.setPattern("16x19");
        testRacket.setStiffness(55);
        testRacket.setPointHeadLight(4);
        testRacket.setSwingWeight(312);
        testRacket.setGramWeight(310);

        testRacketGrip.setGripType("Leather");
        testRacketGrip.setGripSize(4);
        testRacketGrip.setGripColor("Brown");
        testRacketGrip.setGripManufacturer("Babolat");
        testRacketGrip.setOvergripType("Tourna Grip");
        testRacketGrip.setOvergripColor("Light Blue");
        testRacketGrip.setOvergripManufacturer("Tourna");

        testRacketStrings.setMainStringMaterial("Polyester");
        testRacketStrings.setMainStringGauge("16L");
        testRacketStrings.setMainStringTension(50);
        testRacketStrings.setMainStringManufacturer("Luxilon");
        testRacketStrings.setCrossStringMaterial("Polyester");
        testRacketStrings.setCrossStringGauge("16L");
        testRacketStrings.setCrossStringTension(50);
        testRacketStrings.setCrossStringManufacturer("Luxilon");

        testRacket.setRacketGrip(testRacketGrip);
        testRacket.setRacketStrings(testRacketStrings);

        return testRacket;
    }
}