🎓📚 Hibernate Many-to-Many Relationship
Student & Course Example
This project demonstrates a Many-to-Many relationship using Hibernate (JPA) between Student and Course entities.

📌 Project Overview
One Student can enroll in multiple Courses
One Course can have multiple Students
A join table is used to maintain the relationship
🔹 Relationship Concept
Student (Many) -------- (Many) Course

Many Students ↔ Many Courses
Managed using a Join Table
🛠 Technologies Used
Java
Hibernate
JPA Annotations
MySQL
Maven
🗄 Database Structure
Student Table
id (Primary Key)
name
email
Course Table
id (Primary Key)
course_name
duration
Student_Course (Join Table)
student_id (Foreign Key)
course_id (Foreign Key)
🔁 Hibernate Mapping Concept
Many-To-Many (Owning Side)
Defined in one entity (e.g., Student)
Uses @ManyToMany
Uses @JoinTable
Specifies join columns and inverse join columns
Inverse Side
Defined in the other entity (e.g., Course)
Uses @ManyToMany(mappedBy = "courses")
Does not define JoinTable again
🔑 Key Annotations Used
@Entity → Marks class as entity
@Table → Maps entity to table
@Id → Primary key
@GeneratedValue → Auto ID generation
@ManyToMany → Defines many-to-many relationship
@JoinTable → Defines join table
@JoinColumn → Defines foreign key columns
⚙ Fetch Strategies
EAGER → Loads associated entities immediately
LAZY → Loads associated entities only when accessed
(Default for ManyToMany is LAZY)

🔁 Cascade Behavior (If Applied)
CascadeType.PERSIST → Saves related entities
CascadeType.MERGE → Updates related entities
CascadeType.REMOVE → Use carefully (may delete linked records)
🎯 Expected Behavior
A student can enroll in multiple courses
A course can contain multiple students
Join table maintains the relationship
Foreign keys ensure referential integrity
✅ Conclusion
This project explains:

Hibernate Many-to-Many mapping
Join table concept
Owning and inverse side
Fetch types (Lazy & Eager)
Cascade operations
⭐ This example helps understand complex relational mapping in real-world applications like learning management systems.
