package jackwagons.app.tennis.racket;

public class Racket implements RacketInterface {

    private String make;
    private String model;
    private int headSize;
    private int gramWeight;
    private int pointHeadLight;
    private int swingWeight;
    private int stiffness;
    private int balance;
    private int length;
    private int crossSection;
    private String pattern;
    private RacketGrip racketGrip;
    private RacketStringsInterface racketStrings;

    public Racket() {
    }

    public Racket(String make, String model, int headSize, RacketGrip racketGrip, RacketStringsInterface racketStrings) {
        this.make = make;
        this.model = model;
        this.headSize = headSize;
        this.racketGrip = racketGrip;
        this.racketStrings = racketStrings;
    }

    public int getGramWeight() {
        return gramWeight;
    }

    public void setGramWeight(int gramWeight) {
        this.gramWeight = gramWeight;
    }

    public int getPointHeadLight() {
        return pointHeadLight;
    }

    public void setPointHeadLight(int pointHeadLight) {
        this.pointHeadLight = pointHeadLight;
    }

    public int getSwingWeight() {
        return swingWeight;
    }

    public void setSwingWeight(int swingWeight) {
        this.swingWeight = swingWeight;
    }

    public int getStiffness() {
        return stiffness;
    }

    public void setStiffness(int stiffness) {
        this.stiffness = stiffness;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getCrossSection() {
        return crossSection;
    }

    public void setCrossSection(int crossSection) {
        this.crossSection = crossSection;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHeadSize() {
        return headSize;
    }

    public void setHeadSize(int headSize) {
        this.headSize = headSize;
    }

    public RacketGrip getRacketGrip() {
        return racketGrip;
    }

    public void setRacketGrip(RacketGrip racketGrip) {
        this.racketGrip = racketGrip;
    }

    public RacketStringsInterface getRacketStrings() {
        return racketStrings;
    }

    public void setRacketStrings(RacketStringsInterface racketStrings) {
        this.racketStrings = racketStrings;
    }
}
