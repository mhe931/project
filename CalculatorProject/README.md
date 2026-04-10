# Smart Calculator System - Applied Software Testing Project 🧮

This repository contains the "Smart Calculator System" (Project A), developed as part of the **Applied Software Testing Makeup Project** at the University of Vaasa. The project showcases robust functionality and rigorous testing methodologies, strictly utilizing **Java, JUnit 5, and Maven**.

---

## 🎯 Project Objectives

1. **System Implementation**: Build a functional calculator safely handling integer addition, subtraction, multiplication, and edge-case safeguarded division (handling divide-by-zero properly).
2. **Black-Box Testing (Section 4)**: Implement Equivalence Partitioning (EP) and Boundary Value Analysis (BVA) for integer boundaries (e.g., Integer.MAX_VALUE and negative values).
3. **White-Box Testing (Section 5)**: Achieve 100% Branch Coverage analysis, particularly stressing conditional nodes guarding dangerous operations.
4. **Test-Driven Development (Section 6)**: Strictly utilize the Red-Green-Refactor cycle to extend functionality dynamically (specifically adding a new generic `calculatePower(int base, int exponent)` mechanism).

---

## 🏗️ Technical Stack

- **Language:** Java 11+
- **Testing Framework:** JUnit 5 (Jupiter API)
- **Dependency Management:** Maven
- **Presentation Layer:** Vanilla HTML, Tailwind CSS, JavaScript (For the reporting frontend)

---

## 📂 Project Structure

```text
📦 CalculatorProject
 ┣ 📂 src
 ┃ ┣ 📂 main/java/com/uwasa/testing     # Production source code (Calculator.java)
 ┃ ┗ 📂 test/java/com/uwasa/testing     # Automated testing suites (CalculatorTest.java)
 ┣ 📜 pom.xml                           # Maven project configuration
 ┣ 📜 Testing_Report.md                 # Master report containing foundational EP/BVA matrices
 ┣ 📜 Section6_Report.md                # TDD specific log and Video Presentation Script
 ┣ 📜 presentation.html                 # Interactive slider presentation built with Tailwind
 ┗ 📜 placeholder_screenshot_red.png    # Terminal output evidence showing TDD Red failure
 ┗ 📜 placeholder_screenshot_green.png  # Terminal output evidence showing TDD Green success
 ┗ 📜 README.md                         # You are here!
```

---

## 🚀 How to Run and Test Locally

Because this project is built cleanly with standard Maven goals, you do not need an external IDE to verify the tests.

1. **Ensure prerequisites:** You must have Java (JDK) and Maven installed natively or inside your environment. 
2. **Navigate to the Root:** Open your terminal inside `CalculatorProject`.
3. **Run Maven Test:** 
   ```bash
   mvn clean test
   ```

If you wish to execute the tests manually with a standalone JUnit platform JAR (as utilized in some of our presentation steps), compile via `javac` traversing to `bin/`, and execute the `junit-platform-console-standalone.jar` classpath injection.

---

## 📝 Reports and Presentations

We have generated native documentation summarizing the entirety of this software's delivery.
- **Reporting:** View `Testing_Report.md` and `Section6_Report.md` natively in any Markdown viewer (or convert to PDF) to verify the Test Case Tables and TDD logs.
- **Visual Presentation:** An interactive deck resides within `presentation.html`. By double-clicking this HTML file locally, you can view the responsive, JavaScript-driven technical walkthrough presentation prepared for the evaluation video script.

---

*Authored for submission to the Quality Assurance review board under the Applied Software Testing grading pipeline.*
