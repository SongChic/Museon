package com.museon.Interface;

import java.util.List;
import java.util.Map;

import com.museon.Model.User;

public interface UserServiceBean {
	public List<Map<String, Object>> test ();
	public int idCheck ( String userId );
	public int emailCheck ( String userEmail );
	public int signUpProcess ( User user );
}
