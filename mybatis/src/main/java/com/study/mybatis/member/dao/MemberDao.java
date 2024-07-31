package com.study.mybatis.member.dao;

import org.apache.ibatis.session.SqlSession;

public class MemberDao {
	public int checkId(SqlSession sqlSession, String userId) {
		return sqlSession.selectOne("memberMapper.checkId", userId);
	}
	
	public int insertMember(SqlSession sqlSession, Member m) {
		
		return sqlSession.insert("memberMapper.insertMember", m);  // .insert()로 정해져 있음
	}
}