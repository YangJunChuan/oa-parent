package com.yjcxyx.oa.auth.service.impl;

import com.yjcxyx.oa.auth.mapper.AuthorizationMapper;
import com.yjcxyx.oa.auth.model.Authorization;
import com.yjcxyx.oa.auth.service.AuthorizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("authorizationService")  
public class AuthorizationServiceImpl implements AuthorizationService {

	@Autowired
	private AuthorizationMapper authorizationMapper;
	
	public void authorize(Authorization auth) {
		authorizationMapper.authorize(auth); 
	}

	public void unauthorize(Long id) {
		authorizationMapper.unauthorize(id); 
	}

	public Authorization findById(Long id) {
		return authorizationMapper.findById(id);
	}

}
