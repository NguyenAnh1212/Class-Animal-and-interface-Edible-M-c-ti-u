package animal;

public class Main {
    public static void main(String[] args) {
        // Tạo mảng Animal gồm chicken và tiger
        // Duyệt mảng để nghe tiếng kêu của động vật
        // Nếu là chicken thì cho biết cách để ăn chicken.
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal a:animals) {
            System.out.println(a.makeSound());
            if (a instanceof Chicken){
                System.out.println(((Chicken) a).howToEat());
            }
        }
    }
}
