--CONN TO HR
SELECT UPPER(FIRST_NAME) FROM EMPLOYEES;
SELECT LOWER(FIRST_NAME) FROM EMPLOYEES;
SELECT CONCAT(FIRST_NAME, LAST_NAME) FROM EMPLOYEES;
SELECT MONTHS_BETWEEN(SYSDATE, '19/11/13') FROM DUAL;
SELECT MONTHS_BETWEEN('19/11/13', '19/01/13') FROM DUAL;
SELECT SYSTIMESTAMP, EXTRACT(YEAR FROM SYSDATE), EXTRACT(MONTH FROM SYSDATE), EXTRACT(DAY FROM SYSDATE), EXTRACT(HOUR FROM SYSTIMESTAMP ), EXTRACT(MINUTE FROM SYSTIMESTAMP ) FROM DUAL;
ALTER SESSION SET TIME_ZONE = '+9:0';
SELECT SYSTIMESTAMP, EXTRACT(YEAR FROM SYSDATE), EXTRACT(MONTH FROM SYSDATE), EXTRACT(DAY FROM SYSDATE), EXTRACT(HOUR FROM SYSTIMESTAMP ), EXTRACT(MINUTE FROM SYSTIMESTAMP ) FROM DUAL;

SELECT JOB_ID, AVG(SALARY), NVL2(AVG(SALARY),1,0) AS IS_EMPTY FROM EMPLOYEES GROUP BY JOB_ID ORDER BY AVG(SALARY) DESC;

SELECT JOB_ID, AVG(SALARY), AVG(SALARY)/COUNT(*) FROM EMPLOYEES GROUP BY JOB_ID ORDER BY AVG(SALARY) DESC;
SELECT JOB_ID, AVG(SALARY), ROUND( (AVG(SALARY)/COUNT(*))*10 )/10 FROM EMPLOYEES GROUP BY JOB_ID ORDER BY AVG(SALARY) DESC;

SELECT JOB_ID, SUM(SALARY) FROM EMPLOYEES GROUP BY JOB_ID HAVING SUM(SALARY) > 30000 ORDER BY SUM(SALARY) DESC;