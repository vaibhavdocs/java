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