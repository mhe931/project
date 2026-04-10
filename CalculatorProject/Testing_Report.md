# Applied Software Testing Makeup Project
## Project A: Smart Calculator System

### 1. Introduction
This report documents the implementation and testing of the "Smart Calculator System," focusing on Unit Testing, Black-Box Testing, White-Box Testing, and strictly following Test-Driven Development (TDD) for new feature implementation.

### 2. Test Case Table Summary

The table below summarizes all test scenarios implemented to validate the functional constraints and edge cases.

| ID | Objective | Input | Expected Output | Outcome / Notes |
|:---|:---|:---|:---|:---|
| TC-01 | Normal Addition | `a=2`, `b=3` | `5` | Pass |
| TC-02 | Normal Subtraction | `a=4`, `b=3` | `1` | Pass |
| TC-03 | Normal Multiplication| `a=3`, `b=4` | `12` | Pass |
| TC-04 | Normal Division | `a=5`, `b=2` | `2.5` | Pass |
| TC-05 | Division by Zero (Edge Case) | `a=5`, `b=0` | `"Error: Division by zero"` | Pass. Handled properly constraint. |
| TC-06 | Max Value Addition (BVA) | `a=INT_MAX`, `b=1` | `Integer.MIN_VALUE` | Pass. Tests overflow integer handling. |
| TC-07 | Multiplication with Zero (BVA)| `a=INT_MAX`, `b=0`| `0` | Pass |
| TC-08 | Division Negative Input (EP) | `a=-10`, `b=-5` | `2.0` | Pass |
| TC-09 | Power Feature (TDD) | `a=2`, `b=3` | `8` | Pass |

### 3. White-Box Testing: Branch Coverage Analysis

The `divide` method uses an `if` statement to manage invalid arguments (e.g., dividing by zero). To achieve 100% branch coverage, two specific test inputs were designed:

1. **Test `testDivideBranchCoverage_Zero` (if branch evaluated as True)**:
   - Input: `10`, `0`
   - Outcome: Return type is verified as `String` and value equals exactly `"Error: Division by zero"`.
2. **Test `testDivideBranchCoverage_Standard` (if branch evaluated as False)**:
   - Input: `10`, `5`
   - Outcome: Normal division takes place. Return type is verified to return normally (e.g., `2.0`).

### 4. Test-Driven Development (TDD) Cycle: Power Feature `(a^b)`

To ensure high reliability, the new **Power Feature** was developed strictly using the Red-Green-Refactor TDD cycle. 

#### **Phase 1: Red (Write a failing test)**
Initially, the `testPower()` JUnit case was written in `CalculatorTest.java` evaluating `calculator.power(2, 3)`. We expected a successful return of `8`. Because the `power` method only contained a stub signature (`return 0;`), compiling and running this immediately resulted in failure.
_Observe the test failure confirming that the absence of functional code correctly triggers an alert._

> **[SCREENSHOT_HERE]**
> _(Insert screenshot of terminal execution showing the solitary JUnit test failing for `testPower`)_

#### **Phase 2: Green (Write minimal code to pass)**
Subsequent to verifying the test failure, minimal production logic was integrated. 
The stub `return 0;` was replaced with `return (int) Math.pow(a, b);`. 

#### **Phase 3: Refactor (Run the test again & finalize)**
The tests were re-compiled and re-run. With the implementation now handling mathematically sound exponents, the JUnit framework successfully cleared all assertions.

> **[SCREENSHOT_HERE]**
> _(Insert screenshot of terminal execution displaying all instances passing with `0 tests failed`)_

---
**End of Report.**
