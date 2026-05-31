# 💱 Currency Converter

A full-stack Currency Converter application developed using **Java**, **Spring Boot**, **HTML**, **CSS**, and **JavaScript**. The application allows users to convert currencies using a REST API and a responsive web interface.

## 🚀 Features

* Convert currencies instantly
* Real-time API communication
* User-friendly interface
* RESTful API built with Spring Boot
* Cross-Origin Resource Sharing (CORS) support
* Exception handling and validation
* Responsive design

## 🛠️ Tech Stack

### Backend

* Java 17
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

## 🎯 Functionalities

### Currency Conversion

* Convert USD to INR
* Convert INR to USD
* Convert EUR to GBP
* Convert multiple supported currencies

### API Integration

* Spring Boot REST API
* JSON Request and Response Handling
* Backend-Frontend Communication

### User Interface

* Responsive Design
* Easy Currency Selection
* Instant Conversion Results

## 📸 Screenshots

### Currency Converter Home Page

![Home Page](screenshots/home-page.png)

### Currency Conversion Result

![Conversion Result](screenshots/conversion-result.png)

### API Testing Using Thunder Client

![API Test](screenshots/api-test.png)

### Project Structure

![Project Structure](screenshots/project-structure.png)

## 🎯 Future Enhancements

* Real-Time Exchange Rate API Integration
* Conversion History Tracking
* Dark Mode Support
* Currency Search and Filtering
* Exchange Rate Charts
* Multi-Currency Conversion
* Cloud Deployment

## 👨‍💻 Author

**Roja Dandu**

* GitHub: https://github.com/rojadandu123
* LinkedIn: https://www.linkedin.com/in/poornima-d-9a4b65369/

## 📜 License

This project is developed for educational and portfolio purposes.
