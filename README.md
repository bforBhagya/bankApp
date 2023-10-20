# Bank App 🏦💰

## 📒 Overview

This repository contains a Java-based Bank Application built using the Spring Boot framework. 
The Bank App is designed to provide basic banking functionality such as creating accounts, making deposits, withdrawals, and transferring funds between accounts. 
This README file will guide you through the setup, usage, and key components of the Bank App.

## 📒 Table of Contents

- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
  - [Clone the Repository](#clone-the-repository)
  - [Build the Application](#build-the-application)
- [Configuration](#configuration)
- [Usage](#usage)
  - [Running the Application](#running-the-application)
  - [API Endpoints](#api-endpoints)
- [Testing](#testing)
- [Contributing](#contributing)
- [License](#license)

## ⚙️ Prerequisites

Before you get started with the Bank App, make sure you have the following prerequisites installed on your system:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) - Java 17.
- [Maven](https://maven.apache.org/download.cgi) - A build automation and project management tool.
- [Git](https://git-scm.com/downloads) - Version control system for cloning the repository.

## ▶️ Getting Started

### 💽 Clone the Repository

Use Git to clone the repository to your local machine:

```bash
git clone https://github.com/bforBhagya/bank-app.git
```

### 🛠️ Build the Application

1. Navigate to the project directory:

```bash
cd bank-app
```

2. Build the application using Maven:

```bash
mvn clean install
```

This will download dependencies and create an executable JAR file.

## 🎛️ Configuration
Follow these steps to configure the Bank App using the application.yml file:

  Access the application.yml File: Locate the application.yml file in your Bank App project. It is typically found in the src/main/resources directory.

  Open the application.yml File: Use your preferred text editor or integrated development environment (IDE) to open the application.yml file.

  Add Email Settings:

  To configure email functionality, you need to provide the following email settings:
    yml
    spring:
      mail:
        username: your-email@example.com
        password: your-email-password

  Replace your-email@example.com with the email address from which you want to send notifications, and your-email-password with the corresponding email password.

  Save the File: After adding the email settings, save the application.yml file.

Video Tutorial - https://www.youtube.com/watch?v=nuD6qNAurVM&t=2s

For a visual guide on configuring the application.yml file, you can refer to this YouTube video. The video provides step-by-step instructions on configuring the Bank App's email settings.
With the email settings properly configured, the Bank App will be able to send email notifications for various account activities, enhancing the user experience and communication.
Please ensure that you keep your email credentials secure and do not share them publicly or store them in version-controlled repositories for security reasons.

## ◽ Usage

### 🧑‍💻 Running the Application

To run the Bank App, use the following command:

```bash
java -jar target/bank-app-1.0.0.jar
```

Replace `bank-app-1.0.0.jar` with the actual JAR file generated during the build.

### 🔚 API Endpoints

The Bank App provides the following API endpoints for interacting with the application:

- `POST /api/user` - Create a new user account.
- `POST /api/user/balanceEnquiry` - Given an account number to check how much the user has.
- `POST /api/accounts/nameEnquiry` - Given an account number to check user's full name.
- `POST /api/transfer` - Transfer funds between accounts.

You can use tools like `curl`, [Postman](https://www.postman.com/), or your web browser to interact with these endpoints.

### 📖 Swagger UI Documentation

You can access the Swagger UI documentation for the Bank App by clicking on the following link:

[Swagger UI Documentation](http://localhost:8080/swagger-ui/index.html#/)
If this doesn't work copy this URL and replace YOUR PORT with PORT, then paste and run on your browser : http://localhost:PORT/swagger-ui/index.html#/

## 💯 Testing

The Bank App includes unit tests to ensure the correctness of its functionality. You can run the tests using Maven:

```bash
mvn test
```

Please make sure that all tests pass before making any modifications to the code.

## 🤝 Contributing

If you'd like to contribute to the Bank App, please follow these steps:

1. Fork the repository to your GitHub account.
2. Create a new branch for your feature or bug fix.
3. Make your changes and commit them.
4. Create a pull request to the original repository.

## 🪪 License

This Bank App is open-source software released under the [MIT License](LICENSE). You are free to use, modify, and distribute it as per the terms of the license.

Thank you for using the Bank App! If you have any questions or need further assistance, please feel free to reach out to the project maintainers.
