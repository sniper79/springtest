/**  
 * @Title: Maintest.java 
 * @Package com.jiangkai.test.SpringMavenTest 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author jiangkai  
 * @date 2017年11月7日 下午3:16:38 
 * @version V1.0  
 */
package com.jiangkai.test.SpringMavenTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.jiangkai.test.SpringMavenTest.beans.Person;

/**
 * @ClassName: Maintest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author jiangkai
 * @date 2017年11月7日 下午3:16:38
 */

public class Maintest {
	private static Logger log = LoggerFactory.getLogger(Maintest.class);

	/**
	 * @Title: main @Description: TODO(这里用一句话描述这个方法的作用)
	 * @author jiangkai @date 2017年11月7日 下午3:16:38
	 * @param @param
	 *            args 设定文件
	 * @return void 返回类型 @throws
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new FileSystemXmlApplicationContext("/src/main/sourse/spring.xml");
		Person person1 = (Person) ctx.getBean("person");
		person1.setName("kkk");
		Person person2 = (Person) ctx.getBean("person");
		
		System.out.println(person1 == person2);
		log.error("person2.getName():"+person2.getName());

	}

}
