# Java Remote Calculator

A distributed calculator application using Java RMI with a modern GUI interface.

![Calculator Interface](images/Screenshot%202023-12-03%20235040.png)

## Features

- **Remote Method Invocation (RMI)** for client-server communication
- **Modern Dark Theme** using FlatLaf
- **Mathematical Expression Evaluation** with Groovy
- **Distributed Architecture** for scalable calculations

## Quick Start

### 1. Build Projects
```bash
# Build server
cd calculatorServer && mvn clean package

# Build client  
cd calculatorClient && mvn clean package
```

### 2. Run Application
```bash
# Start server (port 9999)
java -jar calculatorServer/target/calculatorServer-1.0-SNAPSHOT.jar

# Start client
java -jar calculatorClient/target/calculatorClient-1.0-SNAPSHOT.jar
```

## Screenshots

### Calculator Interface
![Main Interface](images/Screenshot%202023-12-03%20235134.png)

### Mathematical Operations
![Operations](images/Screenshot%202023-12-03%20235209.png)

### Results Display
![Results](images/Screenshot%202023-12-03%20235232.png)

## Architecture

```
┌─────────────────┐    RMI     ┌─────────────────┐
│  Calculator     │◄──────────►│  Calculator     │
│  Client (GUI)   │  Port 9999 │  Server (RMI)   │
│  - FlatLaf UI   │            │  - Groovy Eval  │
│  - Swing        │            │  - RMI Registry │
└─────────────────┘            └─────────────────┘
```

## Project Structure

```
java-remote-calculator/
├── calculatorServer/     # RMI Server
├── calculatorClient/     # GUI Client  
└── images/              # Screenshots
```

## Requirements

- Java 17+
- Maven 3.6+

## Technical Stack

- **Server**: Java RMI + Groovy
- **Client**: Swing + FlatLaf
- **Communication**: RMI on port 9999