# Generics in Java 

-parameterized types
Idea - user-defined types to be used in methods, classes, and interfaces.
The entity (method, class, interface) that operates on a parameterized type is a GENERIC TYPE.

Object class is a superclass to every class and object reference can be referred to any object!
LACK TYPE SAFTY
Solution- Generics.
___

**Generic methods**
has type parameterized that are cited by actual type
allows generics to be used in a more generic way

**example:**
```
    public class GenericsMethod{
        public static <T> void methodName(T obj){
		    // method code
        }
    }
GenericsMethod.methodname(“hello”);
GenericsMethod.methodname(11);
GenericsMethod.methodname(11.11);
```

The generic method allows us to pass any data type into a method call.
___

**Generic classes- Parameterized types**

A generic class is implemented exactly the same as a non-generic class. The only difference is that it contains a type parameter section. There can be more than one parameter separated with a comma. 
The parameter passed when creating an instance of a parameterized class can’t be primitive type (int, char, double, long,..)

*example:*
```
public class GenericClass<T, U>{

    T fieldOne;
    U fieldTwo;

    public GenericClass(T fieldOne, U fieldTwo){
        this.fieldOne = fieldOne;
        this.fieldTwo = fieldTwo;
    }

}
<!-- in Main.class -->
GenericClass<String, Object> obj = new GenericClass<String,Object>("Prvo", "Drugo");

```



