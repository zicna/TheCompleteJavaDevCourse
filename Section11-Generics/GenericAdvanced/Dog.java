public class Dog extends Animal{
    public Dog(String species, String familia, String name, int age){
        super(species, familia, name, age);
    }

    @Override
    public void voice(String sound) {
        super.voice(sound);

        System.out.println("Dog says: " + sound);
    }
}