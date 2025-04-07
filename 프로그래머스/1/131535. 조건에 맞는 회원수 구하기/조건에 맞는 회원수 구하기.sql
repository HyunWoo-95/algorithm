-- 코드를 입력하세요
SELECT count(user_id) 
from USER_INFO users
-- where joined between to_date('2021-01-01', 'yyyy-mm-dd') and to_date('2021-12-31', 'yyyy-mm-dd')
where extract(year from joined) = '2021'
and age >= 20 and age <= 29;