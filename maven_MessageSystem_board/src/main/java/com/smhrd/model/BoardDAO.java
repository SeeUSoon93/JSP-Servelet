package com.smhrd.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.smhrd.db.SqlSessionManager;

public class BoardDAO {
	
	private SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();
	
	// 게시글 작성
	public int boardWrite(BoardVO board) {
		SqlSession session = sqlSessionFactory.openSession(true);		
		int cnt = session.insert("com.smhrd.db.boardMapper.boardWrite",board);		
		session.close();		
		return cnt;
	}
	
	// 게시글 목록 조회
	public List<BoardVO> showBoard() {
		SqlSession session = sqlSessionFactory.openSession(true);		
		ArrayList<BoardVO> showBoard = (ArrayList)session.selectList("com.smhrd.db.boardMapper.showBoard");	
		session.close();		
		return showBoard;
	}
	
	public int deleteBoard(String num) {
		SqlSession session = sqlSessionFactory.openSession(true);		
		int cnt = session.delete("com.smhrd.db.boardMapper.deleteBoard", num);		
		session.close();		
		return cnt;		
	}
	
	// 게시글 상세 조회
	public BoardVO showText(int num) {
		SqlSession session = sqlSessionFactory.openSession(true);		
		BoardVO boardInfo = session.selectOne("com.smhrd.db.boardMapper.show",num);		
		session.close();		
		return boardInfo;
	}

}
