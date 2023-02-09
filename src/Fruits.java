public class Fruits {
    private  double gramm;
    private String type;

    public Fruits(double gramm, String type) {
        this.gramm = gramm;
        this.type = type;
    }

    public double getGramm() {
        return gramm;
    }

    public void setGramm(double gramm) {
        this.gramm = gramm;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "gramm=" + gramm +
                ", type='" + type + '\'' +
                '}';
    }
}
