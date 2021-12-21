--Задания с сайта sql-ex.ru
--1.
SELECT model, speed, hd FROM PC WHERE price < '500'

--2.
SELECT DISTINCT maker FROM Product WHERE type = 'printer'

--3.
SELECT model, ram, screen FROM Laptop WHERE price > '1000'

--4.
SELECT * FROM Printer WHERE color = 'y'

--5.
SELECT model, speed, hd FROM PC WHERE (cd = '12x' OR cd = '24x') AND price < 600

--6.
SELECT DISTINCT maker, speed FROM Product JOIN Laptop ON Product.model = Laptop.model WHERE Laptop.hd >= '10'

--7.
SELECT pr.model, pc.price FROM Product pr
JOIN PC pc ON pr.model = pc.model WHERE maker = 'B'
UNION
SELECT pr.model, l.price FROM Product pr
JOIN Laptop l ON pr.model = l.model WHERE maker = 'B'
UNION
SELECT pr.model, p.price FROM Product pr
JOIN Printer p ON pr.model = p.model WHERE maker = 'B'

--8.
SELECT DISTINCT maker FROM Product WHERE type = 'PC' EXCEPT
SELECT DISTINCT maker FROM Product WHERE type = 'Laptop'

--9.
SELECT maker FROM Product Pr JOIN PC pc ON Pr.model = pc.model WHERE pc.speed >= '450' GROUP BY maker

--10.
SELECT model, price FROM Printer WHERE price = (SELECT MAX(price) FROM Printer)

--11.
SELECT AVG(speed) FROM PC

--12.
SELECT AVG(speed) FROM Laptop WHERE price > '1000'

--13.
SELECT AVG(speed) FROM PC pc JOIN Product pr ON pc.model = pr.model
WHERE maker = 'A'

--14.
SELECT Classes.class, Ships.name, Classes.country 
from Classes JOIN Ships ON Classes.class = Ships.class
WHERE Classes.numGuns >= '10'

--15.
SELECT hd FROM PC GROUP BY hd HAVING COUNT(model) > 1

--16.
SELECT DISTINCT PC1.model AS model1, PC2.model AS model2, 
PC1.speed AS speed, PC1.ram AS ram
FROM PC AS PC1, PC PC2
WHERE PC1.speed = PC2.speed AND 
PC1.ram = PC2.ram AND PC1.model > PC2.model

--17.
SELECT DISTINCT pr.type, l.model, l.speed FROM Product pr, Laptop l
WHERE type = 'Laptop' AND speed < ALL(SELECT speed FROM PC)

--18.
SELECT DISTINCT pr.maker, p.price
FROM Printer p JOIN Product pr ON p.model = pr.model
WHERE price = (SELECT MIN(price) FROM Printer WHERE color ='y')
AND p.color ='y'

--19.
SELECT pr.maker, AVG(screen) as avg_screen FROM Product pr 
JOIN Laptop l ON pr.model = l.model 
GROUP BY pr.maker

--20.
SELECT maker, COUNT(model) FROM Product pr
WHERE type = 'PC' 
GROUP BY maker HAVING COUNT(model) >= 3

--21.
SELECT maker, MAX(price) FROM PC pc 
JOIN Product pr ON pr.model = pc.model
WHERE pr.type = 'PC' GROUP BY Pr.maker