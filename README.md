# 📚 LearnTrack – Student & Course Management System

## 🧾 Project Description

**LearnTrack** is a console-based Student & Course Management System built using **Core Java**.
It enables administrators to efficiently manage:

* 👨‍🎓 Students
* 📘 Courses
* 🔗 Enrollments

The project focuses on **fundamental Java concepts**, clean architecture, and modular design, making it ideal for learning backend development basics.

---

## 🎯 Key Features

### 👨‍🎓 Student Management

* Add new student
* View all students
* Search student by ID
* Deactivate student (soft delete using `active = false`)

---

### 📘 Course Management

* Add new course
* View all courses
* Activate / Deactivate course

---

### 🔗 Enrollment Management

* Enroll a student into a course
* View enrollments for a specific student
* Mark enrollment as:

  * ✅ COMPLETED
  * ❌ CANCELLED

---


## 🏗️ Project Architecture

```
com.airtribe.learntrack
│
├── entity        → Core domain models (Student, Course, Enrollment)
├── repository    → In-memory data storage
├── service       → Business logic layer
├── exception     → Custom exceptions
├── util          → Utilities (ID generator, validators)
├── enums         → Fixed states (EnrollmentStatus)
└── Main.java     → Console UI
```

---

## 🗃️ Data Modeling

### Entities

#### 👤 Student

* id (int)
* firstName (String)
* lastName (String)
* email (String)
* batch (String)
* active (boolean)

#### 📘 Course

* id (int)
* courseName (String)
* description (String)
* durationInWeeks (int)
* active (boolean)

#### 🔗 Enrollment

* id (int)
* studentId (int)
* courseId (int)
* enrollmentDate (String)
* status (ACTIVE / COMPLETED / CANCELLED)

---

## 🔗 Entity Relationships (ER Design)

```
Student (1) --------< Enrollment >-------- (1) Course
```

### Explanation:

* A **student can enroll in multiple courses**
* A **course can have multiple students**
* The **Enrollment entity acts as a mapping table** (many-to-many relationship)

---

## 📊 ER Diagram (Text Representation)

```
+-----------+        +--------------+        +-----------+
|  Student  |        |  Enrollment  |        |  Course   |
+-----------+        +--------------+        +-----------+
| id        |<------>| studentId    |        | id        |
| firstName |        | courseId     |<------>| courseName|
| lastName  |        | status       |        | duration  |
| email     |        | date         |        | active    |
| active    |        +--------------+        +-----------+
+-----------+
```

---

# ⚙️ Setup & Run Instructions

## ✅ Prerequisites

Make sure you have:

* Java JDK 8 or above installed
* Verify installation:

```bash id="checkjava"
java -version
javac -version
```

* (Optional) Gradle installed OR use Gradle Wrapper (`gradlew`)

---

## 📦 Step 1: Clone or Download Project

```bash id="clone"
git clone <your-repo-url>
cd LearnTrack
```

OR download ZIP and extract.

---

## 🛠️ Option 1: Setup & Run using `javac` (Manual)

### Step 1: Navigate to source folder

```bash id="nav"
cd src
```

### Step 2: Compile all Java files

```bash id="compile"
javac -d ../out com/airtribe/learntrack/**/*.java
```

### Step 3: Run the application

```bash id="runjava"
cd ..
java -cp out com.airtribe.learntrack.Main
```

---

## ⚡ Option 2: Setup & Run using Gradle Wrapper (`gradlew`)

### Step 1: Ensure wrapper exists

You should see:

* `gradlew`
* `gradlew.bat`
* `build.gradle`

If not, initialize:

```bash id="gradleinit"
gradle init
```

### Step 2: Run the application

```bash id="gradlerun"
./gradlew run
```

> On Windows:

```bash id="gradlerunwin"
gradlew.bat run
```

---