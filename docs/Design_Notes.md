
## 💡 Design Decisions

### ✔ Why use Enrollment instead of storing courses in Student?

* Avoids data duplication
* Supports many-to-many relationship
* Aligns with real-world database design

### ✔ Why ArrayList?

* Dynamic size
* Easy to store objects
* No need for fixed capacity

### ✔ Why static IdGenerator?

* Ensures unique IDs
* Shared across application

---
