**SENG 438 - Software Testing, Reliability, and Quality**

**Lab. Report \#4 – Mutation Testing and Web app testing**

| Group \#: 22   |     |
| -------------- | --- |
| Student Names: |     |
|                |     |
|                |     |
|                |     |

# Introduction
In this lab we explored Mutation and GUI testing with automation tools like PiTest and Selenium. We conducted mutation testing on the JFreeChart SUT from previous labss and added new test cases to improve the mutation test scores. We conducted GUI testing with popular e-commerce websites like Amazon and wrote test scripts using Selenium. 

# Analysis of 10 Mutants of the Range class 
1) Method = double getCentralValue()
    mutation replaced double addition with division --> Killed

2) Method = double.getLength()
    mutation negated double field lower --> Killed

3) Method = boolean contains(double value)
   mutation subsututed 1 with a -1 --> Survived 

4) Method = Range combineIgnoringNaN(Range range1, Range range2)
    mutation... 

5) Method = scale(Range base, double factor)
    mutation changed the conditional boundary --> Killed 

6) Method = toString()
    mutation replaced call to java/lang/StringBuilder::append --> Killed 

7) Method = expandToInclude()
    mutation replaced the not equal to equal --> Killed 

8) Method = isNaNRange()
    mutation substitied the 1 with a 0 --> Killed

9) Method = double min(double value1, double vaule2)
    mutation replaced a double return with a 0.0f for org/jfree/data/Range --> Survived

10) Method = double max(double value1, double value2)
    mutation removed a conditioanl and replaced the equality check with true --> Survived 

# Report all the statistics and the mutation score for each test class
Mutation Scores from Assignment 03:
![alt text](image/image.png)

Mutation Scores from Assignment 04:
![alt text](image/image-1.png)

# Analysis drawn on the effectiveness of each of the test classes
**Range Class Tests:**
Reviewing the effectiveness of our mutation coverage on the Range Test class we created we noticed a few key factors. The first is that our original mutation coverage was only 59%. We found this somewhat surprising as we had previously found high coverages for this class in assignment 3. After reviewing the summary log, it was discovered that some area of the code we were not being tested as closely as we had anticapted. We found that from the log there were areas where many mutangts were surving. Many of these mutant were mutants effecting teh same code lines. Our plan was to target these mutants by writing new test cases into or previous test suites to increase the mutation coverage by killing numerous mutants in a singular test. We found a few areas in the class itself where many mutants survived. These included methods intersect(), expands(), and combineIgnoringNaN(). SO our plan was to target these methods with new detailed and specific test cases to increase mutation coverage over the 10% mark. In the end, our new tests increase our coverage by 18%. However, it should be noted that equivalence mutants do effect mutation score accuracy negatively as we will describe in more depth below. 

**DataUtilities Class Tests:**
After going through our original mutation coverage we found out that we had a score of 73%. After going through the summary log, it revealed that some sections of the code had many mutants surviving. Since we had to get rid of many test cases that failed previously, we deiced to create test cases based on the summary log, specifically in methods calculateRowTotal(), calculateColumnTotal() and equal(). We targeted these classes and added more test cases to increase teh mutation coverage to 92%. However, it should be noted that equivalence mutants do effect mutation score accuracy negatively as we will describe in more depth below. 

# A discussion on the effect of equivalent mutants on mutation score accuracy
A mutant is a fault injected into the program and is killed by the test suite when it produces a different output while running the same tests as the original program. Other the mutant survives. The mutant score provides a measure of how strong the test cases are by showing us the number of mutants killed divided by the total number of mutants injected. Equivalent mutants always have the same behaviour as the orginal program, for example x = a +b and x = a - (-b). This means that the test suite does not actually kill the mutant. When equivalent mutants are injected and considered as part of the "kill count" they skew the mutation score by incorrectly inflating the total number of mutants killed.

# A discussion of what could have been done to improve the mutation score of the test suites
 

# Why do we need mutation testing? Advantages and disadvantages of mutation testing
We need to have mutation testing because coverage metrics alone cannot ensure the quality of testing (e.g, how good the test suites are). We need to find out when all the tests are passing, is it because all the bugs are caught or because teh test are poorly written? This is where mutation testing comes into play. 

**Advantages of Mutation Testing:**
- Product is most stable and reliable after mutation testing
- High coverage of teh source program is attained
- program mutants are tested thoroughly
- Quality of testing can improve signifiantly 
- Loopholes in test data can be identified 

**Disadvantages of Mutation Testing:**
- Complex mutations are diffcult to implement
- Mutation testing is time-consuming and expensive 
- Automatic is necessary for mutation testing because its time consuming
- Testers need to have the programming knowlegde to do mutation testing 
- Mutation testing is not applicable for black-box testing as it involves a lot of source code changes 
- Large mutant programs need to be tested against the original test suite 

Source: https://www.softwaretestingclass.com/mutation-testing-advantages-and-disadvantages/ 

# Explain your SELENUIM test case design process

# Explain the use of assertions and checkpoints

# how did you test each functionaity with different test data

# Discuss advantages and disadvantages of Selenium vs. Sikulix

# How the team work/effort was divided and managed


# Difficulties encountered, challenges overcome, and lessons learned

# Comments/feedback on the lab itself
