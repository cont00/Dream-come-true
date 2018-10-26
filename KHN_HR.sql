CREATE TABLE STUDENT_INFO (
    STU_INDEX INTEGER,
    NAME VARCHAR(30),
    KOR NUMBER,
    ENG NUMBER,
    MATH NUMBER,
    GENDER VARCHAR(10),
    RAMARK VARCHAR(200),
    CONSTRAINT PK_STUDENT PRIMARY KEY(STU_INDEX)
);

INSERT INTO STUDENT_INFO
(STU_INDEX, NAME, KOR, ENG, MATH, GENDER, RAMARK)
VALUES
(STUDENT_INFO_KEY.NEXTVAL,'김현노',100,100,100,'남자','게임을 좋아함');
(STUDENT_INFO_KEY.NEXTVAL,'김동욱',100,90,95,'남자','게임을 좋아함');

--조회
SELECT * FROM STUDENT_INFO;

SELECT * FROM STUDENT_INFO
ORDER BY STU_INDEX ASC;

--수정
UPDATE STUDENT_INFO
SET NAME = 'KHM', KOR = 95, ENG = 90, MATH = 80, GENDER = '남자', RAMARK = '워킹홀리데이 다녀옴'
WHERE STU_INDEX = 2;

--삭제
DELETE STUDENT_INFO
WHERE;

DROP TABLE STUDENT_INFO;

--저장(삽입)
INSERT INTO STUDENT_INFO
VALUES('김현노',90,90,100,'남자','비고란');

COMMIT;

ALTER TABLE STUDENT_INFO ADD COLUMN INDEX PRIMARY KER;

INSERT INFO STUDENT_INFO
0

CREATE SEQUENCE STUDENT_INFO_KEY
    START WITH 0
    INCREMENT BY 1
    MAXVALUE 100000
    MINVALUE 0;

SELECT STUDENT_INFO_KEY.NEXTVAL FROM DUAL;
SELECT STUDENT_INFO_KEY.CURRVAL FROM DUAL;


--------------------------------------------------------------------------------------------------------------------------------

CREATE TABLE MEMBER (
  MEMBER_IDX NUMBER(30) NOT NULL,
  ID VARCHAR2(20) NULL,
  PW VARCHAR2(30) NULL,
  CONSTRAINT MEMBER_PK PRIMARY KEY (MEMBER_IDX)
);

SELECT * FROM MEMBER;
INSERT INTO MEMBER VALUES(0, 'cont00', '1234');
INSERT INTO MEMBER VALUES(1, 'bdg99466', '1234');
INSERT INTO MEMBER VALUES(2, 'kay1878', '1234');

SELECT * FROM MEMBER
WHERE ID='cont00';

SELECT * FROM MEMBER
WHERE ID='cont00';

SELECT * FROM MEMBER
WHERE ID='cont00' AND PW='1234';

SELECT * FROM MEMBER
WHERE ID='cont00' AND PW = '1234';

DROP TABLE MEMBER;

ALTER TABLE MEMBER ADD NAME VARCHAR2(30);
ALTER TABLE MEMBER ADD CNAME VARCHAR2(50);
ALTER TABLE MEMBER ADD SEX VARCHAR2(20);
ALTER TABLE MEMBER ADD ADDRESS VARCHAR2(150);
ALTER TABLE MEMBER ADD EMAIL VARCHAR2(50);
ALTER TABLE MEMBER ADD LANGUAGE VARCHAR2(100);

INSERT INTO MEMBER
(MEMBER_IDX, ID, PW, NAME, CNAME, SEX, ADDRESS, EMAIL, LANGUAGE)
VALUES
(3, 'kay1878', '1234', 'KHN', '더블스칼렛', '남자', '대구광역시 동구 동대구로', 'cont00@naver.com', 'Japanese');

SELECT MAX(MEMBER_IDX)+1 FROM MEMBER;

UPDATE MEMBER
SET ID='cont00', PW='1234', NAME='Kim HyunNo', CNAME='DoubleScarlet', SEX='남자', ADDRESS='대구광역시 동구', EMAIL='cont00@naver.com', LANGUAGE='Korean, Japanese'
WHERE ID='cont00';

SELECT * FROM MEMBER
WHERE ROWNUM < 4
ORDER BY MEMBER_IDX DESC;

CREATE TABLE FREEBOARD (
    FREEBOARD_IDX NUMBER(10) NOT NULL,
    TITLE VARCHAR2(50) NULL,
    CNAME VARCHAR2(50) NULL,
    CONTENT VARCHAR2(300) NULL,
    WRITETIME DATE DEFAULT SYSDATE,
    GROUP_IDX NUMBER(10) NOT NULL,
    GROUP_IDX_FK NUMBER(10),
    LEVEL_IDX NUMBER(10),
    CONSTRAINT FREEBOARD_PK PRIMARY KEY (FREEBOARD_IDX)
);

DROP TABLE FREEBOARD

SELECT * FROM FREEBOARD;

INSERT INTO FREEBOARD
VALUES (1, 'VRChat에 어서오세요', 'DoubleScarlet', '안녕하세요 DoubleScarlet입니다. 잘부탁드립니다.', SYSDATE);
INSERT INTO FREEBOARD
VALUES (2, 'VRChat의 좋은 점 !', 'DoubleScarlet', '다양한 외국인들과 대화를 나누고 친분을 다질 수 있습니다.', SYSDATE);
INSERT INTO FREEBOARD
VALUES (3, 'VRChat의 안좋은 점', 'DoubleScarlet', '각종 다양한 악성향의 유저들을 만날 수 있습니다.', SYSDATE);

SELECT * FROM FREEBOARD WHERE ROWNUM < 4 ORDER BY FREEBOARD_IDX DESC;

INSERT INTO FREEBOARD (FREEBOARD_IDX, TITLE, CNAME, CONTENT, WRITETIME, GROUP_IDX, GROUP_IDX_FK, LEVEL_IDX)
VALUES( (SELECT NVL( MAX(FREEBOARD_IDX) + 1, 0) FROM FREEBOARD ), 'hello, Doublescarlet', 'DoubleScarlet', 'VRChat', SYSDATE, ( SELECT NVL ( MAX(GROUP_IDX) + 1, 0) FROM FREEBOARD ), 0, 0)
INSERT INTO FREEBOARD (FREEBOARD_IDX, TITLE, CNAME, CONTENT, WRITETIME, GROUP_IDX, GROUP_IDX_FK, LEVEL_IDX)
VALUES( (SELECT NVL( MAX(FREEBOARD_IDX) + 1, 0) FROM FREEBOARD ), 'Hi, Doublescarlet', 'DoubleScarlet', 'VRChat', SYSDATE, ( SELECT NVL ( MAX(GROUP_IDX) + 1, 0) FROM FREEBOARD ), 0, 0)
INSERT INTO FREEBOARD (FREEBOARD_IDX, TITLE, CNAME, CONTENT, WRITETIME, GROUP_IDX, GROUP_IDX_FK, LEVEL_IDX)
VALUES( (SELECT NVL( MAX(FREEBOARD_IDX) + 1, 0) FROM FREEBOARD ), 'Bye, Doublescarlet', 'DoubleScarlet', 'VRChat', SYSDATE, ( SELECT NVL ( MAX(GROUP_IDX) + 1, 0) FROM FREEBOARD ), 0, 0)
INSERT INTO FREEBOARD (FREEBOARD_IDX, TITLE, CNAME, CONTENT, WRITETIME, GROUP_IDX, GROUP_IDX_FK, LEVEL_IDX)
VALUES( (SELECT NVL( MAX(FREEBOARD_IDX) + 1, 0) FROM FREEBOARD ), 'Bye Bye', 'ScarletDevil', 'VRChat', SYSDATE, 0, 1, 1)
INSERT INTO FREEBOARD (FREEBOARD_IDX, TITLE, CNAME, CONTENT, WRITETIME, GROUP_IDX, GROUP_IDX_FK, LEVEL_IDX)
VALUES( (SELECT NVL( MAX(FREEBOARD_IDX) + 1, 0) FROM FREEBOARD ), 'Bye !', 'Scarlet', 'VRChat', SYSDATE, 0, 2, 2)

INSERT INTO FREEBOARD (FREEBOARD_IDX, TITLE, CNAME, CONTENT, WRITETIME, GROUP_IDX, GROUP_IDX_FK, LEVEL_IDX)
VALUES (
( SELECT NVL( MAX(FREEBOARD_IDX) + 1, 0 ) FROM FREEBOARD ), 'Bye !', 'Scarlet', 'VRChat', SYSDATE,
( SELECT VAL( MAX ( GROUP_IDX ) + 1, 0 ) FROM FREEBOARD ),
( SELECT MAX ( GROUP_IDX_FK ) + 1 FROM FREEBOARD WHERE GROUP_IDX = 0 ),
( SELECT MAX ( LEVEL_IDX ) + 1 FROM FREEBOARD WHERE GROUP_IDX = 0 )
);

-- 새글 FROUP_IDX 새로 증가, GROUP_IDX_FK = 0, 0
-- 답글 GROUP_IDX 그 해당되는 글에 번호, GROUP_IDX_FK 1증가, 새글, 답글인지에 따라서 그 글에 레벨이 넘어와서 1 증가

UPDATE FREEBOARD
SET TITLE='Hello, DoubleScarlet', CNAME='DoubleScarlet', CONTENT='VRChat', SYSDATE
WHERE FREEBOARD_IDX='4';

ALTER TABLE FREEBOARD ADD FREEBOARD_IDX_FK NUMBER(10);

INSERT INTO FREEBOARD
VALUES((SELECT MAX(FREEBOARD_IDX) + 1 FROM FREEBOARD), 'hello, Doublescarlet...', 'DoubleScarlet', 'VRChat...', SYSDATE, 1)

SELECT * FROM FREEBOARD ORDER BY GROUP_IDX DESC, GROUP_IDX_FK ASC;

DELETE FROM FREEBOARD
WHERE FREEBOARD_IDX = '3'

COMMIT;