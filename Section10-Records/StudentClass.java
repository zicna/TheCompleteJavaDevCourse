import java.util.Objects;

class StudentClass{
    private final int id;
    private final String name;

    public StudentClass(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // public void setId(int id) {
    //     this.id = id;
    // }

    // public void setName(String name) {
    //     this.name = name;
    // }

    @Override
    public String toString() {
       return "StudentClass(name= " + this.getName() + "; id= " + this.getId() + ")";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(!(obj instanceof StudentClass)) return false;

        StudentClass std = (StudentClass) obj;

        if(!(std.getName().equals(this.getName()) && std.getId() == this.getId())) return false;
        return true;
    }

}