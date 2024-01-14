package searchengine;

public class Address {
   private String street;
   private String city;
@Override
public String toString() {
	return "Address [street=" + street + ", city=" + city + "]";
}
public String getCity() {
	return city;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public void setCity(String city) {
	this.city = city;
}
}
