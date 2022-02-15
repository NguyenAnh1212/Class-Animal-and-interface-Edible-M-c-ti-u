package fruit;

public class Main {
    public static void main(String[] args) {
        // Tạo mảng các loại quả
        // Duyệt mảng để in ra cách ăn.
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit f: fruits) {
            System.out.println(f.howToEat());
        }
    }
}
