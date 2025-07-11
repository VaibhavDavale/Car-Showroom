

🧑‍💻 Group member

Made with 💡 by 

1.Vaibhav Davale 
 2.Ajay Mali

📧  davlevaibhav0@gmail.com
📧 ajaymali0885@gmail.com
📍 India

🚗 Car Showroom Management System (Console-Based)
A simple console-based Java application that simulates a basic car showroom management and booking system using:

✅ Core Java (OOP, Multithreading, JDBC, 
Exception Handling)

✅ PostgreSQL Database

✅ Maven Project Structure

📂 Project Structure
car-showroom/

├── pom.xml
└── src/
└── main/
└── java/
└── com/
└── showroom/
├── Main.java
├── db/
│   └── DBConnection.java
├── dao/
│   ├── CarDAO.java
│   └── OrderDAO.java
├── model/
│   └── Car.java
└── thread/
└── BookingThread.java
└── README.md

💻Output





🗃 Database Setup (PostgreSQL)


CREATE TABLE if not exists cars (
  car_id SERIAL PRIMARY KEY,
  model VARCHAR(100),
  brand VARCHAR(50),
  price DECIMAL,
  stock INT
);

CREATE TABLE if not exists users (
  user_id SERIAL PRIMARY KEY,
  username VARCHAR(50),
  password VARCHAR(50)
);

CREATE TABLE if not exists orders (
  order_id SERIAL PRIMARY KEY,
  user_id INT REFERENCES users(user_id),
  car_id INT REFERENCES cars(car_id),
  order_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


⚙ Configuration

Edit the PostgreSQL credentials in DBConnection.java:

String url = "jdbc:postgresql://localhost:5432/car_showroom";
String user = "postgres";
String password = "root123";


🚀 How to Run

1. Clone the repo or copy the project folder:

git clone https://github.com/VaibhavDavale/car-showroom.git
cd car-showroom


2. Set up PostgreSQL and create the required tables.


3. Open the project in Eclipse, IntelliJ, or any IDE with Maven support.


4. Run Main.java to start the app.


5. Use the console menu to:

*View all cars

*Book a car

"View orders




🧠 Features

*Register users

*View available cars with stock

*Book cars with multithreaded simulation

*Orders stored with timestamp

*Basic DAO pattern with JDBC


🔄 Multi-Threaded Feature

Simulates multiple users booking cars at the same time using Java threads.

Threads check stock, update it, and place orders concurrently.


📦 Dependencies (in pom.xml)

<dependency>
  <groupId>org.postgresql</groupId>
  <artifactId>postgresql</artifactId>
  <version>42.7.1</version>
</dependency>


🧑‍💻 Author

Made with 💡 by Vaibhav Davale & Ajay Mali
📧 Email: davlevaibhav0@gmail.com
📧 Email: ajaymali0885@gmail.com

📍 Location: India

![1000065888](https://github.com/user-attachments/assets/2a894d5e-79bf-464e-a38f-56c5d8e97e54)

