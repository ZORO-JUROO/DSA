CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
DECLARE offf int;
set offf=N-1;
  RETURN (
    select distinct salary from Employee order by salary desc limit 1 OFFSET offf
  );
END