# 🎓 Student–Course Management System  
## Hibernate Many-to-Many Mapping Project

---

## 📌 Project Description

The **Student–Course Management System** is a Java-based backend project developed using **Hibernate (JPA)** to demonstrate the implementation of a **Many-to-Many relationship** between entities.

In this system:

- One **Student** can enroll in multiple **Courses**
- One **Course** can have multiple **Students**

This relationship is handled using a **Join Table** (`student_course`) in the relational database.

This project is ideal for understanding:
- Hibernate ORM concepts
- JPA annotations
- Bidirectional mapping
- Join table implementation
- Database relationships

---

## 🛠 Technologies Used

- ☕ Java (JDK 8+)
- 🌱 Hibernate ORM
- 🗄 MySQL Database
- 🧩 Maven
- 🖥 Eclipse / IntelliJ IDEA

---

## 🗄 Database Design

### 1️⃣ student Table

| Column Name | Data Type |
|------------|-----------|
| id | INT (PK) |
| name | VARCHAR |

### 2️⃣ course Table

| Column Name | Data Type |
|------------|-----------|
| id | INT (PK) |
| course_name | VARCHAR |

### 3️⃣ student_course (Join Table)

| Column Name | Description |
|------------|------------|
| student_id | FK → student.id |
| course_id | FK → course.id |

---

## 🔗 Entity Relationship

- Student ↔ Course  
- Relationship Type: **Many-to-Many**
- Implemented using `@ManyToMany` annotation

---

## 💻 Hibernate Mapping

### ✅ Student Entity

---

🚀 Features

✔ Add Student
✔ Add Course
✔ Assign Multiple Courses to a Student
✔ Retrieve Students with their Courses
✔ Bidirectional Relationship
✔ Automatic Join Table Creation
✔ Hibernate Session Management
Aspiring Java Full-Stack Developer
Passionate about Backend Development & Database Design

---
How to Run the Project

1️⃣ Clone the repository:

git clone https://github.com/PeetlaMahesh123/ManyToManyHibernate.git


2️⃣ Open the project in Eclipse or IntelliJ

3️⃣ Configure MySQL database

4️⃣ Update hibernate.cfg.xml with your DB credentials:

<property name="hibernate.connection.url">jdbc:mysql://localhost:3306/your_db</property>
<property name="hibernate.connection.username">root</property>
<property name="hibernate.connection.password">password</property>


5️⃣ Run MainApp.java

📚 Learning Outcomes

After completing this project, you will understand:

What is ORM

Hibernate Architecture

Entity Mapping

Many-to-Many Relationship

Join Tables

Cascade Types

Fetch Types (EAGER vs LAZY)

SessionFactory & Session handling

📌 Future Enhancements

Add CRUD operations with Menu

Add Validation

Convert to Spring Boot Application

Add REST APIs

Connect with Frontend (React)

👨‍💻 Author

Mahesh Peetla
Aspiring Java Full-Stack Developer
Passionate about Backend Development & Database Design
