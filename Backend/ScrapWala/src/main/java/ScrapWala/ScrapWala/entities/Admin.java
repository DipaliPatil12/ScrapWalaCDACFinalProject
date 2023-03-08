package ScrapWala.ScrapWala.entities;

import java.time.LocalDate;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="admins")
public class Admin {

	@Id
	
	private int adminId;
	@Column
	private String adminName;
	@Column
	private String adminPassword;
	@Column
	private LocalDate adminLastLoggin;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	private User user;

	@OneToOne(mappedBy = "admin")
	private Login login;
	
	
	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public LocalDate getAdminLastLoggin() {
		return adminLastLoggin;
	}

	public void setAdminLastLoggin(LocalDate adminLastLoggin) {
		this.adminLastLoggin = adminLastLoggin;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Admin(int adminId, String adminName, String adminPassword, LocalDate adminLastLoggin, User user) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminPassword = adminPassword;
		this.adminLastLoggin = adminLastLoggin;
		this.user = user;
	}

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminPassword=" + adminPassword
				+ ", adminLastLoggin=" + adminLastLoggin + ", user=" + user + "]";
	}
	
	
	
	
}
