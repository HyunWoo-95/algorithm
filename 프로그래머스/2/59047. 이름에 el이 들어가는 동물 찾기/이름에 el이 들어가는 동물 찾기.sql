-- 코드를 입력하세요
SELECT animal_id, name from ANIMAL_INS
where REGEXP_LIKE(name, 'el', 'i') 
and animal_type = 'Dog'
order by name