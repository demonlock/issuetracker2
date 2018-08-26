create table users(
	username varchar(128) not null primary key,
	password varchar(512) not null,
	enabled boolean not null
);

create table authorities(
	username varchar(128) not null,
	authority varchar(128) not null
);

create unique index idx_auth_username on authorities(username,authority);

create table public.t_user(
	id bigint not null,
	firstname varchar(255),
	lastname varchar(255),
	username varchar(255),
	branchId bigint
);

create table public.t_branch(
	id bigint not null,
	branchname varchar(255)
);

create table public.t_actionType(
	id bigint not null,
	actionname varchar(255)
);

create table public.t_issueAction(
	id bigint not null,
	actionDate Date,
	read int,
	userId bigint,
	issueId bigint,
	actionTypeId bigint
);

create table public.t_issueMessage(
	id bigint not null,
	messageSubject varchar(max),
	messageBody varchar(max),
	importanceLevel int,
	createDate Date,
	userId bigint,
	issueId bigint
);

create table public.t_issue(
	id bigint not null,
	createDate Date,
	scheduledDate Date,
	subject varchar(max),
	body varchar(max),
	closed int
);


alter table public.t_user add constraint public.t_user_constraint_1 primary key(id);
alter table public.t_branch add constraint public.t_branch_constraint_1 primary key(id);
alter table public.t_actionType add constraint public.t_actionType_constraint_1 primary key(id);
alter table public.t_issueAction add constraint public.t_issueAction_constraint_1 primary key(id);
alter table public.t_issueMessage add constraint public.t_issueMessage_constraint_1 primary key(id);
alter table public.t_issue add constraint public.t_issue_constraint_1 primary key(id);

alter table public.t_user add constraint public.constraint_fk1 foreign key(branchId) references public.t_branch(id);
alter table public.t_issueAction add constraint public.constraint_fk2 foreign key(userId) references public.t_user(id);
alter table public.t_issueAction add constraint public.constraint_fk3 foreign key(issueId) references public.t_issue(id);
alter table public.t_issueAction add constraint public.constraint_fk4 foreign key(actionTypeId) references public.t_actionType(id);
alter table public.t_issueMessage add constraint public.constraint_fk5 foreign key(userId) references public.t_user(id);
alter table public.t_issueMessage add constraint public.constraint_fk6 foreign key(issueId) references public.t_issue(id);

create sequence public.issueTracker_sequence start with 100;