**SENG 438 - Software Testing, Reliability, and Quality**

**Lab. Report \#4 – Mutation Testing and Web app testing**

| Group \#: 22         |     |
| --------------       | --- |
| Student Names:       |     |
| Kamand Ghorbanzadeh  |     |
| Isabelle Gaudet      |     |
| Spiro Douvis         |     |
| Dylan Wenaas         |     |


# Introduction
In this lab, we explored Mutation and GUI testing using automation tools like PiTest and Selenium. We conducted mutation testing on the JFreeChart SUT from previous labs and added new test cases to improve the mutation test scores. Additionally, we performed GUI testing on popular e-commerce websites such as Amazon and wrote test scripts using Selenium.

# Analysis of 10 Mutants of the Range class 
1) **Method:** `double getCentralValue()`
    - Mutation replaced double addition with division --> **Killed**

2) **Method:** `double.getLength()`
    - Mutation negated double field `lower` --> **Killed**

3) **Method:** `boolean contains(double value)`
   - Mutation subsututed `1` with a `-1` --> **Survived** 

4) **Method:** `Range combineIgnoringNaN(Range range1, Range range2)`
    - Mutation removed conditional and replaced the equality check with `false` --> **Survived**

5) **Method:** `scale(Range base, double factor)`
    - Mutation changed the conditional boundary --> **Killed** 

6) **Method:** `toString()`
    - Mutation replaced call to `java/lang/StringBuilder::append` --> **Killed** 

7) **Method:** `expandToInclude()`
    - Mutation replaced the `!=` (not equal) operator with `==` (equal) --> **Killed** 

8) **Method:** `isNaNRange()`
    - Mutation substitied the `1` with `0` --> **Killed**

9) **Method:** `double min(double value1, double vaule2)`
    - Mutation replaced a double return with a `0.0f` --> **Survived**

10) **Method:** `double max(double value1, double value2)`
    - Mutation removed a conditioanl and replaced the equality check with `true` --> **Survived** 

# Report all the statistics and the mutation score for each test class
Mutation Scores from Assignment 03:
![alt text](images/image.png)

Mutation Scores from Assignment 04:
![alt text](images/image-1.png)

# Analysis drawn on the effectiveness of each of the test classes
**Range Class Tests:**
Reviewing the effectiveness of our mutation coverage on the `RangeTest` class, we noticed several key insights. Initially, our mutation coverage was only **59%**, which was surprising given our previously high coverage in Assignment 3. After reviewing the summary log, we found that some areas of the code were not being tested as thoroughly as anticipated.

The log showed that many mutants were surviving, often affecting the same lines of code. To address this, we wrote new test cases to target multiple surviving mutants within a single test. Key areas where many mutants survived included the `intersect()`, `expand()`, and `combineIgnoringNaN()` methods. We created detailed and specific test cases to target these methods, ultimately increasing our mutation coverage by **18%**. However, it should be noted that equivalent mutants negatively impact mutation score accuracy, which we discuss below. 

**DataUtilities Class Tests:**
Initially, our mutation coverage for `DataUtilitiesTest` was **73%**. Upon reviewing the summary log, we found that several sections of the code had many surviving mutants. Since we had previously removed failing test cases, we decided to create new test cases based on the summary log, specifically for the `calculateRowTotal()`, `calculateColumnTotal()`, and `equal()` methods. By adding these new test cases, we increased mutation coverage to **92%**. However, as with the `RangeTest` class, equivalent mutants negatively impact mutation score accuracy.

# A discussion on the effect of equivalent mutants on mutation score accuracy
Equivalent mutants negatively impact mutation score accuracy. In this lab, we calculated mutation score as:

Mutation Score = Total Mutants Killed / All Mutants

However, in an ideal scenario, equivalent mutants should be excluded from this calculation:

Ideal Mutation Score = Total Mutants Killed / All Non-Equivalent Mutants 

Equivalent mutants behave identically to the original program, meaning they do not introduce real faults. These mutants cannot be killed, as they do not represent genuine program bugs. Including them in the mutation score calculation artificially lowers the score and misrepresents the effectiveness of the test suite. Detecting equivalent mutants is a challenging and often undecidable problem, usually requiring manual review of survived mutants.

# A discussion of what could have been done to improve the mutation score of the test suites
Reflecting on our experience with PiTest and mutation testing, we recognize opportunities for further improvement. While we increased our mutation coverage significantly, we could have pushed our `RangeTest` class closer to **90%**.

To further improve mutation coverage, we would:

- Ensure our test suite covers all types of mutants.
- Target multiple mutants affecting the same lines of code, maximizing efficiency by writing fewer but more comprehensive tests.
- Continue analyzing the summary log to identify areas with high mutant survival rates.

For example, our `RangeTest` suites contains over 100 unit tests and has **77**% mutation coverage. To improve this further, we need to create highly specific tests, directly addressing surviving mutants from the summary log.

# Why do we need mutation testing? Advantages and disadvantages of mutation testing
Mutation testing is essential because traditional coverage metrics alone do not guarantee the quality of test suites. A high coverage percentage does not necessarily mean that all potential bugs are caught—it could also mean that tests are poorly designed. Mutation testing helps determine whether test cases effectively detect faults.

**Advantages of Mutation Testing:**
- Ensures a stable and reliable product.
- Achieves high coverage of the source program.
- Tests program mutants thoroughly.
- Significantly improves testing quality.
- Identifies weaknesses and loopholes in test data.

**Disadvantages of Mutation Testing:**
- Complex mutations can be difficult to implement.
- Mutation testing is time-consuming and expensive.
- Automation is necessary due to its time-consuming nature.
- Testers must have programming knowledge to perform mutation testing.
- Not applicable to black-box testing, as it requires access to source code.
- Large mutant programs require extensive testing against the original test suite.

**Source:** [Mutation Testing Advantages and Disadvantages](https://www.softwaretestingclass.com/mutation-testing-advantages-and-disadvantages/)

# Explain your SELENUIM test case design process

# Explain the use of assertions and checkpoints

# how did you test each functionaity with different test data

# Discuss advantages and disadvantages of Selenium vs. Sikulix

# How the team work/effort was divided and managed


# Difficulties encountered, challenges overcome, and lessons learned

# Comments/feedback on the lab itself
A few comments on the lab: we found it to be quite interesting and introduced us to new concepts. None of us had ever used these technologies for testing before. However, as a group, we felt it would have been more exciting to work with new classes rather than the same `Range` and `DataUtilities` classes from Assignments 2 and 3. Providing additional details on setting up the new software used for this assignment, perhaps in the form of short tutorial videos, could have been useful. Overall, we enjoyed this lab as a group.
