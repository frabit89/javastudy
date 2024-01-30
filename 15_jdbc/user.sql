DROP TABLE USER_T cascade constraints;
CREATE TABLE USER_T (
    USER_NO         NUMBER                NOT NULL,
    USER_NAME       VARCHAR2(100 BYTE),
    USER_TEL        VARCHAR2(100 BYTE),
    JOIN_DT         VARCHAR2(10 BYTE),
    CONSTRAINT      PK_USER         PRIMARY KEY(USER_NO)
);

DROP SEQUENCE USER_SEQ;

CREATE SEQUENCE USER_SEQ NOCACHE;


--insert into user_t (User_no, User_name, user_tel, JOin_dt) values (USER_SEQ.NEXTVAL,"test",010-5345-2859,'2024-01-30');


SELECT * FROM USER_T;