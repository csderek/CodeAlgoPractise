# Write your MySQL query statement below
Select firstName, lastname, city, state from Person p left join Address a on p.personId = a.personId;