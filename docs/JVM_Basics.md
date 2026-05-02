# 🧠 JVM Basics – LearnTrack

This document explains the core concepts of Java execution in simple terms.

---

## ☕ What is JDK, JRE, and JVM?

### 🔹 JDK (Java Development Kit)

The **JDK** is a complete package used to **develop Java applications**.

It includes:

* Compiler (`javac`)
* JRE
* Development tools (debugger, etc.)

👉 Think of JDK as a **toolkit for developers**.

---

### 🔹 JRE (Java Runtime Environment)

The **JRE** provides everything needed to **run Java programs**.

It includes:

* JVM
* Core Java libraries

👉 Think of JRE as the **environment required to run Java code**.

---

### 🔹 JVM (Java Virtual Machine)

The **JVM** is the engine that actually **executes Java programs**.

* It converts bytecode into machine-level instructions
* It manages memory, garbage collection, and execution

👉 Think of JVM as the **runtime engine that runs your program**.

---

## 🔄 Relationship Summary

```id="rel01"
JDK → JRE → JVM
```

* JDK contains JRE
* JRE contains JVM

---

## 📦 What is Bytecode?

When you compile a Java program:

```bash id="cmd01"
javac HelloWorld.java
```

It generates:

```id="cmd02"
HelloWorld.class
```

This `.class` file contains **bytecode**.

### ✔ Key Points:

* Bytecode is **not machine-specific**
* It is an **intermediate code**
* It is executed by the JVM

👉 This is why Java programs are portable.

---

## 🌍 What does “Write Once, Run Anywhere” mean?

Java follows the principle:

> **Write your code once and run it on any system**

This is possible because:

* Java code is compiled into **bytecode**
* Bytecode runs on any system that has a **JVM**

### 📌 Example:

A Java program compiled on:

* Windows

can run on:

* Linux
* macOS

without changing the code.

---

## 🧾 Explanation (Simple)

Unlike languages like C or C++ (which compile directly to machine code), Java uses an **intermediate step (bytecode)**.

Each operating system has its own JVM implementation, which understands this bytecode and converts it into native instructions.

So instead of rewriting code for every system, you only need a JVM installed — and your program works everywhere.

---

## 🎯 Conclusion

* **JDK** → Used to build Java programs
* **JRE** → Used to run Java programs
* **JVM** → Executes bytecode
* **Bytecode** → Platform-independent code
* **WORA** → Java programs run on any system with JVM

---
