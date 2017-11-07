/**  
 * @Title: Test1Controller.java 
 * @Package com.jiangkai.test.SpringMavenTest.controller 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author jiangkai  
 * @date 2017年11月7日 下午4:38:42 
 * @version V1.0  
 */ 
package com.jiangkai.test.SpringMavenTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/** 
 * @ClassName: Test1Controller 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author jiangkai 
 * @date 2017年11月7日 下午4:38:42  
 */

	@Controller  
	public class Test1Controller {  
	    @RequestMapping(value="/Hello")  
	    public String HelloWorld(Model model){  
	        model.addAttribute("message","Hello World!!!");  
	        return "HelloWorld";  
	    }  
	}
