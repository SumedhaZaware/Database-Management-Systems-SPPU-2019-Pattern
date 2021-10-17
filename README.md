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
       
        * Accept roll_no & name of book from user.
        
        * Check the number of days (from date of issue), if days are between 15 to 30 then fine amount will be Rs 5per day.
        
        * If no. of days>30, per day fine will be Rs 50 per day & for days less than 30, Rs. 5 per day.
        
        * If condition of fine is true, then details will be stored into fine table. Also handles the exception by named exception 
          handler or user define exception handler.
         
        * After submitting the book, status will change from I to R.
