# ATM-interface

**ATM Interface Documentation**
**1. Title of the Project**
ATM Interface Simulation using Java

**2. Objective**
The goal of this project is to simulate an ATM system in the console using Java. It allows users to perform common banking operations like checking balance, depositing money, withdrawing money, transferring funds to another account, and viewing transaction history.

**3. Introduction**
This project mimics the behavior of a real-world ATM machine using Java programming. It involves account creation, authentication (user ID and PIN), and various operations such as deposit, withdraw, transfer, and viewing transaction history.
The system is structured using Object-Oriented Programming concepts, ensuring good code organization, readability, and modular design.

**4. Project Structure**
├── AccountHolder.java
│   └── Stores user ID and PIN with validation
├── Account.java
│   └── Handles balance, deposit, withdraw, transfer, and transaction history
├── BankTransaction.java
│   └── Performs deposit, withdraw, transfer, and history display
├── Bank.java
│   └── Stores user accounts, validates user ID and PIN
└── ATM.java (Main class)
    └── Entry point of the application. Displays the menu and handles user interaction

**5. Project Working**

**5.1 Verifying Account**
•	The ATM.java file contains the main method.
•	When you run it, the program first asks for a User ID and PIN.
•	It then checks whether the entered credentials match any existing user using the Bank.isValidUser() method.
•	If valid, the user proceeds to the main menu. If not, the program exits with an error message.
**5.2 ATM Interface Menu**
Once logged in, a do-while loop presents the user with a menu to perform various operations. Each menu choice corresponds to a function in the BankTransaction class.

**5.2.1 Transaction History (Option 1)**
•	Displays a list of all transactions (deposits, withdrawals, transfers).
•	Stored as strings in an ArrayList<String> in the Account class.
•	Method transactionhistory() prints all entries from the list.

**5.2.2 Deposit Amount (Option 2)**
•	Prompts the user to enter the deposit amount.
•	Calls deposit() method from Account class.
•	Adds the amount to the user’s balance and logs the transaction in the history list.

**5.2.3 Withdraw Amount (Option 3)**
•	Prompts for the withdrawal amount.
•	Uses withdraw() method from Account class to check and deduct if funds are available.
•	If the balance is insufficient, it displays an error message.

**5.2.4 Transfer Amount (Option 4)**
•	Asks for the recipient's user ID and amount to transfer.
•	Checks if the recipient account exists using Bank.getAccount(toUserId).
•	If valid and balance is sufficient, money is withdrawn from the current account and deposited into the recipient’s account.
•	Transaction is recorded in both accounts' history.

**5.2.5 Balance Enquiry (Option 5)**
•	Uses getBalance() method from Account class.
•	Displays the current balance of the logged-in user.

**5.2.6 Exit (Option 6)**
•	Ends the loop and displays a farewell message.
•	Program terminates using System.exit() or by simply ending the main method.

6. Conclusion
This mini-project simulates a basic ATM system using Java. It demonstrates the core concepts of object-oriented programming including classes, objects, encapsulation, and method abstraction. This mini project serves as a strong foundation for building more complex financial applications in the future.
It is ideal for beginner to intermediate Java learners and showcases the structure and behavior of a banking system in a simplified and interactive format.

