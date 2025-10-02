
# Spring Core XML (Setter & Constructor Injection)

**Learning Log**

- **30 September 2025** → Completed **Setter Injection** using Spring XML configuration.
- **1 October 2025** → Completed **Constructor Injection**, explored **p-schema** & **c-schema**, and resolved ambiguity issues with constructor-arg order.
- **2 October 2025** → Completed **Bean LifeCycle**, explored **3 method of Configuring Bean Lifecycle**:- Using XML Config, Using Interface( InitializingBean, Disposable Bean ).

---

## What I Did

- Created a **Maven project**
- Added **spring-context** dependency
- Implemented a **Student POJO bean**
- Wired the bean in `config.xml` using both **setter** and **constructor injection**
- Explored **p-schema** and **c-schema** for cleaner XML configuration
- Learned about ambiguity handling in constructor arguments
- Loaded Spring context in `App.java` and used the bean successfully

---

## Project Structure

```bash
Spring-Practice  
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

📚 Source
---------

Currently learning from this YouTube playlist:[Spring Framework Tutorial - Telusko](https://www.youtube.com/playlist?list=PL0zysOflRCekeiERASkpi-crREVensZGS)