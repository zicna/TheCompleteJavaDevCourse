package GenericClass;

public class GenericClass<T, U>{

    T fieldOne;
    U fieldTwo;

    public GenericClass(T fieldOne, U fieldTwo){
        this.fieldOne = fieldOne;
        this.fieldTwo = fieldTwo;
    }

}