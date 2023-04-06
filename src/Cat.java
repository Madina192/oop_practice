public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDC08");
    }

    @Override
    public void callSound() {
        System.out.println("meow-meow");
    }
}
