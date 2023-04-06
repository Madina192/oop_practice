public abstract class Animal implements Drawable, SoundProducable{
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
