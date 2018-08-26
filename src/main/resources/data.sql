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

insert into t_issue values (1,'2018-08-26','2018-09-10','Deveploping Issue Tracking Project','Develop whole project',0);

insert into t_issueAction values (1,'2018-08-26',0,1,1,1);

insert into t_issueMessage values (1,'Test 1','Sample Message 1',0,'2018-08-26',1,1);


