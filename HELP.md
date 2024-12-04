# **Support App Backend Help Guide**

Welcome to the **Support App Backend**. This document provides information about the application setup and usage.

---

## **Overview**

This Spring Boot application serves as the backend for a simple support management system. It allows two administrators to:
- Register people who need support.
- Manage their personal details.
- Track donations made to them.

The application uses **AWS DynamoDB** for data storage and supports RESTful APIs for CRUD operations.

---

## **Key Features**
1. Add, retrieve, update, and delete information about individuals in need of support.
2. Record donations with details:
    - Amount.
    - Date of donation.
    - Name of the person who added the donation.
3. Secure, scalable backend powered by AWS.

---

## **Getting Started**

### **Prerequisites**
1. **Java**: JDK 17 or higher.
2. **Maven**: Installed and configured.
3. **AWS CLI**: Installed and configured with an IAM user having DynamoDB permissions.
4. **DynamoDB Table**:
    - **Name**: `Person`
    - **Partition Key**: `id` (String)

### **Setup**
1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd support-app-backend
