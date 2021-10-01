package com.yjcxyx.oa.auth.mapper;

import com.yjcxyx.oa.auth.model.Authorization;

/**
 * @author jcyang
 */
public interface AuthorizationMapper {
	/**
	 * 授权
	 * @param auth 权限对象
	 */
	public void authorize(Authorization auth);

	/**
	 * 解除授权
	 * @param id id
	 */
	public void unauthorize(Long id);
	
	
	public Authorization findById(Long id);
	
}
