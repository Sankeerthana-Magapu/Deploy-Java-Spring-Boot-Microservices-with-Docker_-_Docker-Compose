# 🚀 Deploy Java Spring Boot Microservices with Docker & Docker Compose

A production-style microservices project built using **Java Spring Boot**, **Docker**, and **Docker Compose**. The project demonstrates how multiple Spring Boot services can communicate with each other while running inside Docker containers.

## 📌 Project Overview

This project consists of two independent Spring Boot microservices:

- **Ledger Service** – Manages accounts and ledger entries.
- **Transfer Service** – Handles fund transfers and communicates with the Ledger Service.

Each service is containerized using Docker and deployed together using Docker Compose.

---

# 🏗️ Architecture

```
                    +----------------------+
                    |      Client/API      |
                    +----------+-----------+
                               |
                               |
                +--------------v--------------+
                |     Transfer Service        |
                |      Spring Boot API        |
                +--------------+--------------+
                               |
                      REST Communication
                               |
                +--------------v--------------+
                |      Ledger Service         |
                |      Spring Boot API        |
                +--------------+--------------+
                               |
                           Database 
```

---

# ✨ Features

- Spring Boot Microservices
- RESTful APIs
- Dockerized Services
- Docker Compose Deployment
- Inter-service Communication
- Maven Build
- Exception Handling
- DTO Implementation
- Layered Architecture
- Easy Deployment

---

# 🛠️ Tech Stack

| Technology | Version |
|------------|----------|
| Java | 17 |
| Spring Boot | 3.x |
| Maven | Latest |
| Docker | Latest |
| Docker Compose | Latest |
| REST API | Spring Web |
| Git | Version Control |

---

# 📁 Project Structure

```
ledger-system
│
├── ledger-service-main
│   ├── Dockerfile
│   ├── pom.xml
│   └── src
│
├── transfer-service-main
│   ├── Dockerfile
│   ├── pom.xml
│   └── src
│
├── docker-compose.yml
└── README.md
```

---

# ⚙️ Prerequisites

Before running this project, install:

- Java 17+
- Maven
- Docker Desktop
- Docker Compose
- Git

Verify installation:

```bash
java -version
mvn -version
docker --version
docker compose version
```

---

# 📥 Clone Repository

```bash
git clone https://github.com/Sankeerthana-Magapu/Deploy-Java-Spring-Boot-Microservices-with-Docker_-_Docker-Compose.git
```

Go to project directory:

```bash
cd Deploy-Java-Spring-Boot-Microservices-with-Docker_-_Docker-Compose
```

---

# 🐳 Build Docker Images

```bash
docker compose build
```

---

# ▶️ Run the Application

```bash
docker compose up
```

Run in detached mode:

```bash
docker compose up -d
```

---

# 🛑 Stop Containers

```bash
docker compose down
```

---

# 🔄 Rebuild Containers

```bash
docker compose down
docker compose build
docker compose up
```

---

# 📦 Maven Build

Ledger Service

```bash
cd ledger-service-main
mvn clean install
```

Transfer Service

```bash
cd transfer-service-main
mvn clean install
```

---

# 🌐 REST API

## Ledger Service

Example endpoints

```
POST /accounts
GET /accounts
GET /ledger
```

---

## Transfer Service

Example endpoints

```
POST /transfer
GET /transfer/{id}
```

---

# 🐳 Docker Commands

List containers

```bash
docker ps
```

List images

```bash
docker images
```

View logs

```bash
docker logs <container_name>
```

Stop all containers

```bash
docker compose down
```

Restart

```bash
docker compose up
```

---

# 📸 Screenshots

### Docker Containers Running

> "D:\One Drive\OneDrive\Pictures\Screenshots\Screenshot 2026-07-16 192107.png"

---

### API Testing (Postman)

> "D:\One Drive\OneDrive\Pictures\Screenshots\Screenshot 2026-07-16 232215.png"

---

### Swagger UI

> "D:\One Drive\OneDrive\Pictures\Screenshots\Screenshot 2026-07-16 234335.png"

---

# 🚀 Future Improvements

- Spring Cloud Gateway
- Eureka Service Discovery
- Config Server
- JWT Authentication
- Kubernetes Deployment
- CI/CD using GitHub Actions
- Monitoring with Prometheus & Grafana
- Logging with ELK Stack

---

# 🎯 Learning Outcomes

This project demonstrates:

- Microservices Architecture
- Spring Boot Development
- Docker Containerization
- Docker Compose Orchestration
- REST API Development
- Inter-Service Communication
- Maven Project Management
- Git & GitHub Workflow

---

# 👩‍💻 Author

**Sankeerthana Magapu**

GitHub:
https://github.com/Sankeerthana-Magapu

LinkedIn:
www.linkedin.com/in/sankeerthana-magapu-2177b9279

---

# ⭐ Support

If you found this project useful:

⭐ Star this repository

🍴 Fork it

📝 Contribute

---

## License

This project is developed for learning and educational purposes.
