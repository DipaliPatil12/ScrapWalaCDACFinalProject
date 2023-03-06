package ScrapWala.ScrapWala.entities;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "users")
public class User {
	@Id
	@Column
	private long id;
	
	@Column
	private String userName;
	
	@Column
	private String mobileNumber;
	
	@Column
	private String pincode;
	
	@Column
	private String email;
	
	@OneToOne (mappedBy = "user") 
	private Login login;//it does not create column in user table 
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	@JsonBackReference(value = "user-movement")
	private List<Admin> admins;
	
//	@ManyToOne( mappedBy = "user")
//	@JsonBackReference 
//	private ScrapProduct ScrapProduct;
	
//	@ManyToOne //(cascade=CascadeType.ALL)  
//	private ScrapProduct scrapProduct;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
		System.out.println("hello");
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public User(long id, String userName, String mobileNumber, String pincode, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.mobileNumber = mobileNumber;
		this.pincode = pincode;
		this.email = email;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", mobileNumber=" + mobileNumber + ", pincode=" + pincode
				+ ", email=" + email + "]";
	}
	
}
