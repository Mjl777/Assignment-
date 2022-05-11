* A database is a structured collection of information. They enable electronic data storage and manipulation. Databases simplify data administration. Consider the following database example: A database is used by an online telephone directory to hold information about persons, phone numbers, and other contact information.
* Tables are database objects that hold all of the information in a database. Tables logically arrange data in a row-and-column structure comparable to spreadsheets. Each row represents a distinct record, and each column represents a record field.
* SQL Server's overall design contains four primary components: the protocol layer, the query processor (also known as the relational engine), the storage engine, and the SQLOS. Every batch sent for execution to SQL Server from any client application must interface with these four components.

1. SELECT * FROM actor;
2. SELECT last_name, email FROM customer;
3. SELECT title, description, release_year FROM film;
4. SELECT city_id, country_id FROM city;
5. SELECT amount, payment_date, customer_id FROM customer;
6. SELECT * FROM language;
7. SELECT payment FROM payment WHERE customer_id=10;
8. SELECT last_name, first_name FROM customer WHERE first_name=’Mary’;
9. SELECT DISTINCT last_name, first_name FROM customer WHERE first_name='Mary' AND last_name='Smith';
10. SELECT DISTINCT last_name, first_name FROM customer WHERE first_name='Susan' AND last_name='Jones';
11. SELECT DISTINCT email FROM customer WHERE first_name = 'Mar' OR first_name='Mary' OR First_name='Mari';
12. SELECT last_name, first_name FROM customer WHERE first_name LIKE 'Ma%';
13. SELECT staff_id, first_name, username FROM staff WHERE staff_id=10;
14. SELECT last_name, first_name FROM customer WHERE first_name LIKE 'M%' AND LENGTH(First_name) >=3 AND LENGTH(first_name) <=5;
15. SELECT last_name, first_name FROM customer WHERE first_name LIKE '%Bra%' AND last_name NOT LIKE 'Motley';
16. SELECT Store_id FROM customer GROUP BY store_id HAVING COUNT(customer) > 300;
17. SELECT * FROM customer GROUP BY customer.customer_id HAVING SUM(amount) > 200;
18. SELECT * FROM film WHERE film_id < 4;
19. SELECT * FROM address;
20. n
21. SELECT * FROM customer WHERE STORE_ID='2' OR CUSTOMER_ID='7';
22. SELECT * FROM customer WHERE amount > '200';
23. SELECT amount, payment_date from payment WHERE amount<2;
24. SELECT DISTINCT * FROM actor WHERE first_name = 'Chris' OR first_name= 'Cameron' OR first_name='Cuba';
25. SELECT last_name FROM customer WHERE first_name = 'John';
26. SELECT staff_id, first_name, username FROM staff WHERE store_id < 6;
27. SELECT release_year, rental_duration, rental_rate FROM film;
28. SELECT CITY_id, country_id FROM country WHERE city= 'New York';
29. SELECT * from city;
30. SELECT film_id from film_category WHERE category_id=2; WORKED: Displayed 66 rows!
