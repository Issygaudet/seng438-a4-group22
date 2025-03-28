All of our automated tests were run and completed successfully with the exception of 'Log In with Valid Credentials and Log Out'. This failure was due to the website not allowing us to run logins and logouts enough times for us to successfully complete the test. These are the run logs:

'Search With Valid Input':
![alt text](image-1.png)

'Search With Invalid Input':
![alt text](image-2.png)

'Search with Single Filter':
![alt text](image-3.png)

'Search with Multiple Filters':
![alt text](image-4.png)

'Navigation - Forward Only':
![alt text](image-5.png)

'Navigation - Backwards and Over Multiple Pages':
![alt text](image-6.png)

'Add Single Item to Cart':
![alt text](image-7.png)

'Add Multiple Items to Cart':
![alt text](image-8.png)

'Add and Remove Single Item from Cart':
![alt text](image-9.png)

'Log in with Valid Credentials':
![alt text](image-11.png)

'Log In with Invalid Credentials':
![alt text](image-10.png)

'Log In With Error Credentials':
![alt text](image.png)

### Defects Identified During Test Automation

#### Defect 1: Login Error on Home Depot Website
- **Description**: During the automation of the login functionality (test case 3, tests under functionality 5 and 6) on the Home Depot website, the application displayed the following error message:  
  *"Sorry, an unexpected error has occurred. Please try again later."*
- **Steps to Reproduce**:
  1. Create a new account on the Home Depot website using valid credentials.
  2. Attempt to log in with the newly created account credentials.
- **Expected Behavior**: The user should be successfully logged in and redirected to their account page.
- **Actual Behavior**: The application displayed an error message, preventing the user from logging in, despite entering valid credentials.
- **Possible Cause**: This issue may be related to overuse or server-side limitations of the application. This functionality worked on this students laptop prior, and stopped working following excessive use and testing.
- **Impact**: This defect prevents users from accessing their accounts, which could hinder their ability to use the website effectively. The test for this functionality had to be tested on a different users device.