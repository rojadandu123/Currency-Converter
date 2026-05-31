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

<img width="577" height="481" alt="image" src="https://github.com/user-attachments/assets/c41318e5-95b4-4a63-b066-68071fe41f7b" />


### Currency Conversion Result

<img width="565" height="582" alt="image" src="https://github.com/user-attachments/assets/385f2b36-d15a-45c1-95d5-f20d5517a358" />


## 🎯 Future Enhancements

* Real-Time Exchange Rate API Integration
* Conversion History Tracking
* Dark Mode Support
* Currency Search and Filtering
* Exchange Rate Charts
* Multi-Currency Conversion



* GitHub: https://github.com/rojadandu123
* LinkedIn: https://www.linkedin.com/in/poornima-d-9a4b65369/

## 📜 License

This project is developed for educational and portfolio purposes.
