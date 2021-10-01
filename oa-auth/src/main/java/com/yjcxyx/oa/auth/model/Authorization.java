package com.yjcxyx.oa.auth.model;

import lombok.Data;

/**
 * 授权实体类
 * @author yang
 *
 */
@Data
public class Authorization {

	private Long id;
	private Long employeeId;
	private Long roleId;
	
}
