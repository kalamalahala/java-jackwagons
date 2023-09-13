package jackwagons.app.tennis.racket;

public class RacketGrip implements RacketGripInterface {

    private int gripSize;
    private String gripType;
    private String gripColor;
    private String gripManufacturer;
    private String overgripType;
    private String overgripColor;
    private String overgripManufacturer;

    public RacketGrip() {
    }

    public int getGripSize() {
        return gripSize;
    }

    public void setGripSize(int gripSize) {
        this.gripSize = gripSize;
    }

    public String getGripType() {
        return gripType;
    }

    public void setGripType(String gripType) {
        this.gripType = gripType;
    }

    public String getGripColor() {
        return gripColor;
    }

    public void setGripColor(String gripColor) {
        this.gripColor = gripColor;
    }

    public String getGripManufacturer() {
        return gripManufacturer;
    }

    public void setGripManufacturer(String gripManufacturer) {
        this.gripManufacturer = gripManufacturer;
    }

    public String getOvergripType() {
        return overgripType;
    }

    public void setOvergripType(String overgripType) {
        this.overgripType = overgripType;
    }

    public String getOvergripColor() {
        return overgripColor;
    }

    public void setOvergripColor(String overgripColor) {
        this.overgripColor = overgripColor;
    }

    public String getOvergripManufacturer() {
        return overgripManufacturer;
    }

    public void setOvergripManufacturer(String overgripManufacturer) {
        this.overgripManufacturer = overgripManufacturer;
    }
}
