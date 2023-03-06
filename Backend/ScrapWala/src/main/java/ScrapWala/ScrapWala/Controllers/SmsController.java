package ScrapWala.ScrapWala.Controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ScrapWala.ScrapWala.entities.SmsPojo;

@RestController
public class SmsController {
//	@RequestMapping("/welcome")
//	public String welcome()
//	{
//		String text = "this is private page";
//		text+= "this is not allowed to unauthonticate users";
//		return text;
//	}
	@PostMapping("/mobileNo")
	public String sendOtp(@RequestBody  SmsPojo sms) {
		try {
			System.out.println(sms.getPhoneNumber() );
			System.out.println("Why ");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return "Successfully OTP send to Your Mobile Number";
	}
}
