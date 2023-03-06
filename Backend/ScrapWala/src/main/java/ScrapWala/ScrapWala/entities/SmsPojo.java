 package ScrapWala.ScrapWala.entities;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SmsPojo {
	private String phoneNumber;

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

//	public String getPhoneNumber() {
//		System.out.println("set");
//		return phoneNumber;
//	}

//	public void setPhoneNumber(String phoneNumber) {
//		this.phoneNumber = phoneNumber;
//		System.out.println("get");
//		System.out.println(phoneNumber);
//	}
	
}
