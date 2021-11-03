CREATE DATABASE IF NOT EXISTS todoes;

/*-------------Security------------------*/
CREATE TABLE users
(
    id                 BIGINT       NOT NULL,
    name               VARCHAR(45)  NOT NULL,
    password           VARCHAR(128) NOT NULL,
    enabled            VARCHAR(45)  NOT NULL

);


CREATE TABLE roles
(
    id                  INT NOT NULL,
    name                VARCHAR(30) NOT NULL
);

CREATE TABLE user_role
(
    id                  BIGINT NOT NULL ,
    user_id             BIGINT NOT NULL ,
    role_id             INT NOT NULL
);

CREATE TABLE notes
(
    id                    BIGINT NOT NULL ,
    name                  VARCHAR(50) NOT NULL ,
    text                  TEXT,
    date                  DATE NOT NULL ,
    complete              BIT NOT NULL ,
    group_id              BIGINT NOT NULL
);

CREATE TABLE notes_group
(
    id                    BIGINT NOT NULL ,
    name                  varchar(50) NOT NULL ,
    date                  DATE NOT NULL ,
    note_id               BIGINT NOT NULL
);

CREATE TABLE notes_list
(
    id                    BIGINT NOT NULL ,
    name                  varchar(50) NOT NULL ,
    date                  DATE NOT NULL ,
    user_id               BIGINT NOT NULL
);


alter table users add constraint USERS_PK primary key (id);
alter table users add constraint USER_UK unique (name);

alter table roles add constraint ROLES_PK primary key (id);
alter table roles add constraint ROLES_UK unique (name);

alter table user_role add constraint USER_ROLE_PK primary key (id);
alter table user_role add constraint USER_ROLE_UK unique (user_id, role_id);
alter table user_role add constraint USER_ROLE_FK1 foreign key (user_id) references users(id);
alter table user_role add constraint USER_ROLE_FK2 foreign key (role_id) references roles(id);

alter table notes add constraint NOTES_PK primary key (id);
alter table notes_group add constraint GROUPS_PK primary key (id);
alter table notes_list add constraint NOTES_LIST_PK primary key (id);

alter table notes add constraint NOTES_FK foreign key (group_id) references notes_group(id);
alter table notes_group add constraint GROUPS_FK foreign key (note_id) references notes_list(id);
alter table notes_list add constraint NOTES_LIST_FK foreign key (user_id) references users(id);
