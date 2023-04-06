public  class Circle extends Figure{

    private int r;

    public Circle(String name, int r) {
        super(name);
        this.r = r;
    }

    @Override
    public int calculatePerimeter() {
        return (int) (2 * Math.PI + r);
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDD34");
    }
}
