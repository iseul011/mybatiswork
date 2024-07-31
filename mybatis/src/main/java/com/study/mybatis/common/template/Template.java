package com.study.mybatis.common.template;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession; // ibatis(이전버전) => mybatis로 변경됨
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Template {
	public static SqlSession getSqlSession() {  // public static을 사용하면 객체 생성을 하지 않아도 됨
		SqlSession sqlSession = null;
		
		// SqlSession을 생성하기 위해 => SqlSessionFactory 필요
		// SqlSessionFactory => SqlSessionFactoryBuilder 필요
		
		String resource = "/mybatis-config.xml";
		
		
		try {
			InputStream stream = Resources.getResourceAsStream(resource);  // resource는 여기 있다는 것을 알려줌
			sqlSession = new SqlSessionFactoryBuilder().build(stream).openSession(false); 
			// openSession() : 자동커밋의 여부
			//				   false(기본값) => 개발자가 commit해줌
			//				   true => 자동커밋
			// mybatis-config.xml에 type도 JDBC에서 ??로 바꾸면 자동으로 commit
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sqlSession;
	}
}
