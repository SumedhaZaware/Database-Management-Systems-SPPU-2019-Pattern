# Database-Management-Systems-SPPU-2019-Pattern

This repository contains the assignments💻 of Database Management Systems provided by Savitribai Phule Pune University(SPPU)🎓



**NOTE:**
    I have used ubuntu 20.04.3 LTS for these practicals.

## Group-A
1. **Assignment-1**
    
   This is a theory assignment in which we are supposed to design a ER-model for the mini project

2. **Assignment-2**

    a. Design and Develop SQLDDL statements which demonstrate the use of SQL objects such as Table, View, Index, Sequence, 
       Synonym, different constraints etc.
       
    b. Write at least 10 SQL queries on the suitable database application using SQL DML statements.

3. **Assignment-3**

    Write at least 10 SQL queries for suitable database application using SQL DML statements.
    Note: Instructor will design the queries which demonstrate the use of concepts like all types of
    Join ,Sub-Query and View.

4. **Assignment-4**

    a. Consider table Stud(Roll, Att, Status) Write a PL/SQL block for following requirement and handle the exceptions. 
       Roll no. of student will be entered by user. Attendance of roll no. entered by user will be checked in Stud table. 
       If attendance is less than 75% then display the message “Term not granted” and set the status in stud table as “D”.
       Otherwise display message “Term granted” and set the status in stud table as “ND”.
       
    b. Write a PL/SQL block for following requirement using user defined exception handling. The account_master table records 
    the current balance for an account, which is updated whenever, any deposits or withdrawals takes place. If the withdrawal 
    attempted is more than the current balance held in the account, the user defined exception is raised, displaying an appropriate 
    message. Write a PL/SQL block for above requirement using user defined exception handling.
    
    c. Write an SQL code block these raise a user defined exception where business rule is voilated. BR for client_master table 
    specifies when the value of bal_due field is less than 0 handle the exception.
    
    d. Consider below database schema: 
    
    **Borrower(Roll_no, Name, DateofIssue, NameofBook, Status) Fine(Roll_no,Date,Amt)**
       
       
        - Accept roll_no & name of book from user.
        - Check the number of days (from date of issue), if days are between 15 to 30 then fine amount will be Rs 5per day.
        - If no. of days>30, per day fine will be Rs 50 per day & for days less than 30, Rs. 5 per day.
        - If condition of fine is true, then details will be stored into fine table. Also handles the exception by named exception 
          handler or user define exception handler.
        - After submitting the book, status will change from I to R.

5. **Assignment-5**
    
    a. Write a PL/SQL stored procedure for the following requirements and call the procedure in the appropriate PL/SQL block.
                   
                   
      **Borrower(Rollin, Name, DateofIssue, NameofBook, Status)**
                    
      **Fine(Roll_no,Date,Amt)**
    
    b. Write a stored function in PL/SQL for a given requirement and use the same in PL/SQL block.
        
       - Account no. and branch name will be accepted by the user. The same will be searched in table acct_details. 
       - If the status of the account is active then display an appropriate message and also store the account details 
         in the active_acc_details table, otherwise display a message on the screen “account is inactive”.
    
    c. Write a Stored Procedure namely proc_Grade for the categorization of students.
       - If marks scored by students in examination is <=1500 and marks>=990 then the student will be placed in the distinction category.
       - If marks scored are between 989 and900 categories is first-class
       - If marks 899 and 825 categories are Higher Second Class.

6. **Assignment-6**

    a. The bank manager has decided to activate all those accounts which were previously marked as inactive for 
        performing no transaction in the last 365 days. Write a PL/SQL block (using the implicit cursor) to update 
        the status of the account, display an approximate message based on the no. of rows affected by the update.
        Use of %FOUND, %NOTFOUND, %ROWCOUNT.
        
    b. The organization has decided to increase the salary of employees by 10% of existing salary, who are having salaries 
       less than the average salary of the organization. Whenever such salary updates take place, a record for the same is 
       maintained in the increment_salary table.
       
      **EMP (E_no , Salary) increment_salary(E_no , Salary)**
       
    c. Write PL/SQL block using explicit cursor for following requirements: College has decided to mark all those students 
       detained (D) who are having attendance less than 75%. Whenever such an update takes place, a record for the same is 
       maintained in the D_Stud table.
       
    d. Write a PL/SQL block of code using parameterized Cursor that will merge the data available in the newly created table 
       N_RollCall with the data available in the table O_RollCall. If the data in the first table already exists in the second 
       table then that data should be skipped. 
    
    e. Write the PL/SQL block for following requirements using parameterized Cursor: 
       Consider table EMP(e_no, d_no, Salary), department wise average salary should be inserted into the new table 
       dept_salary(d_no, Avg_salary).

    f. Write PL/SQL block using explicit cursor: Cursor FOR Loop for following requirements: College has decided to mark all 
       those students detained (D) who are having attendance less than 75%. Whenever such an update takes place, a record for 
       the same is maintained in the D_Stud table.

7. **Assignment-7**

    a. Write an update, delete the trigger on clientmstr table. The System should keep track of the records that ARE BEING updated 
    or deleted. The old value of updated or deleted records should be added to the audit_trade table. (separate implementation using 
    both row and statement triggers)
    b. Write a before trigger for Insert, update event considering following requirement: **Emp(e_no, e_name, salary)**
    
        - Trigger action should be initiated when salary is tried to be inserted is less than Rs. 50,000/-
        - Trigger action should be initiated when salary is tried to be updated for a value less than Rs. 50,000/- Action 
          should be a rejection of update or Insert operation by displaying an appropriate error message

## Group-B 
1. **Assignment-1**

    Design and Develop MongoDB Queries using CRUD operations.(Use CRUD operations, SAVE method, logical operators etc).


2. **Assignment-2**

    Design and Develop MongoDB Queries using aggregation and indexing with suitable example using MongoDB.

3. **Assignment-3**

    Implement Map reduces operation with suitable example using MongoDB

4. **Assignment-4**

    Write a program to implement Mongo DB database connectivity with any front end language to implement Database navigation operations.
