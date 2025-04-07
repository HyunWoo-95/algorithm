-- 코드를 입력하세요
SELECT animal_id, name from animal_ins
where not INTAKE_CONDITION = 'Aged'
order by animal_id