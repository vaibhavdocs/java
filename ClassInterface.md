### Class and their objects/instances

- ``` Flight mumToDel;```
    - **mumToDel** does not contain the object of the class Flight  
- ``` Flight mumToDel; mumToDel = new Flight() ```
    - In this it will create a instance of the Flight class and mumToDel will hold the reference to the object
- To create an object of the class then visibility of the both the classes and constructor must be public

### Encapsulation
- The implementation details of a class are generally hidden. Java uses access modifiers to achieve encapsulation
- Class as such are can not be made Private and Protected. Inner classes can be made private though.

- All the constructor must have unique signatures. this() calls constructors
- Initialization block runs always on object creation. Cannot receive parameters.
- Initialization and Construction order 
    - Field Initializers --> Initialization Blocks --> Constructors


### Static
- Static members are shared class-wide.
- Static Methods can only access static members such as static fields and static methods
- Static import - allows static methods to be without being class-qualified
- Static Initializers can be written in the following syntax 
``` 
static {
    //you code 
}
``` 
- Gets executed even before consuming the class of these static blocks

### Passing Objects as Parameters
- Primitive data types are passed as values. Copy of the values are passed into parameters but in the case of the Objects we pass "By reference"
- Changes made to object's reference still reflects after method execution

### Method Overloading
- Example
    - add1Passenger()
    - add1Passenger(int bags)
    - add1Passenger(int bags, int carryOne)

- Curios case
    ``` short threebags = 3;
        obj.add1Passenger(threebags,3) 
        /*
        there is no suhc overload which accepts the short as input 
        */
    ```
    In the above case, compiler will automatically convert short into integer and hence there is an overload available now.

### Varible number of the Parameters
- public void addPassengers(Passenger... list)  --  this can take variable number of the parameters


### References tp Derived Class Instances
- Available features - Dictated by the type of reference being used to access the instance
- Methods we access are tied to the type of the reference, not the type of the class instance. Example -

1. **CargoFlight.java**
``` 
class CargoFlight extends Flight {
    public add1Package() {
        
    }
}
```
2. **Main.java**
```
Flight f = new CargoFlight()

f.add1Passenger() 
/*
it will works because this method is part of the flight class
*/
f.add1Package() 
/*
won't work because reference is of type Flight, so will be only able to access 
members that are part of reference class
*/ 
```

### Derived Class Members
- When Derived class members has the same name and datatype as the class members of the base class then derived class simply hides the base class members (It does not replace the base class member)

```
Flight f1 = new CargoFlight()

f1.add1Passenger() // this will use 'seat' member from the base class Flight

CargoFlight f2 = new CargoFlight()

f2.add1Passenger() 
/* 
this will use the 'seat' member from base class even if we have same named member in the derived class
*/

```

This problem is not tied to type of reference we use.

#### Method Overriding
- The key difference between fields and methods is, type of reference determines which version of the fields to use whereas type of classinstance determines which method to use

### Object Class
- Every class diretly or indirectly inherits Object class
- So it means that we can create reference of Object for any of the class. That will not be able to use methods or fields of that class though.

``` 
Object o = new CargoFlight();
o.add1Package() // will not work, object reference does not know about the method

CargoFlight cf = (CargoFlight) o;
cf.add1Package()
```


### Super()
- Similar as *this*, *this* refers to current object and *super* does that too but key difference is
*super* treats the object as the instance of the base class.

### Preventing Inheritance and Method Overriding

- *final* keyword can change default behaviour such as 
    - Can prevent class extending
    - Can prevent method overriding

### Requiring Inheritance and Method Overriding

- *abstract* keyword can change default behaviour such as 
    - Can prevent class extending
    - Can prevent method overriding

- **Abstract Methods** can only be used in **Abstract classes** and it does not have body

### Inheritance and Constructors
- We use **super()**  to call base class default constructor
- Base class default no parametric constructor is always called otherwise if explicit call has been made to base class constructor



### Enums

- First value in the enum is lowest order and last value is of the highest order
- we can apply compareTo() to enums to see if orders is higher or lower.
- Every value in the enum class is acutally instance of the enum class so it has certain methods available to it 


### Creating Abstract Relationships with Interfaces
- Why do we need Interfaces? 
    -   A class directly extends only one class. We make use of Interface to reuse features of other classes without inheritance

- Comparable interface provides a contract for ordering 

- Generics interface implementation
    ```
        class Passenger implements Comparable<**Passenger**> 
    ```
    - Allows stronger typing
    - Allows specializing interface on a type

- A Class can implement multiple interfaces
- Interface members are implicitly public.
- An interface can extend another interface
    - Implementing a derived interface implies implementation of the base
- Interface can be understood as a contract
- *default* keyword at the start of method signature in the interface lets consuming classes not necessarily define the method. This eases the process of introducing new methods to Interface. 

### Inner Classes & Anonymous classes
- Nested Types
    - Nested Type
        - A type declared within another type
        - These type are members of the enclosing type
        - Nested type can access private members of the enclosing class
        - Nested types support all access modifiers

    - Nesting types for naming scope
        - Type name scoped within enclosing type
        - No relationship between nestedn type and enclosing type instance

    - Applies to the following nested types
        - Static class nested within class
        - All classes nested within interfaces
        - All nested interfaces

- Inner Class
    - Type name scoped within enclosing type
    - Creates instance relationship
    - Each instance of thenested class associated with an instance of enclosing class

    - Applies to the following nested type
        - Non static classes nested within classes

- Anonymous Class
    - Declared as part of their creation
    - Use as simple interface implementations
    - Use as simple class extension
    
    - Anonymour classes are inner classes
        - Instance is associated with enclosing class instance