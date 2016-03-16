CSE110-Ocean-s-10
=================
Retail Banking Account Management  

High Level Overview

EveryOneRich Bank is seeking to implement a Retail Account management application. Their goal is to increase customer satisfaction and increase customers by implementing the following capabilities in retail banking:

Create An Account
Securely login to your account
Check the Balance on all Accounts
Credit the Account
Debit the Account
Transfer Money from One Account to Another
Close An Account
If the balance on your account is below $100 for over 30 days, a penalty of $25 is applied. 
If your balance is over $3000 for over 30 days, an interest of 3% is applied to your account, over $2000 and below $3000, 2%, over $1000 and below $2000, 1% interest will be accrued.
 Any user can have multiple accounts. 
More Detailed  Requirements

These are the basic functional requirements in the banking application:

1. Create and Open Account:
    Capture customer information to include name, address, Account Type (Saving or Checking).
    Generate account information record.
2. Securely login to your account:
    Create a secure login which would ask for username and password from the user
    There may be a  'Forgot Password' option
3. Check the Balance on all Accounts
    Check the balances on all the accounts registered      
    Print account statement:
      Displays the transaction history.
4. Debit Account:
    Check for zero balance
    Check withdrawal amount; it should not be greater than account balance.
    Perform a withdrawal transaction.
5. Credit Account:
    Perform a deposit into the account.        
6. Transfer Funds:
    This involves the withdrawal from one account and depositing into another account.
    Design decision: Funds transfer operation with this system is limited to accounts within the same bank.
    Debit account rules 1 and 2 above will apply to the source account.
7. Close Account:
8. Calculate Penalty:
     If the balance on your account is below $100 for over 30 days, a penalty of $25 is applied
9. Calculate Interest:
     This will calculate the interest on the account balance based on the specified interest rate that depends on the type of account (i.e, Saving or Checking). 
     Savings account rule : If your balance is over $3000 for over 30 days, an interest of 4% is applied to your account, over $2000 and below $3000, 3%, over $1000 and below $2000, 2% interest will be accrued.
     Checking account rule : If your balance is over $3000 for over 30 days, an interest of 3% is applied to your account, over $2000 and below $3000, 2%, over $1000 and below $2000, 1% interest will be accrued.
10. Any user can have multiple account:
     any type of account
11. Set a threshold for your account and notify the customer if the account falls below it.

General project details 

You will be turning-in artifacts, code and runtime
The project will consist of implementing one-three user stories every week and turning in related artifacts, codes and runtime (test)
Artifacts are documents which contain different  (templates for artifacts will be provided every week)
Artifacts and code should be turned-in electronically. Details about the turn-ins will be mentioned in project tasks section. 
Runtime(the feature that you implement) will be checked off by tutors in the next week’s lab during the first hour. (For example, if you have to implement a user story and submit the artifacts and code by 10/26 (Sunday), the runtime will be checked off on the following Monday (10/27))
What to do in labs?
Runtime check-offs for labs are mandatory, you need to show your working features to the tutors and TAs during lab hours.
Labs are a good place for your team to get together and collaborate on the project. 
You should work on developing artifacts or writing code according to role you have
The tutors will be available to solve your doubts during the first hour of the lab and a TA will be available for the subsequent hours.
What to do in discussion sections?
The TAs will be facilitating technical discussions and collaboration within the teams in the discussion sections. This is where your team comes together and different roles share their inputs for implementing the week’s user story/feature. 
First turn-in will be on Saturday 10/18 midnight and will consist of writing user stories and time estimates (this turn-in does not have code or runtime)
For subsequent turn-ins, each team will be making updates to his/her particular role template and turning those in as artifacts.

