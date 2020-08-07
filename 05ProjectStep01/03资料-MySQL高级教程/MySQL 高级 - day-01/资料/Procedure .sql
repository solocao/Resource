-- ���ݶ������߱������ж���ǰ��ߵ�������������� 

-- 	180 ������ ----------> ��ĸ���

--	170 - 180  ---------> ��׼���

--	170 ����  ----------> һ�����
	
	
create procedure pro_test4()
begin
  declare height int default 175;
  declare description varchar(50) default '';
  if height >= 180 then
    set description='��ĸ���';
  elseif height >= 170 and height < 180 then
    set description='��׼���';
  else
    set description='һ�����';
  end if;
  select concat('��� ', height , '��Ӧ���������Ϊ:',description);
end$
	
	
	
-- ���ݴ��ݵ���߱������ж���ǰ��ߵ�������������� 	

create procedure pro_test5(in height int)
begin
  declare description varchar(50) default '';
  if height >= 180 then
    set description='��ĸ���';
  elseif height >= 170 and height < 180 then
    set description='��׼���';
  else
    set description='һ�����';
  end if;
  select concat('��� ', height , '��Ӧ���������Ϊ:',description);
end$	
	
	
-- ���ݴ������߱�������ȡ��ǰ��ߵ��������������(����ֵ)

create procedure pro_test6(in height int , out description varchar(10))
begin
  if height >= 180 then
    set description='��ĸ���';
  elseif height >= 170 and height < 180 then
    set description='��׼���';
  else
    set description='һ�����';
  end if;
end$
 

 
-- ����һ���·�, Ȼ���������ڵļ���

create procedure pro_test7(mon int)
begin
  declare result varchar(10);
  case
    when mon>=1 and mon <= 3 then
	  set result='��һ����';
	when mon>=4 and mon <= 6 then
	  set result='�ڶ�����';
    when mon>=7 and mon <= 9 then
	  set result='��������';
	ELSE
	  set result='���ļ���';
  end case;
  select concat('���ݵ��·�Ϊ:',mon,', ������Ľ��Ϊ:',result) as content;
end$



-- �����1�ӵ�n��ֵ -- �ۼ�
create procedure pro_test8(n int)
begin
  declare total int default 0;
  declare num int default 1;
  while num<=n do
    set total = total + num;
	set num = num + 1;
  end while;
  select total;
end$



-- �����1�ӵ�n��ֵ -------> repeat
create procedure pro_test9(n int)
begin
  declare total int default 0;
  repeat
    set total=total+n;
    set n=n-1;
    until n=0
  end repeat;
  select total;
end$


-- �����1�ӵ�n��ֵ ------> loop  ... leave
create procedure pro_test10(n int)
begin
  declare total int default 0;
  
  c:loop
    set total = total + n;
    set n = n -1;
	
	if n <= 0 then
	  leave c;
	end if;  
  end loop c;
  
  select total;
end$


-- ��ѯemp��������, �����л�ȡ����չʾ
create procedure pro_test11()
begin
  declare e_id int(11);
  declare e_name varchar(50);
  declare e_age int(11);
  declare e_salary int(11);
  declare emp_result cursor for select * from emp;
  
  open emp_result;
  
  fetch emp_result into e_id,e_name,e_age,e_salary;
  select concat('id=',e_id , ', name=',e_name, ', age=', e_age, ', н��Ϊ: ',e_salary);
  
  fetch emp_result into e_id,e_name,e_age,e_salary;
  select concat('id=',e_id , ', name=',e_name, ', age=', e_age, ', н��Ϊ: ',e_salary);
  
  fetch emp_result into e_id,e_name,e_age,e_salary;
  select concat('id=',e_id , ', name=',e_name, ', age=', e_age, ', н��Ϊ: ',e_salary);
  
  fetch emp_result into e_id,e_name,e_age,e_salary;
  select concat('id=',e_id , ', name=',e_name, ', age=', e_age, ', н��Ϊ: ',e_salary);
  
  fetch emp_result into e_id,e_name,e_age,e_salary;
  select concat('id=',e_id , ', name=',e_name, ', age=', e_age, ', н��Ϊ: ',e_salary);
  
  close emp_result;
end$


create procedure pro_test12()
begin
  declare e_id int(11);
  declare e_name varchar(50);
  declare e_age int(11);
  declare e_salary int(11);
  declare has_data int default 1;
  
  declare emp_result cursor for select * from emp;
  DECLARE EXIT HANDLER FOR NOT FOUND set has_data=0;
  
  open emp_result;
  
  repeat
    fetch emp_result into e_id,e_name,e_age,e_salary;
    select concat('id=',e_id , ', name=',e_name, ', age=', e_age, ', н��Ϊ: ',e_salary);
    until has_data = 0
  end repeat;
  
  close emp_result;
end$




-- ����һ���洢����, ��ȡ�������� (city) ���ܼ�¼�� ;
create function fun1(countryId int)
RETURNS int
begin
  declare cnum int ;
  
  select count(*) into cnum from city where country_id = countryId;
  
  return cnum;
end$

	
	
-- ͨ����������¼ emp ������ݱ����־ emp_logs , ��������, �޸� , ɾ�� ; 	
create trigger emp_insert_trigger
after insert
on emp
for each row
begin
  
  insert into emp_logs(id,operation,operate_time,operate_id,operate_params) values(null,'insert',now(),new.id,concat('�����(id:',new.id,', name:',new.name,', age:',new.age, ', salary: ', new.salary,')'));
  
end$
	
	
	

create trigger emp_update_trigger
after update
on emp
for each row
begin
  
  insert into emp_logs(id,operation,operate_time,operate_id,operate_params) values(null,'update',now(),new.id, concat('�޸�ǰ(id:',old.id,', name:',old.name,', age:',old.age, ', salary: ', old.salary,'), �޸ĺ�(',new.id,', name:',new.name,', age:',new.age, ', salary: ', new.salary));
  
end$


create trigger emp_delete_trigger
after delete
on emp
for each row
begin
  
  insert into emp_logs(id,operation,operate_time,operate_id,operate_params) values(null,'delete',now(),old.id, concat('ɾ��ǰ(id:',old.id,', name:',old.name,', age:',old.age, ', salary: ', old.salary,')'));
  
end$
	
	
	
	
	
	
	
	
	
	
	
	