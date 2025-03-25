**SENG 438 - Software Testing, Reliability, and Quality**

**Lab. Report \#4 – Mutation Testing and Web app testing**

| Group \#:      | 22  |
| -------------- | --- |
| Student Names: | Isabelle Gaudet  |
|                | Kamand Ghorbanzadeh  |
|                | Dylan Wenaas   |
|                | Spiro Douvis   |

# Introduction


# Analysis of 10 Mutants of the Range class 

# Report all the statistics and the mutation score for each test class



# Analysis drawn on the effectiveness of each of the test classes

# A discussion on the effect of equivalent mutants on mutation score accuracy

# A discussion of what could have been done to improve the mutation score of the test suites

# Why do we need mutation testing? Advantages and disadvantages of mutation testing

# Explain your SELENUIM test case design process

Our Selenium test case design process involved automating two distinct functionalities per team member for the selected application under test. The functionalities were chosen to cover key user interactions and sequences of events on the website. Each functionality was broken down into 2 unique test cases, ensuring that all possible scenarios were covered for a total of 8 functionalities. We selected the Home Depot page. Below is the breakdown of the 8 test cases:

1. **Search Functionality**:
   - **Test 1**: Searching for a product and verifying that the search results page loads correctly.
   - **Test 2**: Filtering the search results using 'Filter by' functionality and making a selection and verifying that the filtered results are displayed.

2. **Cart Functionality**:
   - **Test 3**: Adding multiple items to the cart and verifying that the total price is calculated correctly.
   - **Test 4**: Clearing the cart and verifying that it is empty.

3. **Create Account and Login Functionality**:
   - **Test 5**: Logging in with valid credentials and verifying that the user is redirected to their account page.
   - **Test 6**: Logging out and verifying that the user is redirected to the homepage.

4. **Navigation Functionality**:
   - **Test 7**: Navigating between sections both forward and backwards and verifying that the correct page is loaded.
   - **Test 8**: Selecting a product category ('Shop by Department') and verifying that the correct category page is displayed.

The test cases were automated using Selenium WebDriver, and the Page Object Model (POM) was implemented to improve maintainability and reusability. Each test case included assertions and checkpoints to validate the expected outcomes, such as verifying page titles, element visibility, and error messages.

# Explain the use of assertions and checkpoints

Assertions and checkpoints were used to validate the outcomes of our automated tests and ensure that the application behaved as expected at each step. Below is how they were applied:

1. **Assertions**:
   - `assertEquals`: Used to compare expected and actual values, such as page titles or specific text on the page.
   - `assertTrue`: Used to verify conditions, such as the visibility of specific elements or the presence of a success message.

2. **Checkpoints**:
   - Verifying that the search results page loads correctly after entering a query.
   - Ensuring that the cart updates correctly after adding or removing items.
   - Checking that the user is redirected to the correct page after logging in or logging out.
   - Confirming that navigation links lead to the correct sections of the website.

These mechanisms ensured that the tests were reliable and that any deviations from expected behavior were detected.

# how did you test each functionaity with different test data

Each functionality was tested with a variety of data sets to ensure robustness and reliability. Below is how different test data was applied:

1. **Search Functionality**:
   - Tested with valid inputs (eg. "fridge") to verify that relevant results are displayed.
   - Tested with invalid inputs (eg. "xyz123") to verify that an appropriate "No results found" or similar message is displayed.
   - Tested with edge cases, such as empty input or excessively long strings, to ensure the system handles well.

2. **Cart Functionality**:
   - Tested by adding a single item and verifying the cart contents.
   - Tested by adding multiple items and verifying the total price calculation.
   - Tested by removing items and ensuring the cart updates correctly.

3. **Login Functionality**:
   - Tested with valid credentials to verify successful login and redirection to the account page.
   - Tested with invalid credentials to verify that an error message is displayed.
   - Tested with empty fields to ensure appropriate validation messages are shown.

4. **Navigation Functionality**:
   - Tested by navigating to valid sections and verifying that the correct page loads.
   - Tested by navigating backwards (using back arrow) to verify that the correct page is returned to.
   - Tested by clicking on category links and verifying that the correct category page is displayed.
   

By using a combination of valid, invalid, and edge-case data to test each functionality, we ensured that the application was tested comprehensively.

# Discuss advantages and disadvantages of Selenium vs. Sikulix

# How the team work/effort was divided and managed


# Difficulties encountered, challenges overcome, and lessons learned

# Comments/feedback on the lab itself
