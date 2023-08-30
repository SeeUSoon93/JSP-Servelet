package com.smhrd.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.smhrd.db.SqlSessionManager;

public class MemberDAO {
	
	private SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();

	public int join(MemberDTO dto) {		
		SqlSession session = sqlSessionFactory.openSession(true);		
		int cnt = session.insert("com.smhrd.db.memberMapper.join",dto);		
		session.close();		
		return cnt;
	}

	public MemberDTO login(MemberDTO dto) {
		SqlSession session = sqlSessionFactory.openSession(true);		
		MemberDTO loginInfo = session.selectOne("com.smhrd.db.memberMapper.login",dto);		
		session.close();		
		return loginInfo;
	}
	
	public int update(MemberDTO dto) {
		SqlSession session = sqlSessionFactory.openSession(true);		
		int cnt = session.update("com.smhrd.db.memberMapper.update",dto);		
		session.close();		
		return cnt;
	}
	
	public List<MemberDTO> showMember() {
		SqlSession session = sqlSessionFactory.openSession(true);		
		ArrayList<MemberDTO> showMember = (ArrayList)session.selectList("com.smhrd.db.memberMapper.showMember");	
		session.close();		
		return showMember;
	}
	
	public int deleteMember(String email) {		
		SqlSession session = sqlSessionFactory.openSession(true);		
		int cnt = session.delete("com.smhrd.db.memberMapper.deleteMember", email);		
		session.close();		
		return cnt;
	}
	
	

}
