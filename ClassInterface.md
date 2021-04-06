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