# ENUM

___

Since `enum extends Enum` it give us methods we can use: 
## Methods from Enum: 
   1. `values()` returns array of all values for given enum

___

Just like regular classes enum can have fields, constructor and methods

1. Constructor
   - same name as enum (just that, no public)
```java
public enum Cereals{
    CAPATAIN_CRUNCH,
    FROOT_LOOPS(45),
    RESES_PUFFS(55),
    COCOA_PUFFS(65);

    int levelOfDeliciousness;

    Cereals(int levelOfDeliciousness){
        this.levelOfDeliciousness = levelOfDeliciousness;
    }
}
```

`CAPATAIN_CRUNCH //error, we must pass int to create it`

2. Fields
   - make them final so it cannot be changed
```java 
public enum Cereals{
    CAPATAIN_CRUNCH(50),
    FROOT_LOOPS(45),
    RESES_PUFFS(55),
    COCOA_PUFFS(65);

    final int levelOfDeliciousness;

    Cereals(int levelOfDeliciousness){
        this.levelOfDeliciousness = levelOfDeliciousness;
    }
}
```
now our level is set once we call Constructor of Cereals and cannot be changed

