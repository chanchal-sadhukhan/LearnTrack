# ⚙️ Setup Instructions – LearnTrack

## 🧩 JDK Version Used

This project is built and tested using:

* **JDK Version:** Java SE 17 (Recommended)
* You can also use **Java 8 or above**

### ✅ Verify JDK Installation

Run the following commands in your terminal:

```bash
java -version
javac -version
```

### ✔ Expected Output (Example)

```bash
openjdk version "17.0.x"
javac 17.0.x
```

---

## 🚀 Running a Simple "Hello World" Program

This section demonstrates that your Java setup is working correctly.

---

### 📄 Step 1: Create a Java File

Create a file named `HelloWorld.java`

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, LearnTrack!");
    }
}
```

---

### 🛠️ Step 2: Compile the Program

Run:

```bash
javac HelloWorld.java
```

✔ This generates a file:

```
HelloWorld.class
```

---

### ▶️ Step 3: Run the Program

```bash
java HelloWorld
```

---

### ✅ Expected Output

```bash
Hello, LearnTrack!
```

---

## 🧠 Explanation

* `javac` → Compiles `.java` file into **bytecode (.class file)**
* `java` → Runs the bytecode using the **JVM (Java Virtual Machine)**

This confirms:
✔ JDK is installed
✔ Compiler is working
✔ JVM is executing programs correctly

---

## 📌 Notes

* Ensure Java is added to your system **PATH**
* Use any IDE (IntelliJ, VS Code, Eclipse) or terminal
* If errors occur:

  * Check Java installation
  * Reinstall JDK
  * Restart terminal

---

## 🎯 Conclusion

Once the Hello World program runs successfully, your environment is ready to build and run the **LearnTrack project**.

---
