insert into users values('user','{noop}pass',true);
insert into users values('admin','{noop}pass',true);

insert into authorities values ('user','ROLE_DEVELOPER');
insert into authorities values ('admin','ROLE_ADMIN');

insert into t_branch values (1,'Issue Tracker Project');

insert into t_user values (1,'Derya','Kaya','user',1);
insert into t_user values (2,'Demonlock','','admin',1);

insert into t_actionType values(1,'Todo');
insert into t_actionType values(2,'Work');
insert into t_actionType values(3,'Test');
insert into t_actionType values(4,'Finish');

insert into t_issue(id,createdate,scheduleddate,subject,body,closed) values (1,'2018-08-26','2018-09-10','Deveploping Issue Tracking Project','Develop whole project',0);
insert into t_issue(id,createdate,scheduleddate,subject,body,closed) values (2,'2018-08-30','2018-09-10','Todo Test 1','Todo Test 1 Body',0);
insert into t_issue(id,createdate,scheduleddate,subject,body,closed) values (3,'2018-08-30','2018-09-10','Todo Test 2','Todo Test 2 Body',0);
insert into t_issue(id,createdate,scheduleddate,subject,body,closed) values (4,'2018-08-30','2018-09-10','Todo Test 3','Todo Test 3 Body',0);
insert into t_issue(id,createdate,scheduleddate,subject,body,closed) values (5,'2018-08-30','2018-09-10','Todo Test 4','Todo Test 4 Body',0);
insert into t_issue(id,createdate,scheduleddate,subject,body,closed) values (6,'2018-08-30','2018-09-10','Todo Test 5','Todo Test 5 Body',0);
insert into t_issue(id,createdate,scheduleddate,subject,body,closed) values (7,'2018-08-30','2018-09-10','Todo Test 6','Todo Test 6 Body',0);
insert into t_issue(id,createdate,scheduleddate,subject,body,closed) values (8,'2018-08-30','2018-09-10','Working Test 1','Working Test 1 Body',0);
insert into t_issue(id,createdate,scheduleddate,subject,body,closed) values (9,'2018-08-30','2018-09-10','Finished Test 1','Finished Test 1 Body',0);

insert into t_issueAction(id,actiondate,read,userid,issueid,actiontypeid) values (1,'2018-08-26',0,1,1,1);
insert into t_issueAction(id,actiondate,read,userid,issueid,actiontypeid) values (2,'2018-08-30',0,1,2,1);
insert into t_issueAction(id,actiondate,read,userid,issueid,actiontypeid) values (3,'2018-08-30',0,1,3,1);
insert into t_issueAction(id,actiondate,read,userid,issueid,actiontypeid) values (4,'2018-08-30',0,1,4,1);
insert into t_issueAction(id,actiondate,read,userid,issueid,actiontypeid) values (5,'2018-08-30',0,1,5,1);
insert into t_issueAction(id,actiondate,read,userid,issueid,actiontypeid) values (6,'2018-08-30',0,1,6,1);
insert into t_issueAction(id,actiondate,read,userid,issueid,actiontypeid) values (7,'2018-08-30',0,1,7,1);
insert into t_issueAction(id,actiondate,read,userid,issueid,actiontypeid) values (8,'2018-08-30',0,1,8,2);
insert into t_issueAction(id,actiondate,read,userid,issueid,actiontypeid) values (9,'2018-08-30',0,1,9,3);

insert into t_issueMessage values (1,'Test 1','Sample Message 1',0,'2018-08-26',1,1);


