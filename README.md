[![Download Releases](https://img.shields.io/badge/Download-Releases-blue?style=for-the-badge)](https://github.com/yogeshy97/ECommerceAPI/releases)

# ECommerceAPI
A simple and extensible RESTful e-commerce API built with Java 21 and Spring Boot. It supports product, category, and supplier management. The project uses a clean layered architecture and DTOs for data transfer.

## 📚 What this is
This repository provides a backend service that stores and serves e-commerce data. It does not include a storefront user interface. You can run the service on your computer and use a browser or a tool to see and test the API.

Key capabilities:
- Manage products (create, read, update, delete)
- Manage categories
- Manage suppliers
- Clean separation between data, business logic, and web layer
- Uses Java 21 and Spring Boot

Topics: api-rest, ecommerce, hibernate, ioc, ioc-container, java, jpa, layered-architecture, rest-api, restful-api, spring, spring-boot

## 📦 Features
- REST endpoints for products, categories, and suppliers
- JSON input and output
- DTOs to control what the API sends and receives
- Default settings that work on a single machine
- Small footprint suitable for development and local testing

## 🖥️ System Requirements
These requirements let the application run on a typical laptop or desktop.

- Operating system: Windows 10 or later, macOS 10.15 or later, or a recent Linux distro
- Java: Java 21 (OpenJDK / Temurin / AdoptOpenJDK) installed
- RAM: 2 GB free
- Disk space: 200 MB free
- Network: Local machine access to port 8080 (default)
- Optional: A web browser (Chrome, Firefox, Edge) and a tool like Postman or curl to send requests

If you do not have Java 21, the steps below show where to get it and how to check.

## 🚀 Getting Started (quick plan)
1. Visit the releases page to download the app.
2. Install Java 21 if your computer does not have it.
3. Download the release file (usually a .jar).
4. Run the .jar file.
5. Open a browser or tool to test the API at http://localhost:8080

## 📥 Download & Install
Action: visit this page to download.

Download link (open it now):
https://github.com/yogeshy97/ECommerceAPI/releases

How to pick the right file
- Look for a file named like ECommerceAPI-<version>.jar or a file named app.jar.
- If you see files for different platforms, pick the one marked as "jar" or "Java".
- Download the file to a folder you can find, for example Downloads or Desktop.

Step-by-step
1. Click the releases badge at the top or open:
   https://github.com/yogeshy97/ECommerceAPI/releases
2. Find the latest release entry.
3. Under "Assets", click the .jar file to download it.
4. Save the file to a folder you will use to run the app.

Repeat link for convenience:
https://github.com/yogeshy97/ECommerceAPI/releases

## 🧭 Java install and check
If you already have Java 21, skip to "Run the app".

Windows
1. Open Command Prompt (press Windows key, type cmd, press Enter).
2. Type:
   ```
   java -version
   ```
3. Expected output includes "21" in the version string. Example:
   ```
   java version "21" 2023-09-19
   ```
4. If the command fails, install Java 21 from Temurin:
   https://adoptium.net (choose Temurin 21)

macOS / Linux
1. Open Terminal.
2. Type:
   ```
   java -version
   ```
3. If you see Java 21, proceed. If not, install Java 21 from Temurin:
   https://adoptium.net (choose Temurin 21)

After installation, re-run `java -version` to confirm.

## ▶️ Run the app
Use the folder where you downloaded the jar file.

Windows
1. Open Command Prompt.
2. Change to the folder with the file:
   ```
   cd C:\Users\<YourName>\Downloads
   ```
3. Run the jar:
   ```
   java -jar ECommerceAPI-1.0.0.jar
   ```
   (Replace the file name with the actual file you downloaded.)
4. You will see log lines that show Spring Boot starting and the port in use. Look for a line with "Started" and "port 8080".

macOS / Linux
1. Open Terminal.
2. Change to the download folder:
   ```
   cd ~/Downloads
   ```
3. Run the jar:
   ```
   java -jar ECommerceAPI-1.0.0.jar
   ```

Run notes
- The app listens on port 8080 by default.
- If the port is busy, you can run with a different port:
  ```
  java -jar ECommerceAPI-1.0.0.jar --server.port=8081
  ```

## 🔎 Test the API
Use a browser, curl, or Postman.

Open your browser and visit:
http://localhost:8080/

Common endpoints (use these as examples)
- GET all products:
  http://localhost:8080/api/products
- GET a product by id:
  http://localhost:8080/api/products/{id}
- GET all categories:
  http://localhost:8080/api/categories
- GET all suppliers:
  http://localhost:8080/api/suppliers
- Health check (if provided):
  http://localhost:8080/actuator/health

Using curl (example)
```
curl http://localhost:8080/api/products
```
This command shows the JSON the API returns.

## 🛠️ Common issues and fixes
"java -version" returns an older Java
- Install Java 21 and set it as default.
- Restart your terminal after install.

Error: Address already in use
- Another app uses port 8080.
- Run the jar with a different port:
  ```
  java -jar ECommerceAPI-1.0.0.jar --server.port=8082
  ```

The API returns 404 on a path
- Check the path spelling.
- Confirm the app started without errors in the terminal.

App does not start, shows errors in log
- Look for lines marked ERROR or Exception.
- Copy the error text and search the repository Issues or the web.
- If you cannot find a solution, share the error text when you ask for help.

JSON response looks complex
- The API sends and receives JSON. Use a browser extension or Postman to view it more clearly.

## ❓ FAQ
Q: Do I need a database?
A: The release often includes an embedded database or an in-memory database for local use. The app works out of the box for testing. For production, you will need a real database and a small configuration change.

Q: Can I run this on a server?
A: Yes. Use the same jar on a server with Java 21. Configure database and ports as needed.

Q: Is there a web UI?
A: This project provides a backend API. You can build a frontend that calls the endpoints.

Q: How do I stop the app?
A: In the terminal, press Ctrl+C to stop the running process.

## 🤝 Get help
- Open an issue on the repository if you find a bug or need change.
- When you open an issue, include:
  - Your operating system (Windows, macOS, Linux)
  - Java version (`java -version` output)
  - The steps you followed
  - Any error text you saw

Repository page:
https://github.com/yogeshy97/ECommerceAPI

## 🧾 License & contributions
- Check the license file in the repo for reuse rules.
- You can report bugs or suggest improvements via Issues.
- If you know how to code, create a pull request with your change.

Thank you for trying ECommerceAPI.