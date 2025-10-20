# Java Remote Calculator

A distributed calculator application built with Java RMI (Remote Method Invocation) that allows clients to perform mathematical calculations on a remote server.

## Architecture

This project consists of two main components:

- **Calculator Server**: RMI server that processes mathematical expressions
- **Calculator Client**: GUI application with a modern dark theme interface

## Features

- Remote calculation using Java RMI
- Modern GUI with FlatLaf dark theme
- Mathematical expression evaluation using Groovy
- Client-server architecture for distributed computing
- Support for complex mathematical expressions

## Prerequisites

- Java 17 or higher
- Maven 3.6+

## Project Structure

```
java-remote-calculator/
├── calculatorServer/          # RMI Server module
│   ├── src/main/java/
│   │   └── com/mycompany/calculator/
│   │       ├── CalculatorServer.java    # Main server class
│   │       └── Calculate.java           # RMI implementation
│   └── pom.xml
├── calculatorClient/          # GUI Client module
│   ├── src/main/java/
│   │   └── com/mycompany/calculatorclient/
│   │       ├── CalculatorClient.java    # Main client class
│   │       ├── Controllers/             # Application controllers
│   │       └── Views/                   # GUI components
│   └── pom.xml
└── images/                    # Application screenshots
```

## Building the Project

### Build Server
```bash
cd calculatorServer
mvn clean package
```

### Build Client
```bash
cd calculatorClient
mvn clean package
```

## Running the Application

### 1. Start the Server
```bash
cd calculatorServer/target
java -jar calculatorServer-1.0-SNAPSHOT.jar
```

The server will start on port 9999 and display:
```
enregistrement de l'objet avec l'url
serveur lance
attete d'invocations
```

### 2. Start the Client
```bash
cd calculatorClient/target
java -jar calculatorClient-1.0-SNAPSHOT.jar
```

Or run the executable:
```bash
cd calculatorClient/target
client.exe
```

## Usage

1. Launch the server first
2. Start the client application
3. Enter mathematical expressions in the calculator interface
4. The client sends expressions to the server for evaluation
5. Results are displayed in the client GUI

## Technical Details

### Server Components
- **CalculatorServer**: Main server class that creates RMI registry on port 9999
- **Calculate**: Implements the remote interface using Groovy for expression evaluation
- **RMI Registry**: Binds the calculator service at `rmi://0.0.0.0:9999/expression`

### Client Components
- **CalculatorClient**: Main client application with FlatLaf dark theme
- **GUI Framework**: Swing with modern FlatLaf look and feel
- **RMI Client**: Connects to remote calculator service

### Dependencies
- **Groovy**: For mathematical expression evaluation
- **FlatLaf**: Modern look and feel for Swing applications
- **Java RMI**: For remote method invocation

## Screenshots

The `images/` directory contains application screenshots showing the calculator interface and functionality.

## Configuration

- **Server Port**: 9999 (configurable in CalculatorServer.java)
- **RMI URL**: `rmi://0.0.0.0:9999/expression`
- **Java Version**: 17
- **Maven Version**: Compatible with Maven 3.6+

## Development

To modify or extend the application:

1. Server logic is in `Calculate.java`
2. Client GUI is in the `Views/` package
3. Controllers are in the `Controllers/` package
4. Shared interfaces should be in a separate shared module

## License

This project is available under the default license template.