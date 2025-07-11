

# 🚗 Car Showroom Management System

A Core Java project built with Maven, using PostgreSQL as the database and multithreading to simulate concurrent car bookings.

---

## 🔧 Tech Stack

- Java (Core)
- Maven (Project Management)
- PostgreSQL (Database)
- JDBC (Database Connection)
- Multithreading (Simulated bookings)
- Git & GitHub




car-showroom/
├── src/
│ └── main/java/com/showroom/
│ ├── Main.java
│ ├── db/DBConnection.java
│ ├── dao/CarDAO.java
│ ├── dao/OrderDAO.java
│ ├── model/Car.java
│ └── thread/BookingThread.java
├── pom.xml
└── README.md


---

## 🗄️ PostgreSQL Database Schema

```sql
CREATE TABLE cars (
  car_id SERIAL PRIMARY KEY,
  model VARCHAR(100),
  brand VARCHAR(50),
  price DECIMAL,
  stock INT
);

CREATE TABLE users (
  user_id SERIAL PRIMARY KEY,
  username VARCHAR(50),
  password VARCHAR(50)
);

CREATE TABLE orders (
  order_id SERIAL PRIMARY KEY,
  user_id INT REFERENCES users(user_id),
  car_id INT REFERENCES cars(car_id),
  order_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

git clone https://github.com/VaibhavDavale/car-showroom.git
cd car-showroom

🔄 Multi-Threaded Feature
This project simulates multiple users booking cars at the same time using Java threads.
Threads check stock, update it, and place orders concurrently.
📦 Dependencies (pom.xml)
<dependency>
  <groupId>org.postgresql</groupId>
  <artifactId>postgresql</artifactId>
  <version>42.7.1</version>
</dependency>

Vaibhav Davale
Ajay Mali
📧 vaibhav@example.com
📍 India
![1000065888](https://github.com/user-attachments/assets/2a894d5e-79bf-464e-a38f-56c5d8e97e54)

