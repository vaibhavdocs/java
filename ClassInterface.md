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