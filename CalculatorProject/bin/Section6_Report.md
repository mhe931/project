---
title: "Applied Software Testing Makeup Project"
author: "Your Name"
date: "2026-04-10"
---

# Applied Software Testing Makeup Project
**Section 6 - Assignment 2: Test-Driven Development (TDD)**

**Name/Student ID:** [Enter Student Detals Here]  
**Project:** Smart Calculator System (Project A)  
**Date:** April 10, 2026  

---
**Video Submission Link (YouTube):** [Insert YouTube Link Here]

---

## 1. Test-Driven Development (TDD) Process

The TDD process focuses on the **Red-Green-Refactor** cycle to implement mathematical functionality reliably. For this segment, we extended the Calculator class with a new method: `calculatePower(int base, int exponent)`. 

### Phase 1: RED (Failing Test)
**Objective:** Write a failing test for `calculatePower` to prove that tests fail when behavior is unimplemented.

- **Action:** Created `testCalculatePower` in `CalculatorTest.java` anticipating that `calculator.calculatePower(2, 3)` should equal `8`.
- **Action:** Created a method stub returning `0` in `Calculator.java` so that the project compiled, yet inherently failed the test requirement.
- **Evidence:** Executing the JUnit framework yielded the required assertion error (`Expected 8, but was 0`).

**[INSERT_SCREENSHOT_RED]**

---

### Phase 2: GREEN (Passing Status)
**Objective:** Write the minimal amount of code mathematically necessary to fulfill the unit test.

- **Action:** The body of `calculatePower` was rewritten from the `0` stub to instead perform `return (int) Math.pow(base, exponent);`.
- **Evidence:** Running the JUnit testing framework again proved successful, yielding `0 tests failed`.

**[INSERT_SCREENSHOT_CODE]**
*(Insert snippet of `calculatePower` updated logic)*

**[INSERT_SCREENSHOT_GREEN]**
*(Insert snippet of JUnit success output)*

---
---

## 2. Video Presentation Script (5-Minute Guide)

*This script covers all 6 required points in Section 3.1.1, demonstrating the mechanics and logical flow of the newly implemented TDD function.*

### [0:00 - 0:45] Introduction & Project Context
"Hello everyone. Today I'm going to demonstrate my solution for Section 6 of the Applied Software Testing Makeup Project. Our overarching goal is to update the 'Smart Calculator System' by developing a brand-new integer power function. I will precisely be utilizing the Test-Driven Development methodology to achieve this natively."

### [0:46 - 1:45] TDD Process Explanation
"First, let's briefly review TDD. Test-Driven Development adheres strictly to the Red-Green-Refactor workflow. First, we write tests anticipating a specific outcome, which then predictably fail—representing the Red phase. Next, we write the minimum necessary implementation block to pass that very test, changing our metric to Green. Finally, we review and clean up the logic during the Refactor phase while retaining green validation."

### [1:46 - 2:45] Spoken Explanation: The Initial Failure (Red Phase)
"Now, let's dive into our codebase. For the Red phase, our objective was to compute a base integer raised to an exponent. You can see I formulated `testCalculatePower` querying `calculator.calculatePower(2, 3)` anticipating a return of `8`. When I first ran this test, our terminal threw an error. ***Why?*** Because our `Calculator.java` either didn't possess the method signature at all initially—refusing to compile—or, when stubbed to return `0`, violently failed our strict JUnit assertion check expecting an `8`. This is precisely the necessary Red starting point."

### [2:46 - 3:45] Spoken Explanation: The Resolution (Green Phase)
"To fix this, I moved to the Green phase. Instead of returning a blind zero, I utilized the core Java Math library, writing `return (int) Math.pow(base, exponent);` directly within our method body. I then invoked the Maven compiler and ran the JUnit executable jar again. By executing standard exponentiation logic safely inside our tested bounds, the assertions finally hit `8`, and you can observe our test summary yielding absolutely zero failed tests!"

### [3:46 - 4:40] Testing Results & Refactoring Checks
"As a final check, I made sure all previous foundational functions—such as basic additions and division by zero—were uncorrupted by our power implementation. For instance, the safety check where our divide method definitively triggers 'Error: Division by zero' remains intact. The code is modular, lean, and hasn't suffered regressions!"

### [4:41 - 5:00] Conclusion
"In conclusion, testing first before implementing functionality allowed us to secure a perfectly bound logic gate for mathematical calculations. Thank you for watching!"
