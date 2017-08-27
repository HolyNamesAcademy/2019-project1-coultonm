Project 1
=========
Getting started
-----
1. Save and unzip project to where you want your project to live
2. Open IntelliJ and click File > Open. Find the root level folder of your project. This is the folder that contains the .idea folder. Click on this folder and select OK.
3.  You should see 'ShapeMaker' in a dropdown and a play button next to it. Hit the play button to run your program. Since you haven't written any code, the program won't work as intended -- yet. But being able to run the program means you are all set and ready to start.

The Project
-----
This project has two parts. The first part is called ShapeMaker. In ShapeMaker, you will implement functions that print out shapes using the '*' symbol and whitespace. It will be a good exercise to warm up your for loops and if statements. The second part is called BankAccountManager. The BankAccountManager is a bare bones application that allows the user to manage a single bank account by making withdrawals, deposits, and checking the balance. You will implement a BankAcocunt class that manages all of the functionality of a bank account.

ShapeMaker
-----
In order to run ShapeMaker, click on the dropdown next to the play button in the top right and select "ShapeMaker". Then hit play. Since none of the functions have been implemented yet, the program will print nothing. That's okay, though! You shouldn't have hit any compile errors, and that means you are in the perfect place to start.

All of the functionality that you will need to implement is located in the ShapeMaker class. Open this class, and you will see a list of functions that must be implemented, with instructions above each function. Follow the instructions exactly. Important: part of the problem is getting the whitespaces right. Don't have extra spaces at the end of the line if they are not needed.

Start by implementing the first function. Then hit play and see the program run, and see if you implemented it properly. If you get it right, move onto the next function. Otherwise, make whatever corrections you need to make and run it again. I recommend running the program very often. That will allow you to make sure you are on the right track. You should absolutely be running it after each function that you implement.

BankAccountManager
-----
The BankAccountManager is a command line application that allows you to maintain a bank account. First you set up the bank account with a name and a starting balance. After that, it continuously asks the user for a command. It can take several commands:

| Command	| Description |
| ------- | ----------- |
| Balance |	Prints the name and account balance. |
| Deposit <amount> ("Deposit 43") |	Deposit takes in a dollar amount and adds it to the account balance. |
| Withdraw <amount> ("Withdraw 13") |	Withdraw takes in a dollar amount and subtracts it from the account balance, as long as there is enough money in the account. Otherwise, it just prints an error message to the user. |
| AddInterest <num years> <interest rate> ("AddInterest 2 .05") |	Takes in a number of years and an interest rate and calculates the new balance with interest added. For our purposes, we're just using simple interest (Interest = Balance * Time * Rate and New Balance = Old Balance + Interest). |
| Quit |	Exits the program. |

Your job is to implement the BankAccount class so that it keeps track of the name and account balance. You will have to implement the constructor, a couple of getters, and a couple of methods. All of those methods can be found in the BankAccount class. You will also have to implement "PrintAccountInfo" function, located in BankAccountManager.

Unit Tests
-----
You'll notice that there are also 2 other configs in the dropdown by the play button. These are 'ShapeMakerTest' and 'BankAccountTest'. These two configs allow you to run Unit Tests. We'll learn more about Unit Tests in the next unit, but for now, know that unit tests are test cases that allow you to test specific functions and classes. There is a unit test for almost every function that you will be writing. Unit tests help you determine if you wrote the function correctly. If a unit test passes, that means you are on the right track. Because the unit tests we've given you are not comprehensive (they don't test every possible scenario), it DOES NOT guarantee that you're code is completely right. Make sure you test the functions yourself with different inputs. However, a major portion of the grade will be based on if your unit tests pass, so make sure to run them before you turn them in. 

Turning In The Project
-----
Follow the guidelines in the IntelliJ Setup page to turn in your assignment. 
