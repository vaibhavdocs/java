## Java - Runtime Environment & Language 
 
 - `Java EE (Java Enterprise Edition)` is built on top of `JRE (Java Runtime Environment) / Java SE (Java Standard Edition)` 

- Then there is `Java Micro Edition (Java ME)`, it is subset of JRE intended for embedded system. Example - used of IOT 

- All this above things are owned by Oracle ( Sun was the owner but Oracle bought them)

- There is outlier `Android`, which based on the java environment but owned by Google
    - From the programming language perspective Android uses `Java` but from Runtime perspective it used different things since it uses classes from `JRE` but all of it. `Threading` in the Android has different behaviour then in the `JRE`


## 1. Input and Output with Streams and Files

### 1.1 Streams 

- Stream is ordered sequence of data
- This provide a layer of abstraction over the underlying data as in whether it is network, media or file.
- Stream are unidirectional - Read from , Write to

- types of streams
    - Byte stream
        - interacts as binary data
    - Text stream
        - interacts as Unicode data 

- Read from/ Write to
    
    ![streams](https://user-images.githubusercontent.com/36666451/118318386-f2a8f880-b516-11eb-8228-8b4ca932e055.png)
    - Byte stream
        - Base class - InputStream, OutputStream
    - Text stream 
        - Base class - Reader, Writer

    - Read() methods for the both the streams retuen the number of bytes/char read from. 

    - `OutputStream.Write(int inp)` methods accept, we provide `int` and that gets connverted to `byte`.
    Widening conversion ex. `Int -> Byte` (8 bit - 32 bit) are done automatically by the compiler. 


- Derived classes over streams

    ![classesOverStreams](https://user-images.githubusercontent.com/36666451/118318935-b32edc00-b517-11eb-80fb-816b72fdebef.png)

    ![derivedmethods](https://user-images.githubusercontent.com/36666451/118319389-508a1000-b518-11eb-875e-0bab78c5327e.png)

    - These InputStreamReader and OutputStreamWriter provides layered binary and text streams. Basically allows us to Implement a reader stream over the InputStream. Reading as text stream over a binary stream.  