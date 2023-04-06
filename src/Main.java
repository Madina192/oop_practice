public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("circle", 30);
        Square square = new Square("square", 5);
        Triangle triangle = new Triangle("triangle", 10, 8, 9);
        Rectangle rectangle = new Rectangle("rectangle", 7, 6);

        Cat cat = new Cat("Kitty");
        Dog dog = new Dog("Max");

        Drawable[] drawables = {circle, square, triangle, rectangle, cat, dog};
        for (int i = 0; i < drawables.length; i++) {
            if(drawables[i] instanceof Figure){
                System.out.println(((Figure) drawables[i]).getName() + " Perimeter: "
                        + ((Figure) drawables[i]).calculatePerimeter());
            }
            if(drawables[i] instanceof Animal) {
                System.out.println(((Animal) drawables[i]).getName());
                ((Animal) drawables[i]).callSound();
            }
            drawables[i].draw();
        }

        for (Drawable drawable : drawables) {
            drawable.draw();
        }

    }
}