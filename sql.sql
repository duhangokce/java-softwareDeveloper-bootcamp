SELECT CustomerName,ContactName,City FROM [Customers]
SELECT * FROM [Customers] WHERE City='Berlin'
SELECT ProductName, Price FROM Products where Price<20
SELECT * FROM Products order by Price desc
SELECT * FROM Products where CategoryID=1 order by Price desc
SELECT count(*)adet from Products where CategoryID=1
SELECT CategoryID, count(*) from products where Price<20 group by CategoryID having count(*)<10
SELECT products.productname, categories.categoryname FROM products inner join categories on products.categoryID = categories.categoryID
SELECT * FROM Customers c left join orders o on c.customerID = o.customerID where o.customerID is null
--DTO Database Transformation Object
