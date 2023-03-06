package ScrapWala.ScrapWala.services;

import java.util.List;

import ScrapWala.ScrapWala.entities.Admin;

public interface AdminService {

	public List<Admin> getAdmins();
	
	public Admin getAdmin(int adminId);
	
	public Admin addAdmin(Admin admin);
	
	public Admin updateAdmin(Admin admin);
	
	public void deleteAdmin(int adminId );
}
