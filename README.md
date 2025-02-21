# Spring Boot Microservices

![Spring Boot](https://img.shields.io/badge/SpringBoot-6DB33F?logo=springboot&logoColor=fff&style=for-the-badge)
![Kafka](https://img.shields.io/badge/Apache%20Kafka-231F20?logo=apachekafka&logoColor=fff&style=for-the-badge)
![Kubernetes](https://img.shields.io/badge/kubernetes-%23326ce5.svg?style=for-the-badge&logo=kubernetes&logoColor=white)
![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)
![Prometheus](https://img.shields.io/badge/Prometheus-E6522C?logo=prometheus&logoColor=fff&style=for-the-badge)
![Grafana](https://img.shields.io/badge/Grafana-F46800?logo=grafana&logoColor=fff&style=for-the-badge)
![CI/CD](https://img.shields.io/badge/CI%2FCD-4285F4?logo=githubactions&logoColor=fff&style=for-the-badge)

## Table of Contents
* 💻 [Description](#description)
* 🏛️ [Technology Architecture](#architecture-diagram)
* 🛠️ [Prerequisites](#prerequisites)
* 🚀 [Getting Started](#getting-started)  
* 📧 [Contact](#contact)

## Description
- **Project Description**: Microservices-based E-commerce System

  - This project is a highly scalable **Spring Boot Microservices** architecture designed for an e-commerce system. The architecture leverages **Kafka** for event-driven communication and **Prometheus + Grafana** for monitoring and alerting.

### **Key Features:**
- **Microservices Communication:**
  - Services communicate asynchronously via **Kafka**.
- **User Authentication & Registration:**
  - Users can register, log in, and manage their accounts securely.
- **Order & Payment Processing:**
  - Users can place orders and make payments using online payment gateways.
  - Payments are processed securely with real-time status updates.
- **Inventory Management:**
  - The **Inventory Service** ensures product availability before order confirmation.
  - Updates stock levels dynamically after every purchase.
- **Notification System:**
  - Users receive real-time notifications for order updates and stock availability.
  - Notifications are sent via email or in-app messaging.
- **Real-time Monitoring:**
  - **Prometheus** collects service metrics.
  - **Grafana** visualizes system performance.
- **CI/CD Pipeline:**
  - **GitHub Actions** automates testing and deployment.
  - **Kubernetes** orchestrates microservices deployment.

## Technology Architecture
![image](https://github.com/user-attachments/assets/647c1fb9-3e23-4b3a-bd4a-56f3a0b65163)

## 🛠️ Prerequisites
What you need to run the project:
- Install **Docker** and **Kubernetes (Minikube or Kind)**
- Set up **Kafka** using Docker or Kubernetes Helm Chart
- Install **Prometheus**, **Grafana**, and **AlertManager**
- Clone the repository and set up your `.env` file

## 🚀 Getting Started

## How to run the application using Docker

1. Run `mvn clean package -DskipTests` to build the applications and create the docker image locally.
2. Run `docker-compose up -d` to start the applications.

## How to run the application without Docker

1. Run `mvn clean verify -DskipTests` by going inside each folder to build the applications.
2. After that run `mvn spring-boot:run` by going inside each folder to start the applications.

## 📧 Contact
<p>Don't hesitate to contact me if you have any questions.</p>
<div style="display: flex; gap: 10px; align-items: center;">
    <a href="mailto:kiennguyentrung408@gmail.com" target="_blank" style="text-decoration: none;">
        <img src="https://img.icons8.com/color/48/000000/gmail--v2.png" alt="Email" height="30" width="40">
    </a> 
    <a href="https://www.linkedin.com/in/kien-nguyentrung-a62b89309/" target="_blank">
        <img src="https://img.icons8.com/?size=100&id=xuvGCOXi8Wyg&format=png&color=000000" alt="LinkedIn" height="30" width="40">
    </a>
</div>
<a href="#top" style="transition: all .25s ease-in-out; position: fixed; bottom: 0; right: 0; display: inline-flex; cursor: pointer; align-items: center; justify-content: center; margin: 0 2em 2em 0; padding: .25em; width: 8em; height: 2em; background-color: #f0f0f0; text-align: center;">
  🔼 Back to top
</a>



