# REST API - CRUD Operations using ResponseEntity

## Overview

This project demonstrates a simple **Spring Boot REST API** that performs **CRUD operations** for managing course details in a university application.

The API allows administrators to:

* Add a new course
* View all courses
* Update existing course information
* Delete a course
* Search courses by title

All responses are returned using **ResponseEntity** with proper **HTTP status codes**.

---

## Technologies Used

* Java
* Spring Boot
* Spring Web (REST API)
* Maven
* Postman (for API testing)

---

## Course Entity Fields

* **courseId** – Unique ID of the course
* **title** – Course title
* **duration** – Duration of the course
* **fee** – Course fee

---

## REST API Endpoints

| Method | Endpoint                  | Description             |
| ------ | ------------------------- | ----------------------- |
| POST   | `/courses`                | Add a new course        |
| GET    | `/courses`                | View all courses        |
| GET    | `/courses/{id}`           | Get course by ID        |
| PUT    | `/courses/{id}`           | Update course           |
| DELETE | `/courses/{id}`           | Delete course           |
| GET    | `/courses/search/{title}` | Search courses by title |

---

## ResponseEntity Usage

The API returns proper HTTP responses such as:

* **200 OK** – Successful request
* **201 CREATED** – Course created successfully
* **404 NOT FOUND** – Course not found
* **400 BAD REQUEST** – Invalid request

---

## Testing

All API endpoints were tested using **Postman** for both valid and invalid cases.

---

## Author

Student project demonstrating **Spring Boot REST CRUD operations using ResponseEntity**.
