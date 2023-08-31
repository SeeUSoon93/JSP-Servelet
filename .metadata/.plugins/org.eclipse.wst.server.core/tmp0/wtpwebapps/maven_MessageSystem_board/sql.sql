-- 1-1. ȸ�������� ������ ������ �� �ִ� 'web_member'���̺��� ����ÿ�.
--    �÷��� : email(pk) / pw / tel / address
-- 	  ������Ÿ�� : varchar2(100)

CREATE TABLE WEB_MEMBER(
    EMAIL VARCHAR2(100) PRIMARY KEY,    
    PW VARCHAR2(100) NOT NULL,
    TEL VARCHAR2(100) NOT NULL,
    ADDRESS VARCHAR2(100) NOT NULL
);

-- 1-2. test�� �ֱ�

INSERT INTO web_member VALUES('rlarnstns@gmail.com','1234','010-2035-2101','��������');

-- 1-3. test�� ��ȸ�ϱ�

select * from web_member;


-- 2-1. �޽��� ������ ������ �� �ִ� 'web_message'���̺��� ����ÿ�.
-- �÷��� : num(pk)/ sendName / receiveEmail / message/ m_date
-- ������Ÿ�� : number / varchar2(100) / date

CREATE TABLE WEB_MESSAGE(
    NUM NUMBER PRIMARY KEY,    
    SENDNAME VARCHAR2(100) NOT NULL,
    RECEIVEEMAIL VARCHAR2(100) NOT NULL,
    MESSAGE VARCHAR2(100) NOT NULL,
    M_DATE DATE NOT NULL
);


-- 2-2. num�� �Է��� ������ ���� : num_message
CREATE SEQUENCE num_message
       INCREMENT BY 1
       START WITH 1
       MINVALUE 1
       MAXVALUE 9999;
-- 2-3. test�� �ֱ�

-- 2-4. test�� ��ȸ�ϱ�
SELECT * FROM WEB_MESSAGE;


-- 3-1. �Խñ� ������ ������ �� �ִ� 'web_board' ���̺��� ����ÿ�
-- �÷��� : num(pk)/ title / writer/ filename / content / b_date
-- ������Ÿ�� : number / varchar2(100) / date

-- 3-2. num�� �Է��� ������ ���� : num_board

-- 3-3. test�� �ֱ�

-- 3-4. test�� ��ȸ�ϱ�






