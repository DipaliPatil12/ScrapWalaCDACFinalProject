package ScrapWala.ScrapWala.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ScrapWala.ScrapWala.dao.AdminDao;
import ScrapWala.ScrapWala.entities.Admin;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminDao adminDao;
	
	

	public AdminServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Admin> getAdmins() {

		return adminDao.findAll();
	}


	@Override
	public Admin getAdmin(int adminId) {
		// TODO Auto-generated method stub
		return adminDao.getOne(adminId);
	}

	@Override
	public Admin addAdmin(Admin admin) {
		adminDao.save(admin);
		return admin;
	}

	@Override
	public Admin updateAdmin(Admin admin) {

		adminDao.save(admin);
		return admin;
	}

	@Override
	public void deleteAdmin(int temp) {
		Admin entity = adminDao.getOne(temp);
		adminDao.delete(entity);
	}




}
