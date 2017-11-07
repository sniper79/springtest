/**  
 * @Title: Person.java 
 * @Package com.jiangkai.test.SpringMavenTest.beans 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author jiangkai  
 * @date 2017年11月7日 下午3:15:16 
 * @version V1.0  
 */ 
package com.jiangkai.test.SpringMavenTest.beans;

/** 
 * @ClassName: Person 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author jiangkai 
 * @date 2017年11月7日 下午3:15:16  
 */

public class Person {
private String name;
private int age;
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the age
 */
public int getAge() {
	return age;
}
/**
 * @param age the age to set
 */
public void setAge(int age) {
	this.age = age;
}
}
