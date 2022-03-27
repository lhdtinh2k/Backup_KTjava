package fpt.fa.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Student")
public class Student {
	@Id
	@Pattern(regexp = "SV*[0-9]{4}$")
	private String id;
	
	@Column(columnDefinition = "nvarchar(50)", nullable = true)
	@Length(min = 4, message = "error.name")
	private String name;

	@Min(value = 18, message = "Tuổi không được nhỏ hơn {value}")
	private int age;
	
	@Column(columnDefinition = "nvarchar(100)")
	private String address;
	
	@DateTimeFormat(pattern = "mm/dd/yyyy")
	private Date birthday;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String id, String name, int age, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + ", birthday="
				+ birthday + "]";
	}
}
