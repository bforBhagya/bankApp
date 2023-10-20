# Bank App README

## Overview

This repository contains a Java-based Bank Application built using the Spring Boot framework. 
The Bank App is designed to provide basic banking functionality such as creating accounts, making deposits, withdrawals, and transferring funds between accounts. 
This README file will guide you through the setup, usage, and key components of the Bank App.

## Table of Contents

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

## Prerequisites

Before you get started with the Bank App, make sure you have the following prerequisites installed on your system:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) - Java 17.
- [Maven](https://maven.apache.org/download.cgi) - A build automation and project management tool.
- [Git](https://git-scm.com/downloads) - Version control system for cloning the repository.

## Getting Started

### Clone the Repository

Use Git to clone the repository to your local machine:

```bash
git clone https://github.com/bforBhagya/bank-app.git
```

### Build the Application

1. Navigate to the project directory:

```bash
cd bank-app
```

2. Build the application using Maven:

```bash
mvn clean install
```

This will download dependencies and create an executable JAR file.

## Configuration

The Bank App can be configured using the `application.yaml` file. You can modify database settings, server port, and other configuration parameters in this file.

## Usage

### Running the Application

To run the Bank App, use the following command:

```bash
java -jar target/bank-app-1.0.0.jar
```

Replace `bank-app-1.0.0.jar` with the actual JAR file generated during the build.

### API Endpoints

The Bank App provides the following API endpoints for interacting with the application:

- `POST /api/user` - Create a new user account.
- `POST /api/user/balanceEnquiry` - Given an account number to check how much the user has.
- `POST /api/accounts/nameEnquiry` - Given an account number to check user's full name.
- `POST /api/transfer` - Transfer funds between accounts.

You can use tools like `curl`, [Postman](https://www.postman.com/), or your web browser to interact with these endpoints.

## Testing

The Bank App includes unit tests to ensure the correctness of its functionality. You can run the tests using Maven:

```bash
mvn test
```

Please make sure that all tests pass before making any modifications to the code.

## Contributing

If you'd like to contribute to the Bank App, please follow these steps:

1. Fork the repository to your GitHub account.
2. Create a new branch for your feature or bug fix.
3. Make your changes and commit them.
4. Create a pull request to the original repository.

## License

This Bank App is open-source software released under the [MIT License](LICENSE). You are free to use, modify, and distribute it as per the terms of the license.

Thank you for using the Bank App! If you have any questions or need further assistance, please feel free to reach out to the project maintainers.
