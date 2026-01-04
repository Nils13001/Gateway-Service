
# Gateway Service — E-Commerce Microservices Architecture

**Status:** Foundations (Setup Only)  
**Language:** Java (Spring Boot 4.x)  
**OS:** Windows (No Docker in Sprint 1)  
**Epic:** MSA E01 — Polyglot Event Driven E-Commerce Microservices  

---

## 📌 Overview
`gateway-service` is part of a polyglot microservices architecture for an e-commerce platform.  
This skeleton provides:
- Health endpoint (`GET /api/gateway/health`)
- **Swagger/OpenAPI UI** for API documentation (basic setup implemented)
- Basic Spring Boot configuration with placeholders for MySQL and Liquibase (to be implemented in **MSA S02**)

---

## ✅ Quickstart (Windows)
**Prerequisites:**
- JDK 23+
- Maven 3.9+
- Git installed

**Run locally:**
```bash
mvn -q clean package
mvn -q spring-boot:run
