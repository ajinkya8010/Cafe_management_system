# Cafe Management System

## Overview
The **Cafe Management System** is a desktop-based Java application designed to streamline the management and operational tasks of a cafe. It offers two primary user roles: **Admin** and **User**, with distinct functionalities for both. The system is built using Java Swing for the user interface, JDBC for database connectivity, and MySQL for data storage.


## Features
### Admin Features (Additional):
- **User Verification:** Admins can verify user accounts to manage access to the system.
- **Category Management:** Admins can add, update, or delete product categories (e.g., beverages, desserts).
- **Product Management:** Admins can manage cafe items by adding new products, updating details, or deleting products.
- **View, Edit, Delete Products:** Full control over the product catalog, allowing for quick updates to pricing and stock.
- **View Bills & Orders:** Access to all bills and orders placed by users, with options to view details and track orders.

### User Features:
- **Signup & Login:** Users can create an account, log in, and reset passwords or security questions.
- **Place Orders:** Users can browse the menu and place orders.
- **View Bills & Order History:** Users can view past bills and order details.
- **Password and Security Question Management:** Users can change their passwords and security questions.

## Technologies Used
- **Frontend:** Java Swing (for GUI)
- **Backend:** Java
- **Database:** MySQL, JDBC (for database connection)
- **Development Environment:** NetBeans IDE
- **Build Tool:** Apache Maven

## Project Structure

### DAO (Data Access Object) Layer
The DAO classes handle database interactions for different parts of the system:
- **ConnectionDAO:** Manages reusable database connections for performing SQL operations.
- **UserDAO:** Handles all queries related to user management, including signup, login, and account updates.
- **ProductDAO:** Responsible for managing product-related data, including adding, updating, and deleting products.
- **CategoryDAO:** Manages categories for products.
- **BillDAO:** Handles data related to bill generation and order tracking.

### Models
The models represent entities like **User**, **Product**, **Category**, and **Bill**, encapsulating their properties and behaviors:
- **User Model:** Represents user data including ID, name, email, mobile number, address, and credentials.
- **Product Model:** Represents cafe products including ID, name, category, and price.
- **Category Model:** Represents product categories.
- **Bill Model:** Represents bills generated for user orders, including ID, customer details, and total amount.

### Frontend (Java Swing)

### SQL Queries

## How to Run the Project
1. **Clone the repository** to your local machine.
2. **Set up the MySQL database**: 
    - Create the necessary tables using the SQL scripts in the `tables.sql` file.
    - Update the database connection settings (URL, username, password) in the `ConnectionDAO.java` file.
3. **Compile and Run** the project using NetBeans or any Java IDE.
4. **Login** as a user or admin to explore the features.

## Installation Requirements
- Java JDK (version 8 or higher)
- MySQL database
- NetBeans IDE (optional, any Java IDE works)

## Screenshots
- Navigate to screenshots directory

## Future Improvements
- Adding a RESTful API layer for better integration with mobile or web applications.
- Expanding product categories and order features for more detailed customization.
- Improving the UI/UX for a more modern and responsive design.

