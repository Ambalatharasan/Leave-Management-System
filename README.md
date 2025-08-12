# 🏢 Leave Management System (Java)

A simple **console-based Leave Management System** written in Java to track employee leave balances and approve/reject leave requests.  

## 📌 Features
- Store employee details with leave balance.
- Apply for leave and validate request.
- Approve or reject leave based on available balance.
- Auto-update leave balance after approval.
- Simple and beginner-friendly code structure.

## 🛠 Technologies Used
- **Java** (Core Java, OOP concepts)
- **Collections Framework** (`HashMap`)
- **Scanner** for user input

## 📂 Project Structure
```
LeaveManagement.java
```

## 🚀 How It Works
1. Employees are stored in a **HashMap** with `empId` as the key.
2. The user enters an **Employee ID**.
3. If the ID exists, they can **request leave** by entering the number of days.
4. The system **approves** if balance is sufficient, otherwise **rejects**.
5. Leave balance updates automatically after approval.

## 💻 Example Output
```
--- Leave Management System ---
Enter Employee ID (or 0 to exit): 101
Enter number of leave days for Alice: 5
✅ Leave Approved.
Remaining Leave Balance: 7 days

--- Leave Management System ---
Enter Employee ID (or 0 to exit): 103
Enter number of leave days for Charlie: 6
❌ Leave Rejected - Insufficient leave balance.
Available Leave Balance: 5 days
```

## 📝 Code Example
```java
Employee emp = new Employee(101, "Alice", 12);
emp.applyLeave(5); // ✅ Leave Approved. Remaining Leave Balance: 7 days
```

## 📦 How to Run
1. **Clone** this repository:
   ```bash
   git clone https://github.com/yourusername/LeaveManagementSystem.git
   ```
2. **Navigate** to the project folder:
   ```bash
   cd LeaveManagementSystem
   ```
3. **Compile** the program:
   ```bash
   javac LeaveManagementSystem.java
   ```
4. **Run** the program:
   ```bash
   java LeaveManagementSystem
   ```

## 🤝 Contributing
Pull requests are welcome! For major changes, please open an issue first to discuss what you’d like to change.

## 📄 License
This project is licensed under the MIT License.
