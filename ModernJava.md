### Java platform

- Java platform consists of  
    - Java programming language
    - Java runtime environment
    - Java standard libraries
    - JVM : Java virtual machine executes the Java bytecode which can not be directly execute on the present hardware since it only understands the machine code
        - Translates java byte code into Machine code for the for the specific processor it's been designed for.
### JDK (Java development kit)

- Basically JDK is made up of three things
    - compiler
    - Java standard libraries
    - Java runtime environment
    - JVM : Java virtual machine executes the Java bytecode which can not be directly execute on the present hardware since it only understands the machine code and it has the Java runtime environment as well
- JVM is different for each OS/architecture and Upper layer such as language and Standard edition API remains the same and JVM makes Java platform agnostics

### Flow of the java code - Compilation & Running - How java platform works

**Source code** (ex. Hello.java) -> **javac** Java bytecode (Hello.class) -> Java Stadard Edition(SE) API -> **java** JVM

### Just-in-time compilation 
// To be written later

## Java Enterprise Edition (Java EE) -
Enterprise edition of Java (Web Application) are different from the Single Desktop Applications. They make use of several external libraries.

Java EE has several API which makes it easier for the Developer to not to maintain the external libraries by themselves.

Example of the API - Java Persistence Architecture, Enterprise Java Beans and Java Server faces etc

- Java EE Application Servers :
    - Wildfly (Redhat)
    - WebSphere (IBM)
    - WebLogic (Oracle)
    - Tomcat (Apache)

- When using Microframeworks such as Spring/ Springboot instead of Java EE, everything bundled up into Single Java Application and which can be run directly on the JVM. There is no big application server involved anymore.


## Java on Android 
- Java != Android Java
- Android apps are written in older versionof java such as Java 7 or 8
- Flow of the code in Java
    - **Source Code** --> **Java Bytecode** --> **DEX (Dalvik Executable Format)** -->  Android APIs   --> Dalvik Virtual Machine
                                                                                        Java SEish APIs    

- Dalvik Virtual Machine behaves same as JVM but has different design goals


## Spring Framework

- We declare components and dependencies and at the runtime in the Spring dependency injection container

## JRE and JDK
- JRE is Java Runtime Environment enabled java code execution. Basically executes java bytecode
- JDK provides tools required to create Java apps.
- **IDE** -> **JDK** -> **Java App** -> **JRE** -> **Host Environment**
- We only need JRE to run the java application.