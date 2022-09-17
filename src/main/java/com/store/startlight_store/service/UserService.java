package com.store.startlight_store.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.store.startlight_store.entities.Permission;
import com.store.startlight_store.entities.User;
import com.store.startlight_store.responsitory.UserRepository;

@Service

public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	
	public List<User>getUsers(){
		return userRepository.findAll();
	}
	
	public User getByUserName(String username) {
		return userRepository.findByUsername(username);
	}
	public User addUser(User user) {
		User userSaved = userRepository.save(user);
		return userSaved;
	}
	//Tra ve 1 user co id
	public User findUserById(Long id) {
		return userRepository.findById(id).get();
	}
	//Sau do update;
	public User updateUser(Long id, User user) {
		// lay ra user co id = Long id
		User user1 = findUserById(id);
		// SAu do lay cai name vua sua set cho cai name moi van giu nguyen cai id
		user1.setFirstName(user.getFirstName());
		//set cai lastname
		user1.setLastName(user.getLastName());
		//set cai email
		user1.setEmail(user.getEmail());
		// sau do save lai
		 return userRepository.save(user1);
	}
	//Delete User
	public void deleteUser(Long id) {
		 userRepository.deleteById(id);
	}
	//Pageable
	public Page<User> findAll(int pageNo, int pageSize,String sortField, String sortDirection){
		
		//sort
		Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ?
				Sort.by(sortField).ascending() :
				Sort.by(sortField).descending();
		//? la bieu thuc dieu kien, nguoc lai la sau dau :
		
		Pageable pageable = PageRequest.of(pageNo - 1, pageSize,sort);
		Page<User>pageUser = userRepository.findAll(pageable);
		return pageUser;
	}
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	private static final String DEFAULT_INITIAL_PASSWORD = "admin";
	
	public void createDefaultAdmin() throws Exception {
		// TODO create all groups and permissions
		String password = passwordEncoder.encode("123456");
		// creation of the super admin admin:admin)
		// tao permisson
		Permission adminPermission = new Permission();
		adminPermission.setName("ADMIN");
		//List<Permission> permissions = Arrays.asList(adminPermission);// tao 1 array list nhanh
		List<Permission> permissions = new ArrayList();
		permissions.add(adminPermission);
		
		// tao user
		User user = new User();
		user.setUserName("admin");
		user.setPassword(password);
		user.setEmail("admin@greenacedamy.com");
		user.setFirstName("Administrator");
		user.setLastName("User");
		user.setIsActive(true);
		user.setPermission(permissions);
		userRepository.save(user);
		}
	
	
}
