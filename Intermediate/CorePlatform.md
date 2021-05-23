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

    - Cleanup the streams with the resources is a tricky task, since closeable interface implemented by the streams may not be optimum, so it implements AutoCloseable interface which provides Automatic Cleanup 

    `Streams` <--- (implements) `Closeable Interface` <--- `AutoCloseable`

    - `Try-with-resources`
        - Automates the cleanup of 1 or more resources
            - A "resource" is any type that implements AutoCloseable interface
        - Example 
            - 
            ```
            try (Reader reader = Helper.openReader("file.txt"))
            ```
    
- Chaining Streams 
![chainingStreams](https://user-images.githubusercontent.com/36666451/118376874-40416600-b5e8-11eb-8234-6c5f26d8b14c.png)


- File and Buffered Streams

    - Buffered Streams
        - Buffereed readers are used for File Read and write opertion.
        - Since they provide large chunk of data to read or write to file
        ![Buffered_Streams](https://user-images.githubusercontent.com/36666451/118377003-f86f0e80-b5e8-11eb-90fb-568cb2f78c4d.png)

        - Buffered Writer
            - Linux has `\n`  for the newline
            - Windows uses `\r\n` (carriage return and new line)
            - Buffered writer generates new line for the current platform using the newLine() methods  

- java.nio
    - FileXXXX (FileReade and FileWriter), this methods are deprecated in the new library and `java.io` is replaced with `java.nio`. 
    - InputStream and OutputStream are still in place
    ![java nio](https://user-images.githubusercontent.com/36666451/118387522-8aeccd80-b63c-11eb-88d8-98d552acb63b.png)

    - Path
    ![path_java_nio](https://user-images.githubusercontent.com/36666451/118387686-66452580-b63d-11eb-8e7f-4b6c8fc43b49.png)

    - File types
        - Once we have the `Path` then we can use `File` to interact with it
        ![Files](https://user-images.githubusercontent.com/36666451/118387695-72c97e00-b63d-11eb-95ac-8c95eec59216.png)

        - Example
        ```
        try(BufferedReader br = new Files.newBufferedReader(Paths.get("data.txt")))
        ```
        - We can use `BufferedWriter` to write into a file or we can make use of `Files.write()` which takes care of opening, writing and closing the file

    - File System 
        - Represents a File System 
        - Can have specilized file systems such as zip

    - URI - Universal Resource Identifier
        - URI for zip file => "jar:file"
        - File systems are identified by URI


### 1.2 String Formatting and Regular Expressions 

    - String Joiner 
        - Lets you join the sequence of the strings based on separator, starting and ending value.

    
    - Strings with Format
        - Format specifier  
            - % [argument index] [flag] [width] [precision] conversion
            - width - minimum characters to display
            - precision - Decimal places to display

            - Format Flags
                ![format_flags](https://user-images.githubusercontent.com/36666451/119034548-19aa7300-b9cc-11eb-8086-37b3a78ff0bd.png)


### 1.3 Working with Collections

- Lambda
    - Simplify passing code as argument
        ```
        ArrayList as = new ArrayList();
        as.forEach(m -> m.getValue().equals("something"));

        ```

        