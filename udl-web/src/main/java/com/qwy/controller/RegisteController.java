package com.qwy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qwy.pojo.User;
import com.qwy.service.UserService;

/**
 * <p>
 * Title: RegisteController
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Company: CodeChewer
 * </p>
 * 
 * @author AdamQwy
 * @date 2017年6月26日 下午6:46:28
 */
@Controller
public class RegisteController {

	@Autowired
	private UserService userServiceImpl;
	
	
	@RequestMapping("/user/reg")
	public String reg(User user){
		if(!StringUtils.isEmpty(user.getName())){
			userServiceImpl.registe(user);
		}
		return "reg";
	}
}
