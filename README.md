# 🏦 Bank Management System

A Java-based **Bank Management & ATM System** developed using **Java Swing, JDBC, and MySQL**. The project provides a graphical interface for performing common banking operations while storing and managing account data through a MySQL database.

## 📌 Overview

The **Bank Management System** is a desktop-based banking application designed to simulate essential ATM and banking operations.

It demonstrates practical implementation of:

* Java GUI development using Swing
* JDBC-based database connectivity
* MySQL database management
* Object-Oriented Programming
* Event-driven programming
* Authentication and transaction workflows

## ✨ Features

### 👤 Account Management

* Create a new bank account
* Secure user login
* Manage customer account information

### 💰 Banking Operations

* Deposit money
* Withdraw money
* Check account balance
* Fast cash withdrawal
* View mini statement

### 🔐 Security

* PIN-based authentication
* PIN change functionality
* Login validation

### 🖥️ User Interface

* Interactive Java Swing GUI
* User-friendly navigation
* Separate screens for different banking operations

## 🛠️ Technologies Used

| Technology        | Purpose                             |
| ----------------- | ----------------------------------- |
| **Java**          | Core application development        |
| **Java Swing**    | Graphical User Interface            |
| **JDBC**          | Java–MySQL database connectivity    |
| **MySQL**         | Data storage and management         |
| **IntelliJ IDEA** | Development environment             |
| **Git & GitHub**  | Version control and project hosting |

## 🏗️ Project Architecture

```text
Bank Management System
│
├── Java Swing
│   └── User Interface
│
├── Java
│   ├── Application Logic
│   ├── Authentication
│   └── Transaction Processing
│
├── JDBC
│   └── Database Connectivity
│
└── MySQL
    └── Account & Transaction Data
```

## 📂 Project Structure

```text
Bank_Management_System/
│
├── .idea/
├── lib/
├── src/
│   └── ...
├── .gitignore
└── Bank Management System.iml
```

> The main application source code is located inside the `src` directory.

## ⚙️ Prerequisites

Before running the project, make sure you have:

* **JDK** installed
* **MySQL Server** installed and running
* **IntelliJ IDEA** or another Java IDE
* MySQL JDBC Connector available to the project

## 🚀 Installation & Setup

### 1. Clone the Repository

```bash
git clone https://github.com/ravig132/Bank_Management_System.git
```

### 2. Open the Project

Open the cloned project in **IntelliJ IDEA**.

### 3. Configure MySQL

Create the required database in MySQL and configure the database connection details used by the application.

Typical JDBC configuration:

```java
String url = "jdbc:mysql://localhost:3306/your_database";
String username = "root";
String password = "your_password";
```

> Update these values according to your local MySQL configuration.

### 4. Configure JDBC Driver

Make sure the **MySQL Connector/J** library is added to the project's classpath.

### 5. Run the Application

Locate the application's main Java class inside the `src` directory and run it from IntelliJ IDEA.

## 🔄 Application Workflow

```text
Start Application
       │
       ▼
   Login / Sign Up
       │
       ▼
   ATM Dashboard
       │
       ├── Deposit
       │
       ├── Withdraw
       │
       ├── Fast Cash
       │
       ├── Balance Inquiry
       │
       ├── Mini Statement
       │
       └── Change PIN
       │
       ▼
    Database
```

## 🎯 Learning Objectives

This project was developed to strengthen practical knowledge of:

* Core Java
* Object-Oriented Programming
* Java Swing
* Event Handling
* JDBC
* MySQL
* Database-driven application development
* GUI-based software architecture
* CRUD operations
* Git and GitHub

## 🔮 Future Improvements

Possible future enhancements include:

* Transaction history with timestamps
* Improved input validation
* Password/PIN security improvements
* Admin dashboard
* Account search functionality
* Fund transfer between accounts
* PDF statement generation
* Improved database architecture
* Migration to **Spring Boot**
* REST API integration
* Web-based banking interface

## ⚠️ Disclaimer

This project is created for **educational and demonstration purposes**. It is not intended to be used as a production banking system or for handling real financial transactions.

## 👨‍💻 Author

**Ravi Kumar Gangwar**

Computer Science & Engineering Student
Aspiring Java Developer

### 🔗 GitHub

[Bank Management System](https://github.com/ravig132/Bank_Management_System)

---

⭐ If you find this project useful, consider giving the repository a star!
