package com.test;

public class MemberService {
	      Boolean login(String id, String password) {
	        if(id.equals("hong") && password.equals(password)) {
	            return true;
	        } else {
	            return false;
	        }
	    }

	    void logout(String id) {
	        System.out.println(id + "님이 로그아웃 되었습니다.");
	    }

}
