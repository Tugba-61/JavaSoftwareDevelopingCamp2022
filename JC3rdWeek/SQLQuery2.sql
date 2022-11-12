--Select
Select ContactName,CompanyName,City from Customers

Select * from Customers where City = 'London'
--case insensitive
Select * from Products where CategoryID=1 or CategoryID=3

select * from PRoducts where categoryId=1 and UnitPrice<=20
select * from Products order by CategoryID,ProductName
select * from Products where unitprice<50 order by UnitPrice desc --ascending  --descending
select count(*) from Products where CategoryID=5
select count(*) Adet from Products
select CategoryID, count(*) from Products group by CategoryID having count(*)<10

select Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName 
from products  inner join Categories
on Products.CategoryID = Categories.CategoryID
where Products.UnitPrice>10
--DTO Data Tranformation Object

Select * from Products p left join [Order Details] od
on p.ProductID = od.ProductID
inner join Orders o
on o.OrderID = od.OrderID

select * from Customers c left join Orders o
on c.CustomerID = o.CustomerID
where o.CustomerID is null





