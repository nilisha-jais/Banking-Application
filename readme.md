# Banking Application
A banking application made using java.
  
  
### Application Screenshots

- Creating a new user


<img src="images/img2.png">

- Log in as existing user


<img src="images/img1.png">

### Tasks Done

A. Create an simple java application with two classes
1. Customer ( this class contain information about customer).
  
  
a. The attributes are as follows.
- Name-String
- Username-String
- Password-String
- Age-int
- SSN-String
- Address-String(just city name)
- Email-String
- Phone-long
- Balance-float


b. Methods.
- login
- deposit
- withdrawal
- checkBalance
- editProfile
- changePassword

2. Bank( This will be the main class, which when executed shows following
results )

3. On the start of application login() method of Customer class should be
called.
4. After logging in, customer should select one of the option to perform the
operation.
5. On selection of each operation, respecting methods in customer class
should be called
6. At the end of each operation the customer should be prompted , do you
want to continue?
7. If the reply is “YES” then it should display the menu again.

8. If the answer is no , then it should exit out and display the login page

B. Add another class Account in the application with the following attributes
and methods
a. Attributes
• accountId
• description
• minimumBalance
b. methods
• display()

C. Create two subclasses of Account class
a. Current
• Set minimumBalance=$0
• Override display method to show details of all the attributes
in the account

b. Saving
• Set minimumBalance=$500
• Override display method to show details of all the attributes
in the account

