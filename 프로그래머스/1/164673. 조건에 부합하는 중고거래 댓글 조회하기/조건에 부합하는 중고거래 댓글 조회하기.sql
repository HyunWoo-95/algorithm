-- 코드를 입력하세요
-- 제목, 게시글 id, 댓글 id, 작성자 id, 내용, 작성일
-- 정렬 댓글 작성일 asc, 게시글 제목 asc
SELECT b.title, b.board_id, r.reply_id, r.writer_id, r.contents,
to_char(r.CREATED_DATE, 'yyyy-mm-dd') as created_date
from USED_GOODS_BOARD b
inner join USED_GOODS_REPLY r on b.board_id = r.board_id
where extract(year from b.CREATED_DATE) = '2022' 
and extract(month from b.CREATED_DATE) = '10'
-- where to_char(b.created_DATE,'yyyymm') = '202210'
order by r.CREATED_DATE, b.title asc