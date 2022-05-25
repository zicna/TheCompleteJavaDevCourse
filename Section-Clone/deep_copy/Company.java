package deep_copy;

public class Company implements Cloneable{
    private String name;
    private int founded;

    public Company(String name, int founded){
        this.name = name;
        this.founded = founded;
    }

    public Company(Company source){
        this.name = source.name;
        this.founded = source.founded;
    }

    public int getFounded() {
        return founded;
    }

    public String getName() {
        return name;
    }

    public void setFounded(int founded) {
        this.founded = founded;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    
}