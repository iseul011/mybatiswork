package com.study.mybatis.board.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.study.mybatis.board.vo.Board;
import com.study.mybatis.board.vo.PageInfo;
import com.study.mybatis.board.vo.Reply;

public class BoardDao {

	public int selectTotalRecord(SqlSession sqlSession) {
		return sqlSession.selectOne("boardMapper.selectTotalRecord");
	}

	public ArrayList<Board> selectList(SqlSession sqlSession, PageInfo pi) {
		// 마이바티스에서 페이징처리를 위해 RowBounds라는 클래스 제공
		// offset(몇 개를 건너뜀) : 몇 개의 게시글(레코드)를 건너뛰고 조회할 건지에 대한 값
		/*
		 ex) numPerPage : 5
		 						offset(건너뛸숫자)		limit(조회할숫자. 갯수)
		 nowPage : 1	 1~ 5	 	  0					  5
		 nowPage : 2	 6~10		  5					  5
		 nowPage : 3	 11~15	 	  10				  5
		 
		 */
		
		int limit = pi.getNumPerPage();
		int offset = (pi.getNowPage()-1)*limit;    // 처음은 0이기 때문에 -1를 해주는 것
		RowBounds rowBounds = new RowBounds(offset, limit);
		
		return (ArrayList)sqlSession.selectList("boardMapper.selectList", null, rowBounds);  // Object Parameter은 건너뛰고 statement와 rowBounds를 쓰기 위해 parameter에 null을 넣음 
	}
	
	public int increaseCount(SqlSession sqlSession, int boardNo) {
		return sqlSession.update("boardMapper.increaseCount", boardNo);
	}
	
	public Board selectBoard(SqlSession sqlSession, int boardNo) {
		return sqlSession.selectOne("boardMapper.selectBoard", boardNo);
	}

	public ArrayList<Reply> selectReplyList(SqlSession sqlSession, int boardNo) {
		return (ArrayList)sqlSession.selectList("boardMapper.selectReplyList", boardNo);
	}

	public int selectSearchCount(SqlSession sqlSession, HashMap<String, String> map) {
		return sqlSession.selectOne("boardMapper.selectSearchCount", map);
	}

	public ArrayList<Board> selectSearchList(SqlSession sqlSession, HashMap<String, String> map, PageInfo pi) {
		int limit = pi.getNumPerPage();
		int offset = (pi.getNowPage()-1)*limit;  
		RowBounds rowBounds = new RowBounds(offset, limit);
		
		return (ArrayList)sqlSession.selectList("boardMapper.selectSearchList", map, rowBounds);
	}

	

	
	

}
