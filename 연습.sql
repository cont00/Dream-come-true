use khn;

create table 학생
(
	학번 CHAR(5) not null,
    이름 CHAR(20),
    학년 int(3),
    신장 int(3),
    소속 CHAR(5)
);

create table 수강
(
	학번 char(5) not null,
	번호 char(3) not null,
    성적 int(3) not null
);

create table 설강
(
	번호 int(3),
    교수명 char(20),
    과목명 char(10),
    소속 char(10)
);

insert into 학생 (학번,이름,학년,신장,소속) values ('08001', '홍길동', 2, 170, 'CD');
insert into 학생 (학번,이름,학년,신장,소속) values ('07002', '김길동', 4, 188, 'CD');
insert into 학생 (학번,이름,학년,신장,소속) values ('07012', '박길동', 2, 180, 'CD');
insert into 학생 (학번,이름,학년,신장,소속) values ('07033', '이길동', 3, 175, 'ID');
insert into 학생 (학번,이름,학년,신장,소속) values ('05014', '최길동', 4, 183, 'ED');
insert into 학생 (학번,이름,학년,신장,소속) values ('08032', '정길동', 3, 185, 'ED');

insert into 수강 (학번,번호,성적) values ('08001', '101', 95);
insert into 수강 (학번,번호,성적) values ('08001', '102', 80);
insert into 수강 (학번,번호,성적) values ('08001', '103', 60);
insert into 수강 (학번,번호,성적) values ('08001', '104', 80);
insert into 수강 (학번,번호,성적) values ('08001', '105', 85);
insert into 수강 (학번,번호,성적) values ('07002', '101', 80);
insert into 수강 (학번,번호,성적) values ('07002', '102', 95);
insert into 수강 (학번,번호,성적) values ('07012', '102', 70);
insert into 수강 (학번,번호,성적) values ('07012', '103', 80);
insert into 수강 (학번,번호,성적) values ('07033', '102', 85);
insert into 수강 (학번,번호,성적) values ('05014', '104', 90);
insert into 수강 (학번,번호,성적) values ('05014', '105', 75);

insert into 설강 (번호,교수명,과목명,소속) values (101, '김일삼', 'SE', 'CD');
insert into 설강 (번호,교수명,과목명,소속) values (102, '권오열', 'DB', 'CD');
insert into 설강 (번호,교수명,과목명,소속) values (103, '김소월', 'DG', 'MD');
insert into 설강 (번호,교수명,과목명,소속) values (104, '이상', 'FP', 'CD');
insert into 설강 (번호,교수명,과목명,소속) values (105, '이석영', 'CS', 'ED');

select * from 학생;
select * from 수강;
select * from 설강;

delete from 학생;
delete from 수강;
delete from 설강;

drop table 학생;
drop table 수강;
drop table 설강;

set sql_safe_updates=0;


update 학생
set 학번='07002'
where 이름='김길동';

# 1번문제
select 이름, 신장 from 학생; 

# 2번문제
select 학번,이름,소속 from 학생
where 학번='08001';

# 3번문제
select * from 학생
where 학년=3 and 소속='ID';

# 4번문제
select 이름,신장,소속 from 학생
where 신장>=170;

# 5번문제
select 학번,성적 from 수강
where 성적>=80 and 성적>=90;

# 6번문제
select * from 학생
where 소속 != 'CD';

# 7번문제
select 교수명,과목명 from 설강
where 교수명 like '김%';

# 8번문제
select 교수명,과목명 from 설강
where 교수명 like '이_';

# 9번문제
select * from 설강
where 교수명 not like '김%';

# 10번문제
select 학년,신장 from 학생
where 소속 = 'CD' and 신장>=170;

# 11번문제
select * from 학생
order by 신장 desc;

# 12번문제
select * from 학생
where 소속 = 'CD'
order by 신장;

# 13번문제
select * from 학생
where 소속 not in ('ID', 'ED');