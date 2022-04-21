public class  Animal{
    private String species;
    private String familia;
    private String name;
    private int age;

    public Animal(String species, String familia, String name, int age){
        this.name = name;
        this.species = species;
        this.familia = familia;
        this.age = age;
    }

    public Animal(Animal source){
        this.name = source.name;
        this.species = source.species;
        this.familia = source.familia;
        this.age = source.age;
    }

    public void voice(){
        System.out.println("Animal says: something");
    };
    // *GETTERS
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFamilia() {
        return familia;
    }

    public String getSpecies() {
        return species;
    }

    // * SETTERS
    public void setAge(int age) {
        this.age = age;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setSpecies(String species) {
        this.species = species;
    }
}