create database LMS;
use lms;
create table student(
logid varchar(20) primary key,
logpass varchar(20),
stdfirstname varchar(20),
stdlastname varchar(20),
stdsurname varchar(10),
stdemail varchar(40),
stdmobile varchar(12),
stdcity varchar(20),
stdaddress varchar(50),
stdnic varchar(15),
guardianname varchar(20),
guardiannum varchar(12)
);


create table instructor(
logid varchar(20) primary key,
logpass varchar(20),
fname varchar(20),
lname varchar (20),
salary varchar(10),
isubject varchar(20),
irank varchar(5),
mobile varchar(14),
city varchar(20),
nic varchar(15),
email varchar(40),
department varchar(20)
);


create table queries(
stdid varchar(20),
teachid varchar(20),
sent varchar(100),
recieve varchar(100),
turn int default 0,
FOREIGN KEY (stdid) REFERENCES student (logid),
FOREIGN KEY (teachid) REFERENCES instructor (logid),
primary key(stdid,teachid));

insert into queries(stdid,teachid,sent,turn) value('023-20-0175','INS-0200','Hello sir',1);
update queries set sent='Hello sir welcome to IBA we wish you best of luck',turn=1 where stdid='023-20-0174' and teachid='INS-0200';
update queries set recieve='Thanks',turn=0 where stdid='023-20-0174' and teachid='INS-0200';
select * from queries;
select stdid from queries where teachid='INS-0200' and turn=1;

delete from queries where stdid='023-20-0175';
update queries set recieve="Meet me for further consultation" where stdid='023-20-0174' and teachid='INS-0201';
Replace into queries(stdid,teachid,sent) values('023-20-0175','INS-0200','Shit');

drop table queries;
select sent from queries where stdid='023-20-0174' && teachid='INS-0200';
delete from sent where stdid='023-20-0174' && teachid='INS-0200';
select sent from queries where stdid='' && teachid='INS-0200';



Create table course(
course_id varchar(7) primary key ,
course_title varchar(30),
credit int(2),
pre_req varchar(7)
);
drop table course;
select * from course;


Create Table enroll(
ins_id varchar(20),
course_id varchar(7),
FOREIGN KEY (ins_id) REFERENCES instructor (logid),
FOREIGN KEY (course_id) REFERENCES course (course_id));
insert into enroll value('INS-0200','CS-0200');
insert into enroll value('INS-0201','CS-0201');
insert into enroll value('INS-0201','MS-0200');
select * from enroll;
select* from course;
select * from std_enrol;
select s.course_id,c.course_title,c.credit,c.pre_req from std_enrol s join course c on s.course_id=c.course_id and s.logid='023-20-0174';
select* from student;
select e.logid as 'Student Id',concat(s.stdfirstname,' ',s.stdlastname) as 'Full Name',s.stdemail from std_enrol e join student s on e.logid=s.logid and e.course_id='CS-003';
 


drop table enroll;
select course_id from enroll where ins_id='INS-0200';
select concat(s.stdfirstname,' ',s.stdlastname) as 'Full Name',e.course_id,c.course_title from student s join enroll e join course c on s.logid=e.std_id and e.course_id=c.course_id;



create table std_enrol(
course_id varchar(7),
logid varchar(20),
FOREIGN KEY (logid) REFERENCES student (logid),
FOREIGN KEY (course_id) REFERENCES course (course_id),
primary key(course_id,logid));

drop table std_enrol;
select * from std_enrol;
-- enroll course instructor
-- select c.course_id,c.course_title,c.pre_req,concat(i.fname,' ',i.lname) as 'Full Name' from enroll e join instructor i join course c on e.ins_id=i.logid and e.course_id=c.course_id;
select course_title,pre_req from course where course_id="CS-0201";
select concat(i.fname,' ',i.lname) from enroll e join instructor i on e.ins_id=i.logid and e.course_id='CS-0201';

select* from course;

select* from std_enrol;



Create table quizquestion(
question varchar(200),
course_id varchar(7),
quiz_id varchar(7),
question_no int default 0,
attempt_date date,
qstart time,
qend time,
primary key (quiz_id,question_no),
foreign key (course_id) references course(course_id));
select * from course;
select* from quizquestion;
delete from quizquestion where quiz_id='QU-100';
drop table quizquestion;
update quizquestion set question='Flufy' where quiz_id='QU-000' and question_no=5;
select attempt_date from quizquestion where question_no=1 and quiz_id='QU-100';
select curdate();
select current_time();
select cast(GETDATE() as Date);

Create table quizanswer(
std_id varchar(20),
quiz_id varchar(7),
question_no int,
turn int  default 0,
answer varchar(200),
primary key(std_id,quiz_id,question_no),
foreign key (std_id) references student(logid),
foreign key (quiz_id) references quizquestion (quiz_id));

drop table quizanswer;


insert into quizanswer(std_id,quiz_id,question_no) value ('023-20-0174','QU-001',1);
insert into quizanswer(std_id,quiz_id,question_no) values ('023-20-0174','QU-001',1),('023-20-0174','QU-001',2);
select * from quizanswer;



select* from course;
select* from enroll;
select concat(i.fname,' ',i.lname) as 'Full Name' from enroll e join instructor i on e.ins_id=i.logid and e.course_id='CS-003';















select * from student;
select* from instructor;
select * from queries;
select * from course;
select * from enroll;
select * from std_enrol;
select* from quizquestion;
select * from quizanswer;


DROP table student;
DROP table instructor;
DROP table queries;
DROP table course;
DROP table enroll;
DROP table std_enrol;
DROP table quizquestion;
DROP table quizanswer;