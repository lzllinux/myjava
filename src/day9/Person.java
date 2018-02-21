package day9;

import java.io.Serializable;
import java.util.List;

public class Person implements Serializable{
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String gender;
	private transient List<String> otherInof; 
	public Person()
	{
		
	}
	public Person(String name, int age, String gender, List<String> otherInof) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.otherInof = otherInof;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<String> getOtherInof() {
		return otherInof;
	}
	public void setOtherInof(List<String> otherInof) {
		this.otherInof = otherInof;
	}
	
	public String toString()
	{
		return name+","+age+","+gender+","+otherInof;
		
	}
	


}
