public record StudentRecord(int id, String name) implements StudentRecordImpl{
    // * instance method
    public String nameToUpperCase(){
        return this.name.toUpperCase();
    }
    // * static methods
    public static String greeting(){
        return "Hello00!!!";
    }
    // *static fields
    public static String  STATIC_FIELD = "I am static field";
    // ! can NOT add instance fields

    @Override
    public String explainYourself() {
        return "I am a record, and records can implement interfaces";
    }
};