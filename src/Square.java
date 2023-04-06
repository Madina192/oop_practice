public class Square extends Figure{

    public int side;

    public Square(String name, int side) {
        super(name);
        this.side = side;
    }

    @Override
    public int calculatePerimeter() {
        return 4 * side;
    }

    @Override
    public void draw() {
        System.out.println("⬜");
    }
}
