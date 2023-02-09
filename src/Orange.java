public class Orange extends Fruits {
    private String sort;
    private String color;
    private Banana banana;

    public Orange(double gramm, String type, String sort, String color, Banana banana) {
        super(gramm, type);
        this.sort = sort;
        this.color = color;
        this.banana = banana;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Banana getBanana() {
        return banana;
    }

    public void setBanana(Banana banana) {
        this.banana = banana;
    }

    @Override
    public String toString() {
        return
                "Gramm: " + getGramm() + "\n" +
                        "type: " + getType() + "\n" +
                        "sort: '" + sort + "\n" +
                        " color: " + color + "\n" +
                        "banana: " + banana;
    }
}
