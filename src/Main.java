public class Main {
    public static void main(String[] args) {
    Banana banana = new Banana("A,B,C");
    Orange orange = new Orange(20.5," Thin skineed"," Sukkari","Orang",banana);
        System.out.println(orange);
        System.out.println("±±±±±±±±±±±±±±±±±±±");
        Apple apple = new Apple(50.7,"Frukty","Prevoshod","Green",banana);
        System.out.println(apple);
    }
}