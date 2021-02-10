## Part 1: Test it with SQL
//List the columns and their data types in the table.
job (
id INTEGER PRIMARY KEY AUTO_INCREMENT,
employer VARCHAR(40),
name VARCHAR(40),
skills VARCHAR(40),
employer_id INTEGER,
jobs_id INTEGER
);

## Part 2: Test it with SQL
--write a query to list the names of the employers in St. Louis City.
  SELECT name FROM employer WHERE location="st.louis";

## Part 3: Test it with SQL
--write the SQL statement to remove the job table
DROP TABLE job;

## Part 4: Test it with SQL
--write a query to return a list of the names and descriptions of all skills that are attached to jobs in alphabetical order.
select name, description from job_skills, skill s where s.id = skills_id order by name;