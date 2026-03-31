# ✈️ AeroCruise Backend System

### Flight Booking & Management System (Spring Boot)

---

## 🚀 Project Overview

**AeroCruise** is a backend system for flight booking built using **Spring Boot**.
It allows users to register, search flights, and book tickets with secure authentication.

The system follows a clean **layered architecture**:
Controller → Service → Repository → Database.

---

## 🧠 Features

* 🔐 User Authentication (JWT)
* ✈️ Flight Management (Add, Search, View)
* 🎟️ Ticket Booking System
* 📊 Booking History
* 💾 MySQL Database Integration
* 🔒 Secure APIs

---

## 🏗️ Project Structure

```
AeroCruiseAI/
│
├── backend-java/     # Spring Boot Backend
├── docs/             # Documentation
└── README.md
```

---

## ⚙️ Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* MySQL
* JWT Authentication
* Maven

---

## 🔄 Architecture

Client → Controller → Service → Repository → MySQL

---

## 📡 API Endpoints

### 🔐 Auth

* POST `/auth/register`
* POST `/auth/login`

### ✈️ Flights

* POST `/flights/add`
* GET `/flights/all`
* GET `/flights/search`

### 🎟️ Booking

* POST `/booking/book`
* GET `/booking/history`

---

## 🚀 Run Project

```bash
mvn clean spring-boot:run
```

---

## 🧪 Testing

Use Postman to:

* Register user
* Login → get JWT token
* Add flight
* Book flight
* Check history

---

## 📊 Future Improvements

* Payment integration
* Frontend (React)
* Admin panel
* Deployment

---

## 👨‍💻 Author

Supesh Chavhan
GitHub: https://github.com/Supesh1211
