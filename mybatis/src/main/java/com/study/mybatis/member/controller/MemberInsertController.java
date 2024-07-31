package com.study.mybatis.member.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.study.mybatis.member.vo.Member;

public class MemberInsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		/*
		Member m = new Member();
		m.setUserId(request.getParameter("userId"));
		m.setUserPwd(request.getParameter("userPwd"));
		m.setUserName(request.getParameter("userName"));
		m.setEmail(request.getParameter("email"));
		m.setBirthday(request.getParameter("birthday"));
		m.setGender(request.getParameter("gender"));
		m.setPhone(request.getParameter("phone"));
		m.setAddress(request.getParameter("address"));
		*/
		
		// Member클래스에 생성자가 있어야 함
		Member m = new Member(request.getParameter("userId"),
							  request.getParameter("userPwd"),
							  request.getParameter("userPwd"),
							  request.getParameter("userName"),
							  request.getParameter("email"),
							  request.getParameter("birthday"),
							  request.getParameter("gender"),
							  request.getParameter("phone"),
							  request.getParameter("address")
							);
	}

}
