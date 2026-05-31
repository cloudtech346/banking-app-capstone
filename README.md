# Banking Application CI/CD Capstone Project

## Project Overview

This project demonstrates a complete CI/CD pipeline deployment of a Spring Boot Banking Application using:

- GitHub
- Jenkins
- Maven
- AWS EC2
- Spring Boot
- Linux

The application is automatically built and deployed through Jenkins Pipeline after code integration.

---

## Architecture

Developer → GitHub → Jenkins Pipeline → Maven Build → EC2 Deployment → Spring Boot Application

---

## Features

- Health Check API
- Account Balance API
- Jenkins Automated Pipeline
- Maven Build Automation
- EC2 Deployment
- GitHub Source Control

---

## Tech Stack

| Technology | Purpose |
|------------|---------|
| Java 21 | Backend |
| Spring Boot | Application Framework |
| Maven | Build Tool |
| Jenkins | CI/CD |
| GitHub | Source Control |
| AWS EC2 | Deployment Server |
| Linux | Operating System |

---

## API Endpoints

### Health Endpoint

GET

http://<EC2-PUBLIC-IP>:8081/bank/health

Response:

Banking Application Running

---

### Balance Endpoint

GET

http://<EC2-PUBLIC-IP>:8081/bank/balance

---

## Jenkins Pipeline Stages

1. Git Checkout
2. Maven Build
3. Application Deployment
4. Service Validation

---

## Deployment Verification

Application successfully deployed on AWS EC2 using Jenkins Pipeline.

---

## Author

Gaurav Shukla
DevOps | Cloud | AWS | Jenkins | CI/CD
