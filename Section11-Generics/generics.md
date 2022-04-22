# Generics in Java 

parameterized types

<span style="color:green"> Idea => </span>  user-defined types to be used in methods, classes, and interfaces.

The entity (method, class, interface) that operates on a parameterized type is a GENERIC TYPE.

Object class is a superclass to every class and object reference can be referred to any object!
LACK TYPE SAFTY
Solution- Generics.
___

## Generic methods
has type parameterized that are cited by actual type
allows generics to be used in a more generic way

**example:**
```java
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

*example*
```
<T> T[] methodName (T[] a);
```
- `<T>` - type of parameter will be defined at compile time
- `T[]` - method returns parameterized type
- `(T[] a)` - argument of method iz field parameterizzed type
___

## Generic classes- Parameterized types

A generic class is implemented exactly the same as a non-generic class.
The only difference is that it contains a type parameter section. There can be more than one parameter separated by commas. 

The parameter passed when creating an instance of a parameterized class can’t be primitive type (int, char, double, long,..) instead just use wrapper class(Integer, Double,...).

**Syntax:**

The class declaration is the same only after class name and before curly braces we add:
1. <span style="color:green"> < > </span> - angled brackets => diamond 
2. <span style="color:green"> type parameter </span> - add inside the diamond
3. <span style="color:green"> T </span> - it is a convention to use the upper letter T

- T defines to the compiler that this Java class can use certain data types
- T is unknown at the compile time
- T gets data type once we create instance of a class
- convenctions: 
  1. `<T>` - type
  2. `<E>` - element
  3. `<K>` - key
  4. `<V>` - value




*example:*
```java
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

___
## Generics in Collections

**raw collections:**

```java 
ArrayList cats = new ArrayList<>();
```

*we get new ArrayList named cats without specifying class type it will store*

One way we can do this is just create ArrayList that  stores Objects:

```java
ArrayList <Objects> cats = new ArrayList<Objects>();
```

this is not **type safe**

Here is why:
```java
cats.add(new Cat());
Cat myCat = cats.get(0); //=> warning
Cat myCat = (Cat)cats.get(0); //=> here we type cast it

cats.add(new Dog());
Cat myCat2 = (Cat)cats.get(1); 
//=> error, we can’t type cast Dog into Cat object
```
Solution: 

```java 
ArrayList <Cats> cats = new ArrayList<Cats>();
```
*new ArrayList named cats now can store only Cat type classes*

___

## Bounded Generics

We are giving certain bound to our Generics
Generics passed inside the diamond can extend certain class or interface
No matter if our generics extend a class or interface syntax is still all the same.
```java 
<T extends SomeClass>
<T extends SomeInterface>
```

*example:*

```java 
public class Printer<T extends Animal>{

    T thingToPrint;

    public Printer(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        thingToPrint.voice();
        System.out.println(thingToPrint.getName());
    }
}

```
We can call methods on T because T must extend Animal therefore it must have methods inherited from Animal

___
## Wilcard 
There is no inheritance of parameterized types 
**example **
```

private static void processDate(List<?> data){
	// some code
}
```

Using the wildcard (<?>) we define that at this moment data type is unknown but whenever we use this method data type will be known and compiling will be with no errors => no need for casting








