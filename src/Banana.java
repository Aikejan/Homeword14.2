public class Banana {
    private String vitavin;

    public Banana(String vitavin) {
        this.vitavin = vitavin;
    }

    public String getVitavin() {
        return vitavin;
    }

    public void setVitavin(String vitavin) {
        this.vitavin = vitavin;
    }

    @Override
    public String toString() {
        return "Banana{" +
                "vitavin='" + vitavin + '\'' +
                '}';
    }
}
