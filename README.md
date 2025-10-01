
Spring Core XML( Setter Getter and Constructor Till Now)
=======================================

**Completed:** 30 September 2025

A minimal Maven project demonstrating Spring Core using an XML config.xml and **setter injection**.

Summary
-------

*   Created a Maven project

*   Added spring-context dependency

*   Implemented a Student POJO bean

*   Wired the bean in config.xml using setter injection

*   App loads the Spring context and uses the bean


Project structure
-----------------

```bash
String-Practice  
├─ src/main/java/org/example  
│  ├─ App.java  
│  └─ Student.java  
├─ src/main/resources  
│  └─ config.xml  
└─ pom.xml   
```

> **Note:** config.xml must be inside src/main/resources so it is available on the classpath.

Run
---

*   From IDE: run App.main()

*   mvn clean compilemvn -Dexec.mainClass="org.example.App" exec:java # if exec plugin configured


Quick tips
----------

*   Ensure target/classes/config.xml exists after build.

*   If Spring complains about parsing config.xml, check file location, XML syntax, and encoding (use UTF-8 without BOM).