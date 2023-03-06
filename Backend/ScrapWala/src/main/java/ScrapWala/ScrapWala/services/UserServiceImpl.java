package ScrapWala.ScrapWala.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ScrapWala.ScrapWala.dao.UserDao;
import ScrapWala.ScrapWala.entities.User;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao; //dependency injection
	//List<User> list;
	public UserServiceImpl()
	{
//		list=new ArrayList<>();
//		list.add(new User(1,"John","987456123","789654","john@gmail.com"));
//
//		list.add(new User(2,"Saniya","986356123","123654789","@gmail.com"));
	}
	
	
	
	@Override
	public List<User> getUsers() {
		
		return userDao.findAll();//takes from db create object ..add into list
	}



	@Override
	public User getUser(long userId) {
//		User u=null;
//		for(User user:list)
//		{
//			if(user.getId()==userId)
//			{
//				u=user;
//				break;
//			}
//		}
		//return u;
		return userDao.getOne(userId);
	}



	@Override
	public User addUser(User user) {

		//list.add(user);
		userDao.save(user);
		return user;
	}



	@Override
	public User updateUser(User user) {
//		list.forEach(e -> {
//			if(e.getId() == user.getId()) {
//				e.setUserName(user.getUserName());
//				e.setMobileNumber(user.getMobileNumber());
//				e.setPincode(user.getPincode());
//				e.setEmail(user.getEmail());
//			}
//		});
		//return user;
		
		userDao.save(user);
		return user;
	}



	@Override
	public void  deleteUser(long parseLong) {
		User entity = userDao.getOne(parseLong);
		userDao.delete(entity);
	}

}
