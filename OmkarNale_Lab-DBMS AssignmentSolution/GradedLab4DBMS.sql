#1) You are required to create tables for supplier,customer,category,product,supplier_pricing,order,rating to store the data for the Ecommerce with the schema definition given below.

CREATE TABLE IF NOT EXISTS `supplier`(
`SUPP_ID` INT PRIMARY KEY,
`SUPP_NAME` varchar(50) NOT NULL,
`SUPP_CITY` varchar(50),
`SUPP_PHONE` varchar(10) NOT NULL
);

CREATE TABLE IF NOT EXISTS `customer`(
`CUS_ID` INT NOT NULL PRIMARY KEY,
`CUS_NAME` varchar(50) NOT NULL,
`CUS_PHONE` varchar(50) NOT NULL,
`CUS_CITY` varchar(10) NOT NULL,
`CUS_GENDER` CHAR
);

CREATE TABLE IF NOT EXISTS `category`(
`CAT_ID`INT NOT NULL PRIMARY KEY,
`CAT_Name` Varchar(20) NOT NULL
);

CREATE TABLE IF NOT EXISTS `product`(
`PRO_ID` INT NOT NULL PRIMARY KEY,
`PRO_NAME` varchar(20) NOT NULL DEFAULT "Dummy product",
`PRO_DESC` varchar(60),
`CAT_ID` INT NOT NULL,
FOREIGN Key (`CAT_ID`) REFERENCES category (`CAT_ID`)
);

CREATE TABLE IF NOT EXISTS `supplier_pricing`(
`PRICING_ID` INT NOT NULL PRIMARY KEY,
`PRO_ID` INT NOT NULL,
`SUPP_ID` INT NOT NULL,
`SUPP_PRICE` INT DEFAULT 0,
FOREIGN Key (`PRO_ID`) REFERENCES product (`PRO_ID`),
FOREIGN KEY (`SUPP_ID`) REFERENCES SUPPLIER(`SUPP_ID`)
);

CREATE TABLE IF NOT EXISTS `order` (
 `ORD_ID` INT NOT NULL PRIMARY KEY,
 `ORD_AMOUNT` INT NOT NULL,
 `ORD_DATE` DATE,
 `CUS_ID` INT NOT NULL,
 `PRICING_ID` INT NOT NULL,
 FOREIGN KEY (`CUS_ID`) REFERENCES CUSTOMER(`CUS_ID`),
 FOREIGN KEY (`PRICING_ID`) REFERENCES SUPPLIER_PRICING(`PRICING_ID`)
 );
 
 CREATE TABLE IF NOT EXISTS `rating`(
 `RAT_ID` INT NOT NULL PRIMARY KEY,
 `ORD_ID` INT NOT NULL,
 `RAT_RATSTARS` INT NOT NULL,
 
 FOREIGN KEY (`ORD_ID`) REFERENCES `order` (`ORD_ID`)
 );

#2)Insert the following data in the table created above

#Supplier Table-
INSERT INTO SUPPLIER VALUES(1,"Rajesh Retails","Delhi",'1234567890');
INSERT INTO SUPPLIER VALUES(2,"Appario Ltd.","Mumbai",'2589631470');
INSERT INTO SUPPLIER VALUES(3,"Knome products","Banglore",'9785462315');
INSERT INTO SUPPLIER VALUES(4,"Bansal Retails","Kochi",'8975463285');
INSERT INTO SUPPLIER VALUES(5,"Mittal Ltd.","Lucknow",'7898456532');

#Customer Table-
INSERT INTO CUSTOMER VALUES(1,"AAKASH",'9999999999',"DELHI",'M');
INSERT INTO CUSTOMER VALUES(2,"AMAN",'9785463215',"NOIDA",'M');
INSERT INTO CUSTOMER VALUES(3,"NEHA",'9999999999',"MUMBAI",'F');
INSERT INTO CUSTOMER VALUES(4,"MEGHA",'9994562399',"KOLKATA",'F');
INSERT INTO CUSTOMER VALUES(5,"PULKIT",'7895999999',"LUCKNOW",'M');

#Category Table-
INSERT INTO CATEGORY VALUES( 1,"BOOKS");
INSERT INTO CATEGORY VALUES(2,"GAMES");
INSERT INTO CATEGORY VALUES(3,"GROCERIES");
INSERT INTO CATEGORY VALUES (4,"ELECTRONICS");
INSERT INTO CATEGORY VALUES(5,"CLOTHES");

#Product Table-
INSERT INTO PRODUCT VALUES(1,"GTA V","Windows 7 and above with i5 processor and 8GB RAM",2);
INSERT INTO PRODUCT VALUES(2,"TSHIRT","SIZE-L with Black, Blue and White variations",5);
INSERT INTO PRODUCT VALUES(3,"ROG LAPTOP","Windows 10 with 15inch screen, i7 processor, 1TB SSD",4);
INSERT INTO PRODUCT VALUES(4,"OATS","Highly Nutritious from Nestle",3);
INSERT INTO PRODUCT VALUES(5,"HARRY POTTER","Best Collection of all time by J.K Rowling",1);
INSERT INTO PRODUCT VALUES(6,"MILK","1L Toned MIlk",3);
INSERT INTO PRODUCT VALUES(7,"Boat EarPhones","1.5Meter long Dolby Atmos",4);
INSERT INTO PRODUCT VALUES(8,"Jeans","Stretchable Denim Jeans with various sizes and color",5);
INSERT INTO PRODUCT VALUES(9,"Project IGI","compatible with windows 7 and above",2);
INSERT INTO PRODUCT VALUES(10,"Hoodie","Black GUCCI for 13 yrs and above",5);
INSERT INTO PRODUCT VALUES(11,"Rich Dad Poor Dad","Written by RObert Kiyosaki",1);
INSERT INTO PRODUCT VALUES(12,"Train Your Brain","By Shireen Stephen",1);

#Supplier_pricing Table-
INSERT INTO SUPPLIER_PRICING VALUES(1,1,2,1500);
INSERT INTO SUPPLIER_PRICING VALUES(2,3,5,30000);
INSERT INTO SUPPLIER_PRICING VALUES(3,5,1,3000);
INSERT INTO SUPPLIER_PRICING VALUES(4,2,3,2500);
INSERT INTO SUPPLIER_PRICING VALUES(5,4,1,1000);
INSERT INTO SUPPLIER_PRICING VALUES(6,12,2,780);
INSERT INTO SUPPLIER_PRICING VALUES(7,12,4,789);
INSERT INTO SUPPLIER_PRICING VALUES(8,3,1,31000);
INSERT INTO SUPPLIER_PRICING VALUES(9,1,5,1450);
INSERT INTO SUPPLIER_PRICING VALUES(10,4,2,999);
INSERT INTO SUPPLIER_PRICING VALUES(11,7,3,549);
INSERT INTO SUPPLIER_PRICING VALUES(12,7,4,529);
INSERT INTO SUPPLIER_PRICING VALUES(13,6,2,105);
INSERT INTO SUPPLIER_PRICING VALUES(14,6,1,99);
INSERT INTO SUPPLIER_PRICING VALUES(15,2,5,2999);
INSERT INTO SUPPLIER_PRICING VALUES(16,5,2,2999);


#Order Table-
INSERT INTO `ORDER` VALUES (101,1500,"2021-10-06",2,1);
INSERT INTO `ORDER` VALUES(102,1000,"2021-10-12",3,5);
INSERT INTO `ORDER` VALUES(103,30000,"2021-09-16",5,2);
INSERT INTO `ORDER` VALUES(104,1500,"2021-10-05",1,1);
INSERT INTO `ORDER` VALUES(105,3000,"2021-08-16",4,3);
INSERT INTO `ORDER` VALUES(106,1450,"2021-08-18",1,9);
INSERT INTO `ORDER` VALUES(107,789,"2021-09-01",3,7);
INSERT INTO `ORDER` VALUES(108,780,"2021-09-07",5,6);
INSERT INTO `ORDER` VALUES(109,3000,"2021-0-10",5,3);
INSERT INTO `ORDER` VALUES(110,2500,"2021-09-10",2,4);
INSERT INTO `ORDER` VALUES(111,1000,"2021-09-15",4,5);
INSERT INTO `ORDER` VALUES(112,789,"2021-09-16",4,7);
INSERT INTO `ORDER` VALUES(113,31000,"2021-09-16",1,8);
INSERT INTO `ORDER` VALUES(114,1000,"2021-09-16",3,5);
INSERT INTO `ORDER` VALUES(115,3000,"2021-09-16",5,3);
INSERT INTO `ORDER` VALUES(116,99,"2021-09-17",2,14);

#Rating table-
INSERT INTO RATING VALUES(1,101,4);
INSERT INTO RATING VALUES(2,102,3);
INSERT INTO RATING VALUES(3,103,1);
INSERT INTO RATING VALUES(4,104,2);
INSERT INTO RATING VALUES(5,105,4);
INSERT INTO RATING VALUES(6,106,3);
INSERT INTO RATING VALUES(7,107,4);
INSERT INTO RATING VALUES(8,108,4);
INSERT INTO RATING VALUES(9,109,3);
INSERT INTO RATING VALUES(10,110,5);
INSERT INTO RATING VALUES(11,111,3);
INSERT INTO RATING VALUES(12,112,4);
INSERT INTO RATING VALUES(13,113,2);
INSERT INTO RATING VALUES(14,114,1);
INSERT INTO RATING VALUES(15,115,1);
INSERT INTO RATING VALUES(16,116,0);


#3) Display the total number of customers based on gender who have placed orders of worth at least Rs.3000.

SELECT count(cus_gender) AS TotalNoOfCustomers, cus_gender 
FROM (
SELECT cus_gender, cus_name FROM customer AS cus
INNER JOIN
(
SELECT ord_id, cus_id FROM `order` WHERE ord_amount >= '3000'
)
AS o
ON cus.cus_id = o.cus_id
GROUP BY cus.cus_id
)
as T
GROUP BY cus_gender;

#4) Display all the orders along with product name ordered by a customer having Customer_Id=2

SELECT cus_name, pro_name, ord_id, ord_date, ord_amount 
FROM customer AS c, product p, supplier_pricing AS sp, `order` AS o 
WHERE c.cus_id = '2'
AND c.cus_id = o.cus_id
AND p.pro_id = sp.pro_id
AND o.pricing_id = sp.pricing_id;


#5) Display the Supplier details who can supply more than one product.

SELECT sup.supp_id, supp_name, supp_city, supp_phone 
FROM supplier AS sup
INNER JOIN
(
SELECT * FROM supplier_pricing GROUP BY 
supp_id HAVING count(supp_id) > 1 
) AS sp
ON sup.supp_id = sp.supp_id;


#6) Find the least expensive product from each category and print the table with category id, name, product name and price of the product

SELECT cat.CAT_ID, CAT_NAME, PRO_ID, PRO_NAME, min(MIN_PRICE) from category as cat
INNER JOIN
(
SELECT prod.PRO_ID, PRO_NAME, CAT_ID, MIN_PRICE FROM product AS prod
INNER JOIN
(
SELECT pro_id AS PRO_ID, min(supp_price) AS MIN_PRICE FROM supplier_pricing 
GROUP BY pro_id
) AS sp
ON prod.pro_id = sp.pro_id)
AS pro_sp
ON cat.cat_id = pro_sp.CAT_ID
GROUP BY cat_id;

#7) Display the Id and Name of the Product ordered after “2021-10-05”.

SELECT p.pro_id, p.pro_name 
FROM product AS p 
INNER JOIN 
(
SELECT pro_id, sp.pricing_id FROM supplier_pricing AS sp
INNER JOIN
(
SELECT pricing_id FROM `order` WHERE ord_date > "2021-10-05"
) AS o
ON sp.pricing_id = o.pricing_id
) AS sp_o
ON p.pro_id = sp_o.pro_id;


#8) Display customer name and gender whose names start or end with character 'A'.

SELECT customer.cus_name,customer.cus_gender 
FROM customer 
WHERE customer.cus_name LIKE 'A%' OR customer.cus_name LIKE '%A';

#9) Create a stored procedure to display supplier id, name, rating and Type_of_Service. For Type_of_Service, If rating =5, print “ExcellentService”,If rating >4 print “Good Service”, If rating >2 print “Average Service” else print “Poor Service”.

/*CREATE DEFINER=`root`@`localhost` PROCEDURE `display_supplierDetails`()
BEGIN
SELECT report.supp_id,report.supp_name,report.Average,
CASE
	WHEN report.Average =5 THEN 'Excellent Service'
	WHEN report.Average >4 THEN 'Good Service'
	WHEN report.Average >2 THEN 'Average Service'
ELSE 'Poor Service'
END AS Type_of_Service FROM
(SELECT final.supp_id, supplier.supp_name, final.Average FROM
(SELECT test2.supp_id, sum(test2.rat_ratstars)/count(test2.rat_ratstars) AS Average FROM
(SELECT supplier_pricing.supp_id, test.ORD_ID, test.RAT_RATSTARS FROM supplier_pricing INNER JOIN
(SELECT `order`.pricing_id, rating.ORD_ID, rating.RAT_RATSTARS FROM `order` INNER JOIN rating ON rating.`ord_id` = `order`.ord_id ) as test
ON test.pricing_id = supplier_pricing.pricing_id)
AS test2 GROUP BY supplier_pricing.supp_id)
AS final INNER JOIN supplier WHERE final.supp_id = supplier.supp_id) AS report;
END*/

call display_supplierDetails();
