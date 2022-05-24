package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//select Userobj from Student Userobj where stuobj.user='Sanu';
public interface UserRepo extends JpaRepository<User, String> {
	@Query("select userobj from User userobj where userobj.username=?1")
	public User findByName(String name);
}
