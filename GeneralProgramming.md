### Types of comments
- Single Line Comment
- Block Line Comment
- Javadoc comment :
    - Javadoc comments behaves same as above comments, but it can be used generate documentation



### Datatypes 
#### Primtive Dataype
- Integer  Type
    - byte - bits = 8
    - short - bits = 16
    - Int - bits = 32
    - long - bits =64

- Floating Point Type
    - float - bits = 32
    - double - bits =64

- Character Type
    - Stores single unicode character

- Boolean Type
    - True or False

### Operator Precedence
- **Postfix (X++ X--)** > **Prefix (++X --X)** > **Multiplicative (* / %)** > **Additive ( +  -)**
- We can override the precedence with the parenthesis

### Type conversion
- Implicit Type Conversion
    - This type of conversion is automatically done by the compiler 
    - Mixed integer sizes
        - Uses the largest integer in the equation
    - Mixed floating point sizes
        - Uses double
    - Mixed floating point and Integer
        - Uses largest floating point
- Explicit Type Conversion
    - Need to use cast operator for this 


### Conditional Logical Operator and Logical Operator 
- Logical Operators
    - AND (&)
    - OR (|)
    - XOR (^)
    - NOT (!)

- Conditional Logical Operator 
    - AND (&&) - exectues right only when left is true
    - OR (||) - executes right only when left is false
    


### Parameter Passing

- Parameters passed "by value"
    - Parameter receives a copy of the original value
- Parameters passed "by reference"
- Parameters are passed positionally

### Main methods runs as the Program Entry point and command line arguments are passed to it


### Strings
- Strings are immutable
    - String variable do not directly hold their value, instead it holds a reference to the instance of string
    - Change in the value creates as new instance of the string

- String equality
    - '==' when applied to strings then it checks whether these variable points to same reference. So it does not compare content of the strings but reference
    - We use equals method to compare content of Strings

- Interning a String
    - This methods makes several string variables to point to same string reference

- String Builder
    - Provides mutable string buffer
        - Efficiently constructs string values
    - We use toString() to extract values from the string builder

### Other Data Types
- Time & Data
    - Instant class
    - LocalDate
    - DateTimeFormatter

### Primitive wrapper class
- Each primitive types has a wrapper
- Wrapper classes has several methods
    - Coverting to from other types
    - Extracting values from strings
    - Finding min/max values
    