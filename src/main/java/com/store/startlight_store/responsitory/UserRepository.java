package com.store.startlight_store.responsitory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.store.startlight_store.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{
	Page<User> findAll(Pageable pageable);
	
	@Query("select u from User u where userName = :uname")//Truy vấn vào cơ sở dữ liệu (TEn entities nhe)
	User findByUsername(@Param("uname") String userName); 
}
