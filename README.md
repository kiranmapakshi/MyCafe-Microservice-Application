MyCafé
About:  
	MyCafé application is an interface for the customers in the Coffee Shop to choose the drink they want.
    For example Coffee shop contains different type of drinks like coffee, cappuccino, dark coffee, Tea, 
    different type of teas, biscuits, buns.
	This User Interface let the customers select what they want from the menu available in the MyCafé.

	Features:
o	Selection (Select varieties of tea/Coffee).
o	Customization (Select ingredients to add for tea/Coffee).
o	Add-ons (Biscuits, Sweet Bun)
o	Select number of drinks wanted.
o	Display time to prepare(version 2.0)
o	Gets coffee based on Table number in the Café.
o	Chef and Admin Registration and login
o	Admin to assign tables to be maintained by chefs

	Technologies to use:
o	J2EE 8
o	SpringBoot
o	Spring Cloud/Cloud-enabled code
o	MicroServices
o	ActiveMQ, Dockers(Optional)
o	Microsoft SQL Server/H2 Database for a quick start
o	Hibernate/JdbcTemplate for a quick start
o	Rest API
o	Postman For testing
o	Junit for unit testing

	Project Structure:
MyCafe: 5 MicroServices
i.	MyCafe-User-Action (let users select what they want)
ii.	MyCafe-Chef (Display the details to the Drink artist about the items requested)
iii.	MyCafe-User-Display (Display information to the users about the drink they get and time to get the drink served)
iv.	MyCafe-User-Registration (Admin and Chefs Registration and login)
v.	MyCafe-Admin (Admin maps tables to the chefs)



