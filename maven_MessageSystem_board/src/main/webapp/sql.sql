-- 1-1. 회원가입한 정보를 저장할 수 있는 'web_member'테이블을 만드시오.
--    컬럼명 : email(pk) / pw / tel / address
-- 	  데이터타입 : varchar2(100)

CREATE TABLE WEB_MEMBER(
    EMAIL VARCHAR2(100) PRIMARY KEY,    
    PW VARCHAR2(100) NOT NULL,
    TEL VARCHAR2(100) NOT NULL,
    ADDRESS VARCHAR2(100) NOT NULL
);

-- 1-2. test값 넣기

INSERT INTO web_member VALUES('rlarnstns@gmail.com','1234','010-2035-2101','내마음속');

-- 1-3. test값 조회하기

select * from web_member;


-- 2-1. 메시지 정보를 저장할 수 있는 'web_message'테이블을 만드시오.
-- 컬럼명 : num(pk)/ sendName / receiveEmail / message/ m_date
-- 데이터타입 : number / varchar2(100) / date

CREATE TABLE WEB_MESSAGE(
    NUM NUMBER PRIMARY KEY,    
    SENDNAME VARCHAR2(100) NOT NULL,
    RECEIVEEMAIL VARCHAR2(100) NOT NULL,
    MESSAGE VARCHAR2(100) NOT NULL,
    M_DATE DATE NOT NULL
);


-- 2-2. num에 입력할 시퀀스 생성 : num_message
CREATE SEQUENCE num_message
       INCREMENT BY 1
       START WITH 1
       MINVALUE 1
       MAXVALUE 9999;
-- 2-3. test값 넣기

-- 2-4. test값 조회하기
SELECT * FROM WEB_MESSAGE;


-- 3-1. 게시글 정보를 저장할 수 있는 'web_board' 테이블을 만드시오
-- 컬럼명 : num(pk)/ title / writer/ filename / content / b_date
-- 데이터타입 : number / varchar2(100) / date

-- 3-2. num에 입력할 시퀀스 생성 : num_board

-- 3-3. test값 넣기

-- 3-4. test값 조회하기






