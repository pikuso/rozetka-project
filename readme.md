# 🎯 Rozetka UI Automation Framework  
Automated Testing with Java + Maven + Selenide + TestNG

This project represents an automated UI testing framework for the Rozetka online store — a large e-commerce platform where users commonly interact with product search, categories, product pages, and the shopping cart.

The goal of the project is to build a stable, scalable, and structured automation solution using the Page Object Model (POM) and modern tooling.

---

## 🧩 Project Purpose

Large e-commerce platforms often suffer from:

- incorrect search behavior  
- unstable navigation  
- issues with the shopping cart  
- dynamic content instability  
- Cloudflare anti-bot protection blocking automation  

According to the project presentation, the system is designed to improve stability and reduce critical user-facing defects by automating key UI flows :contentReference[oaicite:1]{index=1}.

---

## 📐 Architecture Overview

The framework is built using the **Page Object Model** and consists of the following modules:


### 🔧 Components  
- **Driver layer:** Selenide (main tool), Playwright (optional alternative)  
- **Pages layer:** Independent page modules  
- **Tests layer:** Functional UI tests  
- **Utils:** Configuration & helpers

(Architecture description corresponds to slide 4 of the presentation.) :contentReference[oaicite:2]{index=2}

---

## 🧪 Implemented Test Scenarios

The automated system includes the following test flows:

- opening product categories  
- searching for products  
- opening a product card  
- adding an item to the shopping cart  
- verifying elements on product pages  
- applying filters  
- navigation through the menu

These are aligned with the results section described in the project presentation :contentReference[oaicite:3]{index=3}.

---

## ⚡ Cloudflare Handling

Rozetka uses Cloudflare anti-bot protection, which blocks direct automation tools.

In this framework:

- tests automatically **skip** when Cloudflare appears  
- this prevents false failures  
- ensures stable and predictable test runs  
- alternative bypass via Playwright was explored (based on slides 4 and 8) :contentReference[oaicite:4]{index=4}

This makes the project fully suitable for demonstration, even when the production site blocks automated traffic.

---

## 🛠 Technology Stack

- **Java 17**  
- **Selenide** — simplified browser interaction & auto-waits  
- **TestNG** — test runner, annotations, grouping  
- **Maven** — build & dependency management  
- **Git / GitHub** — version control  
- **Playwright** — optional Cloudflare bypass tool (experimental)  

Tools are justified on page 8 of the project presentation :contentReference[oaicite:5]{index=5}.

---

## 🚀 Project Features

- Automated UI actions for typical customer behavior  
- Modular and scalable Page Object architecture  
- Ability to extend tests for new categories and business flows  
- Ready for integration with CI/CD systems  
- Stable test execution despite Cloudflare restrictions  
- Clean structure and maintainable codebase  

These features correspond to slides 9–10 in the presentation. :contentReference[oaicite:6]{index=6}

---

## 📦 Project Structure

rozetka-project/
├── pom.xml
├── README.md
└── src/
└── test/
└── java/
├── base/
├── pages/
└── tests/

---

## 🏁 Conclusion

The project successfully demonstrates:

- setup of an automation framework using Java + Maven + Selenide  
- creation of stable UI tests for key Rozetka functionalities  
- scalable architecture that supports future expansion  
- real-world challenges with Cloudflare and ways to bypass them  
- practical value of automated testing for improving web application quality  

(See slide 11 for detailed conclusions.) :contentReference[oaicite:7]{index=7}

---

## 👩‍💻 Author  
**Polina**

---

# ⭐ If you like this project, consider starring the repository!

