-----Disclaimer-----

This project contains intentionally vulnerable implementations for educational and research purposes only. 
Vulnerable code should never be used in production environments.

-----Overview-----

This project is a secure Java-based Bookshop Management System developed as part of a Secure Application Development module. 
The application demonstrates the identification, exploitation, mitigation, and validation of common software vulnerabilities 
within a desktop-based Library Management System (LMS).

The project focuses on applying secure coding principles, defensive programming techniques, 
and industry-recognised security practices aligned with:

* OWASP Top 10 (2025)
* NIST Secure Software Development Framework (SSDF)
* Secure by Design principles
* Defensive programming methodologies

------Features------

The application includes:

* User authentication and role-based access control
* Book searching and catalogue browsing
* Loan request and approval workflows
* Administrative management functionality
* Researcher and librarian access panels

-----Technologies Used-----

* Java (Swing GUI)
* MySQL
* JDBC
* BCrypt password hashing
* IntelliJ IDEA
* SonarQube
* OWASP ZAP

-----Security Focus-----
The project demonstrates both vulnerable and secured implementations of the application.

Vulnerabilities Demonstrated

* SQL Injection
* Broken Access Control
* Sensitive Data Exposure
* Business Logic Flaws
* Improper Error Handling

Security Mitigations Implemented

* Parameterised SQL queries (PreparedStatement)
* BCrypt password hashing
* Server-side role validation
* Domain validation and business rule enforcement
* Generic exception handling and secure error messaging


------Security Testing------

The application was tested using:

* SonarQube (Static Application Security Testing)
* OWASP ZAP (Dynamic Application Security Testing)
* Manual penetration testing
* Regression testing

-----Project Structure-----
src/
│
├── sad/
│   ├── dao/        # Database access layer
│   ├── db/         # Database connection handling
│   ├── gui/        # Swing GUI panels and frames
│   ├── model/      # Domain models
│   └── Main.java   # Application entry point
│
└── bookshop_complete.sql
