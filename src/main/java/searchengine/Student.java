package searchengine;

import java.util.Date;
import java.util.List;

public class Student {
  private String name;
  private long id;
  private Date date;
  private  Address address;
  public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
List<String> course;
  private String gender;
  private String type;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public List<String> getCourse() {
	return course;
}
public void setCourse(List<String> course) {
	this.course = course;
}

public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
@Override
public String toString() {
	return "Student [name=" + name + ", id=" + id + ", date=" + date + ", address=" + address + ", course=" + course
			+ ", gender=" + gender + ", type=" + type + "]";
}
}
