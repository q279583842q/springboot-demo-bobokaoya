create or replace view v_blogs is
SELECT
	t1.*,t2.blogs_type_name blogs_type_name,stu_name
FROM t_blogs t1 LEFT JOIN t_blogs_type t2
on t1.blogs_type_id = t2.type_id 
LEFT JOIN t_student t3 ON t1.stu_id = t3.stu_id 