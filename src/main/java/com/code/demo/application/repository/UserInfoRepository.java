package com.code.demo.application.repository;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.code.demo.application.model.UserInfoPersistence;

@Repository
public interface  UserInfoRepository extends JpaRepository<UserInfoPersistence , Long>{
//	List<UserInfoPersistence> findAll();
	
	@Query(value="select * from spring.userinfo u where EMAIL = ?1 and PASSWORD = ?2 ", nativeQuery = true)
	List<UserInfoPersistence> findCheckMemberAccount(String email,String password);
	
	List<UserInfoPersistence> findByEmailAndPassword(String email,String password);
}