package com.spring.service;

import java.sql.SQLException;

import com.jsp.dto.MemberVO;
import com.spring.dao.MemberDAO;

public class MemberServiceImpl implements MemberService {


	private MemberDAO memberDAO;
	public void setMemberDAO(MemberDAO memberDAO){
		this.memberDAO = memberDAO;
	}
	
	
	@Override
	public MemberVO getMember(String id) throws SQLException {
		MemberVO member = memberDAO.selectMemberById(id);
		return member;
	}

}
