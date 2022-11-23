select * from EmployeeDetails;
create table EmployeeDetails (EMPid varchar(20), FullName varchar(255), ManagerID varchar(255), DateOfJoining date, city varchar(255), primary key (EmpId));
create table EmployeeSalary (EMPid varchar(20), Project varchar(255), Salary varchar(255), Variable varchar(255));
 insert into EmployeeDetails values('121', 'John Snow', '321', 01/31/2019, 'Toronto');   
 insert into EmployeeDetails values('321', 'Walter White', '986', 01/30/2020, 'California'); 
 insert into EmployeeDetails values('421', 'Kuldeep Rana', '876', 27/11/2021, 'New Delhi'); 
 select * from EmployeeSalary;
 insert into EmployeeSalary values('121', 'P1', '8000', '500');  
 insert into EmployeeSalary values('321', 'P2', '10000', '1000');
 insert into EmployeeSalary values('421', 'P1', '12000', '0');

Q1 Ans: select EMPid, FullName from EmployeeDetails where ManagerID='986';

Q2 Ans: select Project from EmployeeSalary;

Q3 Ans: select count(EmpId) from EmployeeSalary where project = 'P1';

Q4 Ans: select max(salary) from EmployeeSalary;
        select min(salary) from EmployeeSalary;
        select avg(salary) from EmployeeSalary; 
	
Q5 Ans: select salary from EmployeeSalary where salary between 9000 AND 15000;

Q6 Ans: select EmpId from EmployeeDetails where city = 'Toronto' Or ManagerId= '321';

Q7 Ans: select EmpId from EmployeeDetails where city = 'California' Or ManagerId= '321';

Q8 Ans: select EmpId from EmployeeSalary where Not Project = 'P1';

Q9 Ans: select sum(Salary + Variable) as TotalSalary from EmployeeSalary where EmpId = '121';
        select sum(Salary + Variable) as TotalSalary from EmployeeSalary where EmpId = '321';
        select sum(Salary + Variable) as TotalSalary from EmployeeSalary where EmpId = '421';
		
Q10 Ans: select FullName from EmployeeDetails where FullName like '__hn%';

Q11 Ans: select EmployeeDetails.EmpId  from EmployeeDetails inner join EmployeeSalary on EmployeeDetails.EmpId=EmployeeSalary.EmpId where EmployeeDetails.EmpId=EmployeeSalary.EmpId;  

Q12 Ans: select EmployeeDetails.EmpId , EmployeeSalary.EmpId from EmployeeDetails inner join EmployeeSalary on EmployeeDetails.EmpId=EmployeeSalary.EmpId;

Q13 Ans: select EmployeeDetails.EmpId, EmployeeDetails.FullName, EmployeeDetails.ManagerId, EmployeeDetails.DateOfJoining, EmployeeDetails.City, EmployeeSalary.Project, EmployeeSalary.Salary, EmployeeSalary.Variable from EmployeeDetails left join EmployeeSalary on EmployeeDetails.EmpId = EmployeeSalary.EmpId;
	 	
Q14 Ans: select EmployeeDetails.EmpId, EmployeeSalary.EmpId from EmployeeDetails inner join EmployeeSalary on
         EmployeeDetails.EmpId = EmployeeSalary.EmpId;		
		 
Q15 Ans: select EmployeeDetails.EmpId, EmployeeSalary.EmpId from EmployeeDetails right join EmployeeSalary on
EmployeeDetails.EmpId = EmployeeSalary.EmpId;

Q16: update EmployeeDetails set FullName = 'John-Snow' where EmpId =121;
     update EmployeeDetails set FullName = 'Walter-White' where EmpId =321;
     update EmployeeDetails set FullName = 'Kuldeep-Rana' where EmpId =421;

Q17 Ans: 

Q18 Ans: select EmpId, ManagerId from EmployeeDetails;

Q19 Ans: 

Q20 Ans: 	 update EmployeeDetails set FullName = 'JOHN SNOW',city = 'toronto' where EmpId =121;
             update EmployeeDetails set FullName = 'WALTER WHITE' , city = 'california' where EmpId =321;
             update EmployeeDetails set FullName = 'KULDEEP RANA' , city = 'new delhi' where EmpId =421;
	 
Q21 Ans: select FullName, Locate('n', FullName) from EmployeeDetails ;

Q22 Ans: update EmployeeDetails set FullName = 'JohnSnow' where EmpId =121;
     update EmployeeDetails set FullName = 'WalterWhite' where EmpId =321;
     update EmployeeDetails set FullName = 'KuldeepRana' where EmpId =421;

Q23 Ans: select EmpId from EmployeeSalary where Not Project = 'P1' AND 'P2';

Q24 Ans: select Salary from EmployeeSalary where Salary between 5000 and 10000;

Q25 Ans: select current_timestamp();

Q26 Ans: select EmpId from EmployeeDetails where DateOfJoining = 2020;

Q27 Ans:  select EmployeeDetails.EmpId, EmployeeSalary.EmpId from EmployeeDetails left join EmployeeSalary on
         EmployeeDetails.EmpId = EmployeeSalary.EmpId;
		 
Q28 Ans: select EmpId, Project from EmployeeSalary order by project desc;

Q29: Ans: select EmployeeDetails.FullName, EmployeeSalary.Salary from EmployeeDetails inner join EmployeeSalary on
         EmployeeDetails.EmpId = EmployeeSalary.EmpId;

Q30 Ans: select fullname, ManagerId from EmployeeDetails;		 