package com.study.mybatis.member.sevice;

import com.study.mybatis.member.vo.Member;

public interface MemberService {
	/* public abstract */int checkId(String userId);   // interface는 무조건 public/static을 붙여야 함. 상수만 만들 수 있게 때문에 
	
	int insertMember(Member m);
}
