# 💱 Currency Converter

A full-stack Currency Converter application developed using **Spring Boot**, **Java**, **HTML**, **CSS**, and **JavaScript**. This application enables users to convert currencies through a REST API and a user-friendly web interface.

## 🚀 Features

* Currency conversion between multiple currencies
* RESTful API built with Spring Boot
* Responsive frontend using HTML, CSS, and JavaScript
* Clean and modern user interface
* Cross-Origin Resource Sharing (CORS) support
* Error handling and exception management
* Modular and scalable project structure

## 🛠️ Tech Stack

### Backend

* Java 
* Spring Boot
* Maven
* REST API

### Frontend

* HTML
* CSS
* JavaScript

## 📂 Project Structure

```text
currency-converter
│
├── backend
│   ├── controller
│   │   └── CurrencyController.java
│   ├── service
│   │   └── CurrencyService.java
│   ├── model
│   │   ├── ConversionRequest.java
│   │   ├── ConversionResponse.java
│   │   └── ExchangeRateResponse.java
│   ├── config
│   │   └── CacheConfig.java
│   ├── exception
│   │   └── GlobalExceptionHandler.java
│   └── CurrencyConverterApplication.java
│
├── frontend
│   ├── index.html
│   ├── style.css
│   └── script.js
│
└── README.md
```

## 🔌 API Endpoint

### Convert Currency

**POST**

```http
http://localhost:8080/api/convert
```

### Request

```json
{
  "from": "USD",
  "to": "INR",
  "amount": 100
}
```

### Response

```json
{
  "convertedAmount": 8300.0
}
```

## ▶️ How to Run

### Backend

```bash
mvn spring-boot:run
```

### Frontend

1. Open the `frontend` folder.
2. Open `index.html` using Live Server in VS Code.
3. Enter the amount and currencies.
4. Click **Convert**.

## 📸 Screenshots

Add screenshots here after running the project.

### Home Page

<img width="733" height="596" alt="image" src="https://github.com/user-attachments/assets/244c3f12-5fcf-4341-812f-1313f8a5f3c9" />


### Conversion Result

<img width="682" height="662" alt="image" src="https://github.com/user-attachments/assets/21896e3e-f2f1-4f7b-9f62-cbcb53a3caa6" />


## 🎯 Future Enhancements

* Real-time exchange rates API integration
* Conversion history
* Dark mode
* Currency search feature
* Exchange rate charts
* Multi-currency support

## 📜 License

This project is developed for educational and portfolio purposes.
