-- 코드를 입력하세요
SELECT member_id, member_name, gender, TO_CHAR(date_of_birth,'yyyy-mm-dd') from member_profile
where gender = 'W'
and  TO_CHAR(DATE_OF_BIRTH,'MM') = '03'
and TLNO is not null
order by member_id